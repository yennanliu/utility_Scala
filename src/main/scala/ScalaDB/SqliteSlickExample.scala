package ScalaDB

// https://github.com/yashsriv/sqlite-slick/blob/master/src/main/scala/com/gmantra/example/SqliteSlickExample.scala

import scala.concurrent.ExecutionContext.Implicits.global

import slick.driver.SQLiteDriver.api._

class Movies(tag: Tag) extends Table[(String, String, String, String, String, String)](tag, "Movies") {
  def imdbID = column[String]("imdbID", O.PrimaryKey)
  def title = column[String]("Title")
  def year = column[String]("Year")
  def director = column[String]("Director")
  def actors = column[String]("Actors")
  def plot = column[String]("Plot")
  def * = (imdbID, title, year, director, actors, plot)
}

object SqliteSlickExample extends App {

  val movies = TableQuery[Movies]

  val db = Database.forConfig("movies")
  try {
    val setup = DBIO.seq(
      (movies.schema).create
    )
    val setupFuture = db.run(setup)
    println("Done")
    val q1 = for(m <- movies) yield m.title
    db.stream(q1.result).foreach(println)
    val insert = DBIO.seq(
      movies += ("tt1234567", "Foo", "1970", "Bar", "Meh, Hmm", "Hmmmmmmm")
    )
    val insertFuture = db.run(insert)
    insertFuture.onComplete( _ => db.stream(q1.result).foreach(println))
  } finally db.close
}
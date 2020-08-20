package ScalaBasic

// https://docs.scala-lang.org/tour/case-classes.html
// https://www.scala-exercises.org/scala_tutorial/classes_vs_case_classes 

object CaseClass extends App{

    // example 1 : Defining a case class
    case class Book(isbn: String)
    // no need to add "new"
    val scalaCookBook = Book("978-042342342423")

    println(scalaCookBook)

    // example 2 : Defining a case class
    case class Message(sender: String, recipient: String, body: String)
    // no need to add "new"
    val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

    println(message1.sender)  // prints guillaume@quebec.ca
    message1.sender = "travis@washington.us"  // this line does not compile

    // example 3 : Comparison
    case class Message(sender: String, recipient: String, body: String)
    val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val messagesAreTheSame = message2 == message3  // true

    // example 4 : Copy
    case class Message(sender: String, recipient: String, body: String)
    val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
    val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
    message5.sender  // travis@washington.us
    message5.recipient // claire@bourgogne.fr
    message5.body  // "Me zo o komz gant ma amezeg"

}
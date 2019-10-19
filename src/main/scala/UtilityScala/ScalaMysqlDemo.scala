import java.sql.{Connection,DriverManager}

object ScalaMysqlDemo extends App {
    // connect to the database named "mysql" on port 8889 of localhost
    val url = "jdbc:mysql://localhost:3306/mysql"
    val driver = "com.mysql.jdbc.Driver"
    val username = "mysql_user"
    val password = "0000"
    var connection:Connection = _
    try {
        Class.forName(driver)
        connection = DriverManager.getConnection(url, username, password)
        val statement = connection.createStatement
        val rs = statement.executeQuery("SELECT host, user FROM user")
        while (rs.next) {
            val host = rs.getString("host")
            val user = rs.getString("user")
            println("host = %s, user = %s".format(host,user))
        }
    } catch {
        case e: Exception => e.printStackTrace
    }
    connection.close
}
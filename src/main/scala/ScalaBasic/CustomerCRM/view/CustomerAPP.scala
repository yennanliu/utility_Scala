package ScalaBasic.CustomerCRM.view

import scala.io.StdIn

// https://www.youtube.com/watch?v=VERB8mC76L0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=177

/** app for running CustomerView, will call CustomerView */
object CustomerAPP extends App {
  // run the menu
  new CustomerView().Menu()
}

/**
 * CustomerView : for user interface, and user input
 *  1) show control panel (user interface)
 *  2) accept user input/request
 *  3) call other utils, layers for relative operations
 */
class CustomerView {
  var key = ' '
  // set up a loop var, for exit system or not
  var loop = true

  // show main menu
  def Menu(): Unit = {
    do {
      // menu content
      println()
      println("------------------ Customer CRM ------------------")
      println("                           1. Add Customer        ")
      println("                           2. Modify Customer     ")
      println("                           3. Delete Customer     ")
      println("                           4. Customer List       ")
      println("                           5. Exit                ")
      println("Please select (1-5):                              ")
      println()
      // accept user input
      key = StdIn.readChar()
      key match {  // pattern match key
        case '1' => println("1. Add Customer")
        case '2' => println("2. Modify Customer")
        case '3' => println("3. Delete Customer")
        case '4' => println("4. Customer List")
        case '5' => this.loop = false
      }
    } while (this.loop)
    println("exit the Customer CRM system")
  }

}

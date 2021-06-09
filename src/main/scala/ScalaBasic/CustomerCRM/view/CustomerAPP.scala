package ScalaBasic.CustomerCRM.view

import scala.io.StdIn

import scala.util.control.Breaks._

import ScalaBasic.CustomerCRM.service.CustomerService
import ScalaBasic.CustomerCRM.bean.Customer

// https://www.youtube.com/watch?v=VERB8mC76L0&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=177
// https://www.youtube.com/watch?v=DzxOcqC0gVs&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=179

/** app for running CustomerView, will call CustomerView */
object CustomerAPP extends App {
  // run the menu
  new CustomerView().Menu()
}

/**
 * CustomerView : for user interface, and user input
 * 1) show control panel (user interface)
 * 2) accept user input/request
 * 3) call other utils, layers for relative operations
 */
class CustomerView {
  var key = ' '

  // set up a loop var, for exit system or not
  var loop = true

  // set up CustomerService instance
  var customerService = new CustomerService

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
      key match { // pattern match key
        case '1' => this.add()
        case '2' => println("2. Modify Customer")
        case '3' => this.del()
        case '4' => this.list()
        case '5' => this.loop = false
      }
    } while (this.loop)
    println("exit the Customer CRM system")
  }

  // method shows customer information
  def list(): Unit = {
    println()
    println("------------------ Customer List ------------------")
    println("Id\t\tName\t\tGender\t\tAge\t\tTel\t\tEmail")
    val customers = customerService.list()
    for (customer <- customers) {
      // rewrite Customer's toString method
      println(customer)
    }
    println()
  }

  // method add new customer (CustomerAPP)
  def add(): Unit = {
    println()
    println("------------------ Add Customer ------------------")
    println("Name: ")
    val name = StdIn.readLine()
    println("Gender: ")
    val gender = StdIn.readChar()
    println("Age: ")
    val age = StdIn.readShort()
    println("Tel: ")
    val tel = StdIn.readLine()
    println("Email: ")
    val email = StdIn.readLine()

    // make Customer instance
    val customer = new Customer(name, gender, age, tel, email)

    // add customer
    if (this.customerService.add(customer)) {
      println("------------------ Add customer OK ------------------")
    } else {
      println("------------------ Add customer Failed ------------------")
    }
  }

  // method that delete customer (CustomerApp)
  def del(): Unit = {
    println()
    println("------------------ Delete Customer ------------------")
    println("Which customer id want to delete (exit : -1)")
    val id = StdIn.readInt()
    if (id == -1) {
      println("------------------ Abort ------------------")
      return
    }
    // need to verify if user really want to delete customer (press Y or N)
    var choice = ' '
    breakable {
      do {
        println("Confirm to delete ? (Y/N)")
        choice = StdIn.readChar().toLower
        if (choice == 'y' || choice == 'n') {
          // quit
          break()
        }
      } while (true)
    }
    // verify if user really want to delete
    if (choice == 'y') {
      if (this.customerService.del(id)) {
        println("------------------ Delete customer Success ! ------------------")
      } else {
        println("------------------ Delete customer Failed !  (id not exists) ------------------")
      }
    }

  }

}

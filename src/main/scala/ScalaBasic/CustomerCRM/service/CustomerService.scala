package ScalaBasic.CustomerCRM.service

// https://www.youtube.com/watch?v=DzxOcqC0gVs&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=179
// https://www.youtube.com/watch?v=Cqb77HzousA&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=181
// https://www.youtube.com/watch?v=0FbulIZuiFs&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=182

import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._
import ScalaBasic.CustomerCRM.bean.Customer

import scala.io.StdIn

/**
 * 1) For Customer list add/delete/modify
 * 2) has attr, collection for customer information storage
 */


class CustomerService {
  // for testing, we initialize a customer
  // NOTICE this : 'm' (since gender is Char type)
  val c1 = new Customer(1, "jim", 'm', 29, "12345", "jim@google.com")
  val c2 = new Customer(2, "Lynn", 'f', 17, "98745", "lynn@fb.com")
  val customers = ArrayBuffer[Customer](c1, c2)

  // attr
  // record total customer amount
  var customerNum = 1

  // method
  // return customer list
  def list(): ArrayBuffer[Customer] = {
    this.customers
  }

  // method add new customer (CustomerService) (notice : the customer has NO ID in this stage)
  def add(customer: Customer): Boolean = {
    customerNum += 1
    customer.id = customerNum
    // put customer into customers (ArrayBuffer)
    customers.append(customer)
    true
  }

  // method that find customer index
  def findIndex(id: Int): Int = {
    var index = -1
    breakable {
      for (i <- 0 until customers.length){
        if (customers(i).id == id){
          index = i
          break()
        }
      }
    }
    index
  }

  // method that delete customer (CustomerService)
  def del(id: Int): Boolean = {
    val index = findIndex(id)
    if (index != -1) {
      customers.remove(index)
      true
    } else {
      false
    }
  }

  // method that modify existing customer inform. (CustomerService)
  def modify(id: Int, customer: Customer): Boolean = {
    val index = findIndex(id)
    if (index != -1 || index < customers.length){
      customers(index) = customer
      true
    } else {
      false
    }
  }
}

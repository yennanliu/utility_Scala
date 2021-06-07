package ScalaBasic.CustomerCRM.service;

import ScalaBasic.CustomerCRM.bean.Customer

import scala.collection.mutable.ArrayBuffer

/**
 *  1) For Customer list add/delete/modify
 *  2) has attr, collection for customer information storage
 */


class CustomerService {
    // for testing, we initialize a customer
    // NOTICE this : 'm' (since gender is Char type)
    val customers = ArrayBuffer[Customer]( new Customer(1, "jim", 'm', 29, "12345", "jim@google.com") )

    // return customer list
    def list(): ArrayBuffer[Customer] = {
        this.customers
    }


}

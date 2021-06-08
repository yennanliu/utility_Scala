package ScalaBasic.CustomerCRM.service;

// https://www.youtube.com/watch?v=DzxOcqC0gVs&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=179

import scala.collection.mutable.ArrayBuffer

import ScalaBasic.CustomerCRM.bean.Customer

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

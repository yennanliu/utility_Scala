package ScalaBasic

// https://www.youtube.com/watch?v=mK_fkeyIvqw&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=23

object implicit_transformation_demo_2 extends App {

	// example 1 
	var n = 1 + 2.0
	println(n) // n is Dounle

	// example 2
	var n2:Long = 1L

	// var n3:Int = n2  // will get error, since we CAN NOT pass "low accuracy" var to "high accuracy"

	// example 3
	// Byte, Char, Short CAN NOT implcit transform from each other

	var n4:Byte = 1 
	// var c1 : Char = n1 // will get exception

}
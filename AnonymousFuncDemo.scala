object AnonymousFuncDemo{

	def main(args: Array[String]) {

		var result1= (a:Int, b:Int) => a+b  // anonymous func 1 
		var result2 = (_:Int) + (_:Int)     // anonymous func 2 
		var result3= (a:Int, b:Int) => a*b  // anonymous func 3 
		println(result1(10,20))
		println(result2(10,20))
		println(result3(10,20))

	}

}
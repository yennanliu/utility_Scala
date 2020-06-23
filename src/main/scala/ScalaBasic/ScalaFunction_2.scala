package ScalaBasic

object ScalaFunction_2{

    def main(args: Array[String]){

        // function with var with dynamic length
        def sum(args: Int*) = {

            var result = 0 
            for (arg <- args) result += arg
            // the last line in the Scala function 
            // will be the return value
            result
        }

        val s = sum(1,2,3,4,6)
        println(s)

        val s2 = sum(1,2,3)
        println(s2)

        println(sum(1,2,3,4,5,6,6))

        // input array as function variable
        val s3= sum(1 to 30: _*)
        println(s3)

    }
}
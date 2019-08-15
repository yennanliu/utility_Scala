object OperatorDemo {
   def main(args: Array[String]) {
      var a = 10;
      var b = 20;
      var c = 25;
      var d = 25;
      println("a + b = " + (a + b) );
      println("a - b = " + (a - b) );
      println("a * b = " + (a * b) );
      println("b / a = " + (b / a) );
      println("b % a = " + (b % a) );
      println("c % a = " + (c % a) );
      println("a == b = " + (a == b) );
      println("a != b = " + (a != b) );
      println("a > b = " + (a > b) );
      println("a < b = " + (a < b) );
      println("b >= a = " + (b >= a) );
      println("b <= a = " + (b <= a) );
      
      var f = true
      var g = false 
      println("f && g = " + (f && g) );
      println("f || g = " + (f||g) );
      println("!(f && g) = " + !(f && g) );
      
   }
}
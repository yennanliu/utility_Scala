object IfElseDemo {
   def main(args: Array[String]) {
      var x = 10;
      println ("x =" + x )
      if( x < 20 ){
         println(">>> x < 20");
      }
      else{
      	println(">>> x > 20");
      }

      var y = 30;
      println ("y =" + y )
      if ( y < 10 ){
      	println(">>> y < 10");
      }
      else if( y == 30){
      	println(">>> y = 30")
      }
      else if(y > 50){
      	println(">>> y > 50")
      }
      else{
      	print (">>> not sure the value of y")
      }
   }
}
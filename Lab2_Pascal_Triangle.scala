

object Lab2_Pascal_Triangle {
  def main(args:Array[String]){
    try{
      args(0).toInt
    }catch{
      case ex: java.lang.NumberFormatException =>{
        print(args(0) + " : invalid first argument - need natural numer greater than 2")
        System.exit(0)
      }
    }
    class PTRow(val n:Int){
      var array:Array[Int] = new Array[Int](n)
      
      def factorial(m: Int): Int = {
        if(m == 0){
        return(1)
        }
        else{
          return(m*factorial(m-1))
        }
      }
      
      def fill_row(){
        for(f <- 0 to array.length - 1){
        array(f) = factorial(n-1)/(factorial(f)*factorial((n-1)-f))
        }
      }
      def chose_num(){
        for(i <- 1 to args.length-1){
          try{
            var a_1 = args(i).toInt
            println(a_1 + " : " + array(a_1))
          }
          catch{
            case ex: java.lang.NumberFormatException =>{
            println(args(i) + " : argument has to be integer")
          }
          case ex: java.lang.IndexOutOfBoundsException =>{
            println(args(i) + " : index out of range")
          }
          }
        }
      }
    }
    /////// main
    val a_0 = args(0).toInt
    
    val test = new PTRow(a_0)
    test.fill_row()
    test.chose_num()
    
  }
}

import scala.collection.mutable.ListBuffer

object Lab2 {
  def main(args:Array[String]){
    
    var temp = 0
    
    // Try if first argument is integer
    try{
      args(0).toInt
    }catch{
      case ex: java.lang.NumberFormatException =>{
        print(args(0) + " : invalid first argument - need natural numer greater than 2")
        System.exit(0)
      }
    }
    /////////     main function
    if(args(0).toInt>=2){
      
      val my_class = new prime_number(args(0).toInt)
      
      my_class.calc_prim_numb(args)
      
    }
    ////////  Bad first Argument integer lower than 2
    else{
      println(args(0) + " : invalid first argument - number to low need natural numer greater than 2")
      System.exit(0)
    }
    //////// Definition of the class 
    class prime_number(val n:Int){
      
      var sito = List.range(2,n+1)
      var test = List(2)
      ////////     Prime numbers array declaration
      def calc_prim_numb(m:Array[String]){
        
        
        /// wyluskanie indeksow
        val index_of_prime = new Array[String](m.length-1)
        
        for(i <- 0 to index_of_prime.length-1){
          
          index_of_prime(i) = m(i+1)       //  Index of prime numbers we need to print
          
        }
        ////////// filtrowanie 
      for(i <- 2 to scala.math.sqrt(n).toInt){
        
        sito = sito.filter(_ % test(0) != 0)
        test = sito(0) :: test
      }
      var liczby_pi = List.concat(sito, test).sorted
      for(i <- 0 to index_of_prime.length -1){
        try{      
        println(index_of_prime(i)+ " : " + liczby_pi(index_of_prime(i).toInt-1) )
        } catch{
          case ex: java.lang.NumberFormatException =>{
            println(index_of_prime(i) + " : argument has to be integer")
          }
          case ex: java.lang.IndexOutOfBoundsException =>{
            println(index_of_prime(i) + " : index out of range")
          }
        }
      }
      }
    }
  }
}
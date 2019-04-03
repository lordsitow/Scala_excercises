object Lab1 {
  def main(args: Array[String]){
   
    def find_divisors(a: Array[String]){
     for (i <- 0 to a.length-1){
       
       var ai = 0
       try{
        ai=(a(i)).toInt
        
        
       var div = 0
        for(j <- 2 to ai-1){
          if( ai % j == 0){ div = j}
        }  
       println(ai + " : " + div)
      }catch{
          case ex: java.lang.NumberFormatException=>{
            println(a(i)+":   the conversion is not posible")
          }
        }
       }
    }
    
    find_divisors(args)
  }
}
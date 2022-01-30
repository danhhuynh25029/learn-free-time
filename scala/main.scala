object main{
    def main(args: Array[String]){
        val arr = Array("AL","Banana")
        // arr.foreach(item => println(item))
        for(i <- arr){
            println(i)
        }
    }
    // case
    def f(x:Any) : String =  x match {
        case 1 => "one"
    } 
}

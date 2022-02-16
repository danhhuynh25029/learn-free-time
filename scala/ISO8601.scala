object ISO8601{
    def main(args:Array[String]){
        val date = args(0).split("T")
        val time = date(1).split('+')
        val arr_date = date(0).split("-")
        val arr_time = time(0).split(":")
        for(i <- (arr_date.length - 1) to 0 by -1 ){
            val o = i match{
                case 0 => "Year : " + arr_date(i)
                case 1 => "Month : " + arr_date(i)
                case 2 => "Day : " + arr_date(i)
            }
            println(o);
        }
        for(i <- 0 to (arr_time.length - 1)){
            val o = i match{
                case 0 => "Hour : " + arr_time(i)
                case 1 => "Minutes : " + arr_time(i)
                case 2 => "Second : " + arr_time(i)
            }
            println(o);
        }
    }
}
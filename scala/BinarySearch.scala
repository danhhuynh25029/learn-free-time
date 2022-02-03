object BinarySearch{
  def main(args:Array[String]){
    var arr = Array(1,2,3,4,5);
    var r = Search(arr,3);
    println(r);
  }
  def Search(arr:Array[Int],k:Int) : Boolean = {
    var l = 0 ;
    var r = arr.length;
    while(l < r){
      var tmp = (l+r)/2;
      if(arr(tmp) > k) r = tmp - 1;
      else l = tmp + 1;
    }
    return true;
  }
}

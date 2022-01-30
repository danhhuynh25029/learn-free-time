import scala.io.Source

object ReadFile{
  def main(args:Array[String]){
    val filename = "file.txt"
    val fileS = Source.fromFile(filename);
    while(fileS.hasNext){
      print(fileS.next)  
    }
    fileS.close()
  }
}

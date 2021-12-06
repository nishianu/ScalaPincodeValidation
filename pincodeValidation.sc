import scala.util.matching.Regex
import scala.io.StdIn.readLine
object pincodeValidation 
{
  def main(args: Array[String]):Unit=
  {
    val input = readLine("Enter value: ")
    val pattern = new Regex("^[0-9]{1,6}$")
    if (pattern.matches(input)){
        print("valid pattern")   
    }
    else{
        print("not a valid pattern")
    }
  }
}
import scala.util.matching.Regex
import scala.io.StdIn.readLine
object pincodeValidation 
{
  def main(args: Array[String]):Unit=
  {
    val input = readLine("Enter value: ")
    val pattern = new Regex("^[1-9]{1}[0-9]{2}\\s{0, 1}[0-9]{3}$")
    if (pattern.matches(input)){
        print("valid pattern.")   
    }
    else{
        print("not a valid pattern.")
    }
  }
}
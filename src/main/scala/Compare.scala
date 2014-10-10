object Compare {

  def main(args: Array[String]): Unit = {
    val fromGFTSEmail = split(names = "adam; eve; mallory;")
    val fromGlobalAddressList = split(names = "adam")
    val peopleWhoHaveLeft = fromGFTSEmail.filterNot(fromGlobalAddressList)

    println("These people are not in the global address list: ")
    peopleWhoHaveLeft.foreach(println(_))
  }

  def split(names: String) = {
    val delimiter = ";"
    names.
      toLowerCase.
      split(delimiter).
      toSet
  }
}

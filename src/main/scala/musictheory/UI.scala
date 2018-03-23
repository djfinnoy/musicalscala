package musictheory


object UI {
  def main(args: Array[String]): Unit = {
    println("\nMusic theory calculator:")
    println("Intervals: Enter two notes separated by a space. Eg. A# D")
    println("Scales: Enter one note. Eg. A#")
    println("\nType 'exit' to quit.\n")
    communicateWithUser()
  }

  def communicateWithUser(): Unit = {
    while (true) {
      val input: String = scala.io.StdIn.readLine("Enter note(s):\n")
      try {
        input match {
          case arg if arg.equalsIgnoreCase("exit") => return
          case arg if arg.contains(" ") => processInterval(arg)
          case arg => processScale(arg)
        }
      } catch { case e: Exception => println("Invalid input. Please try again\n") }
    }
  }

  def processScale(arg: String): Unit = {
    println("\n" + arg.capitalize + " Major scale:")
    Scale(arg).map(x => print(x + " ")); println("\n")
  }

  def processInterval(arg: String): Unit = {
    val root: String = arg.splitAt(arg.indexOf(" "))._1
    val leaf: String = arg.splitAt(arg.indexOf(" "))._2.tail
    val interval: Interval = Interval(root, leaf)
    val name = try { interval.name } catch { case e: Exception => "NA" }
    if (name == "NA") println("Invalid interval. Please try again\n") else {
      val longName = name match {
        case "P1" => "Perfect unison"; case "d2" => "Diminished second"
        case "m2" => "Minor second";   case "A1" => "Augmented unison"
        case "M2" => "Major second";   case "d3" => "Diminished third"
        case "m3" => "Minor third";    case "A2" => "Augmented second"
        case "M3" => "Major third";    case "d4" => "Diminished fourth"
        case "P4" => "Perfect fourth"; case "A3" => "Augmented third"
        case "P5" => "Perfect fifth";  case "d6" => "Diminished sixth"
        case "m6" => "Minor sixth";    case "A5" => "Augmented fifth"
        case "M6" => "Major sixth";    case "d7" => "Diminished 7th"
        case "m7" => "Minor seventh";  case "A6" => "Augmented sixth"
        case "M7" => "Major seventh";  case "d8" => "Diminished eigth"
        case "P8" => "Perfect eigth";  case "A7" => "Augmented seventh"
      }
      println("\n" + root.capitalize + " + " + leaf.capitalize + ": " + longName + " (" + name + ")")
      println("Quantity: " + interval.countNotes)
      println("Quality: " + interval.countSemitones + "\n")
    }
  }
}


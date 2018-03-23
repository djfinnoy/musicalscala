package musictheory


case class Note(arg: String) extends NoteParam(arg)

abstract class NoteParam(arg: String) {
  def note: Char = arg.head.toUpper match {
    case 'A'|'B'|'C'|'D'|'E'|'F'|'G' => arg.head.toUpper
    case _ => throw new Exception
  }
  def noteIndex: Int = noteWheel().map(x => x.notes.mkString("/")).indexOf(note.toString)
  def name: String = arg
  def modifier: Int = arg.tail match {
    case "" => 0
    case x if x.last == '#' => arg.tail.length
    case x if x.last == 'b' => - arg.tail.length
    case _ => throw new Exception
  }
  private val noteValue = noteIndex + modifier
  def wheelIndex: Int = if (noteValue < 0) 12 + noteValue  else noteValue % 12
  def hasNaturalEquiv: Boolean = if (arg.length == 1) false else noteWheel()(wheelIndex).hasNaturalStaffPos
  def naturalEquiv: String = noteWheel()(wheelIndex).naturalStaffPos
}

object noteWheel {
  class wheelPos(arg: List[String]) {
    def notes: List[String] = arg
    def hasNaturalStaffPos: Boolean = arg.length == 1
    def naturalStaffPos: String = arg.head
    override def toString: String = arg.mkString("/")
  }

  object wheelPos {
    def apply(arg: String): wheelPos = {
      if (arg.length == 1) new wheelPos(arg :: Nil) else {
        val notes = arg.splitAt(arg.indexOf("/"))
        new wheelPos(notes._1 :: notes._2.tail :: Nil)
      }
    }
  }

  def apply(): List[wheelPos] = {
    List("C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B").map(x => wheelPos(x))
  }

  def natural(startPos: Char = 'C'): List[Char] = {
    val cScale = List('C', 'D', 'E', 'F', 'G', 'A', 'B')
    val x = cScale.indexOf(startPos)
    cScale.drop(x) ::: cScale.take(x)
  }
}









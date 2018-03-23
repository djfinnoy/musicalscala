package musictheory


case class Scale(root: Note) extends MajorScaleParam(root)

abstract class MajorScaleParam(root: Note) {
  def natNotes: List[Char] = noteWheel.natural(root.note) ::: Nil
  def nextNote(prev: Note): Note  = {
    val distance: Int = if (List(0,1,3,4,5).contains(natNotes.indexOf(prev.note))) 2 else 1
    val nwIndex: Int = {
      val x = prev.wheelIndex + distance
      if (x <= 12) x else x - 12
    }
    val staffPos: String = natNotes(natNotes.indexOf(prev.note) + 1).toString
    val adjustment: String = {
      val x: Int = nwIndex - Note(staffPos).wheelIndex
        x match {
          case _ if x < 0 => "b" * math.abs(x)
          case 12 => ""
          case 11 => "b"
          case _ => "#" * x
        }
    }
    Note(staffPos + adjustment)
  }
  def majorScale(arg: List[Note] = root :: Nil): List[Note] = arg match {
    case _ if arg.length == 7 => arg ::: root :: Nil
    case _ => majorScale(arg ::: nextNote(arg.last) :: Nil)
  }
}

object Scale {
  def apply(arg: String): List[String] = Scale(Note(arg.capitalize)).majorScale().map(x => x.name)
}

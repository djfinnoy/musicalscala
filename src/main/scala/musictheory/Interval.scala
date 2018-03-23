package musictheory


class Interval(root: Note, leaf: Note) {
  def countSemitones: Int = {
    val a = root.wheelIndex; val b = leaf.wheelIndex
    (a, b) match {
      case _ if a < b => b - a
      case _ if a > b => 12 - a + b
      case _ if root.note == leaf.note => 0
      case _ => 12
    }
  }
  def countNotes: Int = {
    val notes = List('A', 'B', 'C', 'D', 'E', 'F', 'G')
    if (root.note == leaf.note && root.modifier > leaf.modifier) 8 else {
      val x = if (root.hasNaturalEquiv && leaf.hasNaturalEquiv) notes.indexOf(Note(root.naturalEquiv).note) else notes.indexOf(root.note)
      val y = if (root.hasNaturalEquiv && leaf.hasNaturalEquiv) notes.indexOf(Note(leaf.naturalEquiv).note) else notes.indexOf(leaf.note)
      if (x <= y) y - x + 1 else 8 - x + y
    }
  }
  def name: String = {
    val quantity = this.countNotes
    val quality = this.countSemitones
    (quantity, quality) match {
      case (1, 0)  => "P1"; case (2, 0)  => "d2"
      case (2, 1)  => "m2"; case (1, 1)  => "A1"
      case (2, 2)  => "M2"; case (3, 2)  => "d3"
      case (3, 3)  => "m3"; case (2, 3)  => "A2"
      case (3, 4)  => "M3"; case (4, 4)  => "d4"
      case (4, 5)  => "P4"; case (3, 5)  => "A3"
      case (4, 6)  => "A4"; case (5, 6)  => "d5"
      case (5, 7)  => "P5"; case (6, 7)  => "d6"
      case (6, 8)  => "m6"; case (5, 8)  => "A5"
      case (6, 9)  => "M6"; case (7, 9)  => "d7"
      case (7, 10) => "m7"; case (6, 10) => "A6"
      case (7, 11) => "M7"; case (8, 11) => "d8"
      case (8, 12) => "P8"; case (7, 12) => "A7"
      case _ => throw new Exception
    }
  }
}

object Interval {
  def apply(a: String, b: String): Interval = new Interval(Note(a), Note(b))
}

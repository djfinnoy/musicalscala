package musictheory


import org.scalatest.FunSuite

class ScaleSuite extends FunSuite {

  test("Cb Major = Cb, Db, Eb, Fb, Gb, Ab, Bb, Cb") {
    assert(Scale("Cb") == List("Cb", "Db", "Eb", "Fb", "Gb", "Ab", "Bb", "Cb"))
  }
  test("C Major = C, D, E, F, G, A, B, C") {
    assert(Scale("C") == List("C", "D", "E", "F", "G", "A", "B", "C"))
  }
  test("C# Major = C#, D#, E#, F#, G#, A#, ##, C#") {
    assert(Scale("C#") == List("C#", "D#", "E#", "F#", "G#", "A#", "B#", "C#"))
  }
  test("Db Major = Db, Eb, F, Gb, Ab, Bb, C, Db") {
    assert(Scale("Db") == List("Db", "Eb", "F", "Gb", "Ab", "Bb", "C", "Db"))
  }
  test("D Major = D, E, F#, G, A, B, C#, D") {
    assert(Scale("D") == List("D", "E", "F#", "G", "A", "B", "C#", "D"))
  }
  test("D# Major = D#, E#, F##, G#, A#, B#, C##, D#") {
    assert(Scale("D#") == List("D#", "E#", "F##", "G#", "A#", "B#", "C##", "D#"))
  }
  test("Eb Major = Eb, F, G, Ab, Bb, C, D, Eb") {
    assert(Scale("Eb") == List("Eb", "F", "G", "Ab", "Bb", "C", "D", "Eb"))
  }
  test("E Major = E, F#, G#, A, B, C#, D#, E") {
    assert(Scale("E") == List("E", "F#", "G#", "A", "B", "C#", "D#", "E"))
  }
  test("E# Major = E#, F##, G##, A#, B#, C##, D##, E#") {
    assert(Scale("E#") == List("E#", "F##", "G##", "A#", "B#", "C##", "D##", "E#"))
  }
  test("Fb Major = Fb, Gb, Ab, Bbb, Cb, Db, Eb, Fb") {
    assert(Scale("Fb") == List("Fb", "Gb", "Ab", "Bbb", "Cb", "Db", "Eb", "Fb"))
  }
  test("F Major = F, G, A, Bb, C, D, E, F") {
    assert(Scale("F") == List("F", "G", "A", "Bb", "C", "D", "E", "F"))
  }
  test("F# Major = F#, G#, A#, B, C#, D#, E#, F#") {
    assert(Scale("F#") == List("F#", "G#", "A#", "B", "C#", "D#", "E#", "F#"))
  }
  test("Gb Major = Gb, Ab, Bb, Cb, Db, Eb, F, Gb") {
    assert(Scale("Gb") == List("Gb", "Ab", "Bb", "Cb", "Db", "Eb", "F", "Gb"))
  }
  test("G Major = G, A, B, C, D, E, F#, G") {
    assert(Scale("G") == List("G", "A", "B", "C", "D", "E", "F#", "G"))
  }
  test("G# Major = G#, A#, B#, C#, D#, E#, F##, G#") {
    assert(Scale("G#") == List("G#", "A#", "B#", "C#", "D#", "E#", "F##", "G#"))
  }
  test("Ab Major = Ab, Bb, C, Db, Eb, F, G, Ab") {
    assert(Scale("Ab") == List("Ab", "Bb", "C", "Db", "Eb", "F", "G", "Ab"))
  }
  test("A Major = A, B, C#, D, E, F#, G#, A") {
    assert(Scale("A") == List("A", "B", "C#", "D", "E", "F#", "G#", "A"))
  }
  test("A# Major = A#, B#, C##, D#, E#, F##, G##, A#") {
    assert(Scale("A#") == List("A#", "B#", "C##", "D#", "E#", "F##", "G##", "A#"))
  }
  test("Bb Major = Bb, C, D, Eb, F, G, A, Bb") {
    assert(Scale("Bb") == List("Bb", "C", "D", "Eb", "F", "G", "A", "Bb"))
  }
  test("B Major = B, C#, D#, E, F#, G#, A#, B") {
    assert(Scale("B") == List("B", "C#", "D#", "E", "F#", "G#", "A#", "B"))
  }
  test("B# Major = B#, C##, D##, E#, F##, G##, A##, B#") {
    assert(Scale("B#") == List("B#", "C##", "D##", "E#", "F##", "G##", "A##", "B#"))
  }
}

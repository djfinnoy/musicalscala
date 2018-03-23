package musictheory


import org.scalatest.FunSuite

class IntervalSuite extends FunSuite {

  test("A to A  = Perfect unison")      { assert(Interval("a", "a").name   == "P1") }
  test("A to A# = Augmented unison")    { assert(Interval("A", "A#").name  == "A1") }
  test("E to F  = Minor second")        { assert(Interval("E", "F").name   == "m2") }
  test("B to C# = Major second")        { assert(Interval("B", "C#").name  == "M2") }
  test("Ab to B = Augmented second")    { assert(Interval("Ab", "B").name  == "A2") }
  test("E to Gb = Diminished third")    { assert(Interval("E", "Gb").name  == "d3") }
  test("F to Ab = Minor third")         { assert(Interval("F", "Ab").name  == "m3") }
  test("G to B  = Major third")         { assert(Interval("G", "B").name   == "M3") }
  test("C to E# = Augmented third")     { assert(Interval("C", "E#").name  == "A3") }
  test("B to Eb = Diminished fourth")   { assert(Interval("B", "Eb").name  == "d4") }
  test("G to C  = Perfect fourth")      { assert(Interval("G", "C").name   == "P4") }
  test("F to B  = Augmented fourth")    { assert(Interval("F", "B").name   == "A4") }
  test("F to Cb  = Diminished fifth")   { assert(Interval("F", "Cb").name  == "d5") }
  test("Eb to Bb  = Perfect fifth")     { assert(Interval("Eb", "Bb").name == "P5") }
  test("D to A#  = Augmented fifth")    { assert(Interval("D", "A#").name  == "A5") }
  test("C# to Ab = Diminished sixth")   { assert(Interval("C#", "Ab").name == "d6") }
  test("G to Eb = Minor sixth")         { assert(Interval("G", "Eb").name  == "m6") }
  test("D to B = Major sixth")          { assert(Interval("D", "B").name   == "M6") }
  test("C to A# = Augmented sixth")     { assert(Interval("C", "A#").name  == "A6") }
  test("C# to Bb = Diminished seventh") { assert(Interval("C#", "Bb").name == "d7") }
  test("C to Bb = Minor seventh")       { assert(Interval("C", "Bb").name  == "m7") }
  test("D to C# = Major seventh")       { assert(Interval("D", "C#").name  == "M7") }
  test("C to B# = Augmented seventh")   { assert(Interval("C", "B#").name  == "A7") }

  // Tricky cases
  test("Cb to B# = Minor second")       { assert(Interval("Cb", "B#").name == "m2") }
  test ("E# to E = Diminished eigth")   { assert(Interval("E#", "E").name  == "d8") }
  test ("F to Fb = Diminished eigth")   { assert(Interval("F", "Fb").name  == "d8") }
  test ("E# to Fb = Major seventh")     { assert(Interval("E#", "Fb").name == "M7") }
  test ("B# to Cb = Major seventh")     { assert(Interval("B#", "Cb").name == "M7") }

}

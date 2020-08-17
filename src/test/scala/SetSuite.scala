import org.scalatest.funsuite.AnyFunSuite

// https://www.scalatest.org/user_guide/selecting_a_style

class SetSuite extends AnyFunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
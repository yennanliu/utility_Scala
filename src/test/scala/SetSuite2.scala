import org.scalatest.flatspec.AnyFlatSpec

// https://www.scalatest.org/user_guide/selecting_a_style

class SetSuite2 extends AnyFlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
import org.scalatest._
import matchers._
import prop._
import scala.collection.immutable._

// https://www.scalatest.org/user_guide/selecting_a_style

class SetSpec4 extends propspec.AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {

  val examples =
    Table(
      "set",
      BitSet.empty,
      HashSet.empty[Int],
      TreeSet.empty[Int]
    )

  property("an empty Set should have size 0") {
    forAll(examples) { set =>
      set.size should be (0)
    }
  }

  property("invoking head on an empty set should produce NoSuchElementException") {
    forAll(examples) { set =>
       a [NoSuchElementException] should be thrownBy { set.head }
    }
  }
}
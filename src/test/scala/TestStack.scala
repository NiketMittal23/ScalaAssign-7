import com.SxalaAssign7.{Stack, StackMethod}
import org.scalatest.funsuite.AnyFunSuite

class TestStack extends AnyFunSuite{
  val stack = StackMethod(List(1,2,3,4))
  val empty = List()

  test("if the list is empty then true") {
    assert(empty.isEmpty === true)
  }

  test("if the list is not empty ") {
    assert(stack.isEmpty === false)
  }

  test("element pushed then it will pass") {
    stack.push(5)
    assert(stack.top === 5)
  }

  test("value popped then pass") {
    stack.pop
    assert(stack.top === 2)
  }

  test("the top value test ") {
    assert(stack.top === stack.list.head)
  }

}

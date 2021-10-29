package com.SxalaAssign7

trait Stack[A] {
  def isEmpty(): Boolean
  def push(value: A): Unit
  def top(): A
  def pop(): A
}
case class StackMethod(var list: List[Int]) extends Stack[Int] {

  override def isEmpty(): Boolean =list.isEmpty

  override def push(value: Int): Unit =list = value :: list

  override def top: Int= list.head

  override def pop: Int ={
    if (isEmpty) throw new Exception("LIST IS EMPTY")
    else {
      val temp = top
      list = list.tail
      temp
    }
  }
}

object Run extends App{
  val stack = StackMethod(List(1,2,3,4,5))
  println(stack.isEmpty())
  println(stack.top)
  stack.push(6)
  println(stack.pop)
}
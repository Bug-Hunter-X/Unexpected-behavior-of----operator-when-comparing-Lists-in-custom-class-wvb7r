```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Boolean = {
    value match {
      case list1: List[Int] =>
        other.value match {
          case list2: List[Int] => list1.equals(list2)
          case _ => false
        }
      case _ => value == other.value 
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val obj1 = new MyClass[Int](10)
    val obj2 = new MyClass[Int](10)
    val obj3 = new MyClass[String]("hello")
    val obj4 = new MyClass[String]("hello")

    println(obj1.myMethod(obj2)) //true
    println(obj3.myMethod(obj4)) //true

    val obj5 = new MyClass[List[Int]](List(1, 2, 3))
    val obj6 = new MyClass[List[Int]](List(1, 2, 3))
    println(obj5.myMethod(obj6)) //true, corrected!
  }
}
```
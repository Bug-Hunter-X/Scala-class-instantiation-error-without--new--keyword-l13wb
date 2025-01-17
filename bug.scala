```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val obj = new MyClass(10)
    println(obj.myMethod(5)) // This works fine
    println(new MyClass(20).myMethod(5)) // This also works fine

    // Following produces a compilation error.
    // println(MyClass(10).myMethod(5)) // Compilation error: not found: value MyClass
  }
}
```
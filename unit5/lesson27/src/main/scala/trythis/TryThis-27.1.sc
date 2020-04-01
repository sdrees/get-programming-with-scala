// Define a function to filter all the even numbers of a sequence of integers:
// pass the list as its parameter and use a pattern matching statement on it.

def filterEven(ns: List[Int]): List[Int] = ns match {
  case Nil => Nil
  case head :: tail if isEven(head) => head :: filterEven(tail)
  case _ :: tail => filterEven(tail) // head is off, so we skip it
}

private def isEven(n: Int): Boolean = n % 2 == 0

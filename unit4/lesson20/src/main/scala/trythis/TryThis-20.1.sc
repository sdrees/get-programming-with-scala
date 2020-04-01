// Write a function, called operationWithFallback, that returns an Int and has three parameters:
// -	n is an integer
// -	operation is a function from Int to Int
// -	fallback is an integer.
// The function operationWithFallback should implement as follows. Compute the value of operation applied to n: if more than zero return it, otherwise compute the fallback. Make sure to evaluate fallback only if needed.

def operationWithFallback(n: Int, operation: Int => Int, fallback: => Int): Int = {
  val result = operation(n)
  if (result > 0) result else fallback
}

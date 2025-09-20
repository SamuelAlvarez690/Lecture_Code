import java.math.BigInteger

// Iterative Procedure - Iterative Process

object Main{
    def main(args: Array[String]): Unit = {
        println(factorial_Iterative_Iterative(20))
        // println(factorial_Iterative_Iterative(50000))
        println(factorial_Recursive_Recursive(20))
        // println(factorial_Recursive_Recursive(50000))
        println(factorial_Recursive_Iterative(BigInteger.ONE, 20))
        println(factorial_Recursive_Iterative(BigInteger.ONE, 50000))
    }

    def factorial_Iterative_Iterative(number : Int) : BigInteger = {
        var factorial = BigInteger.ONE
        (1 to number).foreach { e => 
            factorial = factorial.multiply(new BigInteger(e.toString))
        }
        factorial
    }

    def factorial_Recursive_Recursive(number : Int) : BigInteger = {
        if (number == 1)
            BigInteger.ONE
        else    
            new BigInteger(number.toString).multiply(
                factorial_Recursive_Recursive(number - 1)
            )
    }

    def factorial_Recursive_Iterative(factorial : BigInteger, number : Int) : BigInteger = {
        if(number == 1)
            factorial
        else
            factorial_Recursive_Iterative(
                factorial.multiply(new BigInteger(number.toString)),
                number - 1
            )
    }

}

// Scala supports tail recursion
// QUIZ
// PART I: what are the limitations of tail recursion (if any) in scala
// PART II: name at least 3 languages other than scala that support tail recursion and 3 that don't
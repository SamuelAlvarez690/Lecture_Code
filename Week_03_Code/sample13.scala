// Lecture: ProcessPartI
// Summary: In this program we explore iterative vs. recursive processes through Scala.

import java.math.BigInteger

object Main{
    def main(args: Array[String]): Unit = {
        // println(square(5))

        // 5 * factorial(4) // defer computation of the *

        // factorial(4)?

        // 4 * factorial(3) // defer computation of the *

        // factorial(3)?

        // 3 * factorial(2) // defer computation of the *

        // factorial(2)?

        // 2

        // println(factorial(1))
        // println(factorial(2))
        // println(factorial(3))
        // println(factorial(4))
        // println(factorial(5))

        // println(factorial(100))
        // println(factorial(500))
        println(factorial(50000))
    }

    // def square(x: Int) = {
    //     throw new RuntimeExeption
    // }

    // def factorial(number: Int) : Int = {
    //     var fact = 1
    //     // external iterator approach
    //     // for(i <- 1 to number) {
    //     //     fact *= i
    //     // }
    //     // fact

    //     // internal iterator approach
    //     (1 to number).foreach { e => fact *= e }
    //     fact
    // }
    // iterative procedure
    // iterative process

    // def factorial(number: Int) : Int = {
    //     if (number <= 2)
    //         number
    //     else
    //         number * factorial(number - 1)
    // }
    // recursive procedure
    // recursive process

    // def factorial(number: Int) : Int = {
    //     var fact = 1

    //     (1 to number).foreach { e => fact *= e} 
    //     fact
    // }

    // def factorial(number: Int) : BigInteger = {
    //     var fact = BigInteger.ONE
    //     (1 to number).foreach { e =>
    //         fact = fact.multiply(new BigInteger(e.toString))
    //     }
    //     fact
    // }

    // def factorial(number: Int) : BigInteger = {
    //     if(number == 1)
    //         BigInteger.ONE
    //     else
    //         new BigInteger(number.toString).multiply(
    //             factorial(number - 1))
    // }

    def factorial(number: Int) : BigInteger = {
        var fact = BigInteger.ONE
        (1 to number).foreach { e =>
        fact = fact.multiply(new BigInteger(e.toString))
        }
        fact
    }
}
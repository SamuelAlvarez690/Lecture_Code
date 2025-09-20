// Lecture: ProceduresPartII and ProceduresPartIII
// Summary: In this program we explore deconstructing procedures, abstraction and encapsulation, 
// formal parameters and binding, and dependencies through Scala.

object Main{
    def main(args: Array[String]): Unit = {
        println(sqrt(25))

        // val someNumber = 50
        // println(sqrt(someNumber))

        // println(sqrt(25))

        // println(goodEnoughGuess(5.0, 25))

        // var total = 0
        // val list = List(1, 2, 3, 4, 5)

        // // list.foreach { e => total += e }

        // def totalUp(e: Int) = { total += e }
        // list.foreach(totalUp)
        // println("Total is " + total)
    }

    def sqrt(candidate: Double) = {
        def sqrtSuccessive(guess: Double) : Double = {
            if (goodEnoughGuess(guess)) {
                guess 
            } else {
                sqrtSuccessive(improve(guess))
            }
        }

        def goodEnoughGuess(guess: Double) = {
            val TOLERANCE = 0.0000000001
            scala.math.abs(guess * guess - candidate) < TOLERANCE
        }

        def improve(guess: Double) = {
            (candidate / guess + guess) / 2
        }
        sqrtSuccessive(1)
    }
}

// 1 to 25
        // guess is right
        // Assume guess is right
        // candidate/guess = guess

        // If guess is not right
        // candidate / guess > result
        // guess <= result <= candidate/guess
        // average a new guess as 
        // candidate / guess + guess / 2

        /*
        sqrt
        sqrtSuccessive
        goodEnoughGuess
        improve
        abs
        sqrt - *
        avg - /
        */
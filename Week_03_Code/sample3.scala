// Lecture: ProceduresPartI
// Summary: In this program we explore writing procedures through Scala.
// NOTE: Some of this code was originally done in Bash terminal

object Main{
    def main(args: Array[String]): Unit = {
        // Bash code starts here
        var greet = "hello"
        println(greet)

        println(2 * 4)

        // def foo(value: Int) = { value * 3}
        // def foo2(value: Int) { value * 3 } // error missing =
        // def foo3(value: Int) { value == 3 } // error missing =
        def foo3(value: Int) = { value == 3 }

        // All code below this point was not done in Bash terminal
        // val greet1 = "hello there"
        // println(greet1)

        val greet1 = "hello"
        println(greet1)

        val greet2 = "wonderful"

        // 1000


        // 1000


        // 1000

        var max = 1000 // define
        println(max)

        max = 2000 // assign
        println(max)

        def doubleValue(value: Int) = value * 2
        println(doubleValue(2 + 2))
    }
}
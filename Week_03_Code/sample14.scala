// Lecture: ProcessPartII
// Summary: In this program we explore tail recursion through Scala.

object Main{
    def main(args: Array[String]): Unit = {
        // Would be nice to have a recursive procedure
        // and an iterative process
        // println(f1(5))

        // On the stack for f1(5), you are saying
        // add 5 to result of f1(4)
        // You have to wait for f1(4) to be available.
        // So you leave current stack (put on hold) to the stack of f1(4).

        // f1(4)
        // return 4 + f1(3)...

        // In f1(5)
        // Hey, here is 5 for you, take it with you, perform
        // your computation f1(4) and then send the result to 
        // my caller.

        //println(f1(0, 5))

        println(addRecursive_Recursive(5))
        println(addRecursive_Iterative(0, 5))

        // SICP book
    }

    // def f1(number: Int) : Int = {
    //     if (number == 1) 
    //         number
    //         // throw new RuntimeException("oops")
    //     else
    //         number + f1(number - 1)
    // }

    // def f1(sum: Int, number: Int) : Int = {
    //     if (number == 0) 
    //         sum
    //         // throw new RuntimeException("oops")
    //     else
    //         // number + f1(number - 1)
    //         f1(sum + number, number - 1)
    // }

    // This is a recursive procedure and a recursive process
    def addRecursive_Recursive(number: Int) : Int = {
        if (number == 0)
            number
        else
            number + addRecursive_Recursive(number - 1)
    }

    // This is a recursive procedure and a iterative process
    def addRecursive_Iterative(sum: Int, number: Int) : Int = {
        if (number == 0)
            sum
        else
            addRecursive_Iterative(sum + number, number - 1)
    }
}
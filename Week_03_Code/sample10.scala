// Lecture: ProceduresPartIV
// Summary: In this program we explore writing procedures through Scala.

object Main{
    def main(args: Array[String]): Unit = {
        // println(add(1, 2))
        // println(max(1, 2))

        // println(max(List(1, 2, 4, 3, 0)))
        // val list = List(1, 2, 4, 3, 0)
        // println(max(list))

        // println(max(1, 2, 4, 3, 0))

        // val list = List(1, 2, 4, 3, 0)
        // println(max(list: _*))

        println(pow(3,4))
        println(pow(3))
    }
}

def add(op1 : Int, op2 : Int) = {
    op1 + op2
}

// def max (num1 : Int, num2 : Int) = {
//     var maxValue = num1
//     if (num2 > maxValue)
//         maxValue = num2
//     maxValue
// }

// def max (numbers : List[Int]) = {
//     var maxValue = numbers(0)
    
//     for(e <- numbers) {
//         if (e > maxValue)
//             maxValue = e
//     }

//     maxValue
// }

def max (numbers : Int*) = {
    var maxValue = numbers(0)
    
    for(e <- numbers) {
        if (e > maxValue)
            maxValue = e
    }

    maxValue
}

def pow(number: Int, exp : Int = 2) = {
    scala.math.pow(number, exp)
}

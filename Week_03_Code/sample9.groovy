// Lecture: ProceduresPartIV
// Summary: In this program we explore writing procedures through Groovy.

// Groovy is optionally typed
// def add(op1, op2) {
//     op1 + op2
// }

// int add(int op1, int op2) {
//     op1 + op2
// }

// println add(1, 2)

// def max(num1, num2) { 
//     def maxValue = num1

//     if(num2 > maxValue)
//         maxValue = num2
// }

def max(int[] numbers) { 
    def maxValue = numbers[0]

    numbers.each { e -> 
        if (e > maxValue)
            maxValue = e
    }
    maxValue
}

println max(1, 2, 4, 3, 0)
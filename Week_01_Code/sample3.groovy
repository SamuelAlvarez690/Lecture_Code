// Lecture: FunctionalStylePartIII
// Summary: In this program we explore passing functions with Groovy.


def totalValues(values) {
    def total = 0
    values.each { 
        if (true) total += it 
    }
    total
}

def totalEvenValues(values) {
    def total = 0
    values.each { 
        if (it % 2 == 0) total += it 
    }
    total
}

def totalOddValues(values) {
    def total = 0
    values.each { 
        if (it % 2 != 0) total += it 
    }
    total
}

def totalValuesGreaterThanSix(values) {
    def total = 0
    values.each { 
        if (it > 6) total += it 
    }
    total
}

def totalSelectedValues(values, selector) {
    def total = 0
    values.each { 
        if (selector(it)) total += it 
    }
    total
}

def listOfValues = [1, 2, 3, 6, 4, 7, 8]
// println totalValues(listOfValues)
// println totalEvenValues(listOfValues)
// println totalOddValues(listOfValues)
// println totalValuesGreaterThanSix(listOfValues)

// println totalSelectedValues(listOfValues, { true })
// println totalSelectedValues(listOfValues) { true }
// println totalSelectedValues(listOfValues) { it % 2 == 0 }
// println totalSelectedValues(listOfValues) { it % 2 != 0 }
// println totalSelectedValues(listOfValues) { it > 6 }
// println totalSelectedValues(listOfValues) { it < 7 }

def checkEven = { it % 2 == 0 }
println totalSelectedValues(listOfValues, checkEven)


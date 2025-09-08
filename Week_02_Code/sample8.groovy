// Lecture: TypingPartIV
// Summary: In this program we explore strong typing through Groovy.

// Car* pCar = (Car*) pObj;

// pCar->drive(); // C++

// def inst = "hello"

// println inst
// println inst.class

// def inst1 = "hello"
// String inst2 = "hello"

// println inst1 
// println inst1.class

// println inst2
// println inst2.class

// inst1 = 1 // assigned new Integer reference to inst1
// inst2 = 1 // it called 1.toString() obtained String instance and set inst 2

// println inst1
// println inst2
// println inst1.class
// println inst2.class

def inst1 = 1
Integer inst2 = 1

println inst1
println inst1.class
println inst2
println inst2.class

inst1 = "A"
inst2 = "A"

println inst1
println inst1.class

println inst2
println inst2.class

inst1 = new StringBuilder("hello")

println inst1
println inst1.class

inst2 = new StringBuilder("hello")
println inst2
// throws an error since you cannot cast a String builder to an Integer
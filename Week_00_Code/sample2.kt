// Lecture: Introduction, Scope, and Introductions
// Summary: In this program we explore expressiveness through Kotlin.

class Car {
  infix fun drive(distance: Int) = "driving"
}

val car = Car()

car drive 10

//expressive and fluent code
// Lecture: ProceduresPartI
// Summary: In this program we explore writing procedures through Groovy.
// NOTE: This code was originally done in Bash terminal

greet = "hello"
println greet
// println greet.toUpperCase()

String.metaClass.shout = { -> delegate.toUpperCase() }
greet2 = greet.shout()
println greet2

String.metaClass.wisper = { -> delegate.toLowerCase() }
println greet2.wisper()


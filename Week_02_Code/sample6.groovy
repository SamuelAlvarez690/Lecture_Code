// Lecture: TypingPartIII
// Summary: In this program we explore the benefits of dynamic typing through Groovy.

greet = "hello"
println greet

// println greet.class
try {
    println greet.shout()
} catch(Exception ex) {
    println "oops, looks like I can't do that"
}

println "Let's add it!"
String.metaClass.shout = {->
    delegate.toUpperCase()
}

println greet.shout()

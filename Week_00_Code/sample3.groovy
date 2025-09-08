// Lecture: Introduction, Scope, and Introductions
// Summary: In this program we explore creating languages in Groovy.

// def langs = ['C++' : 'Stroustrup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy', 'Ruby' : 'Matz']

// def builder = new groovy.xml.MarkupBuilder()

// builder.languages {
//   langs.each {key, value ->
//     language(name: key) { author(value) }
//   }
// }

static def on(String month) {
  println("on called with $month")
  return this
}

static def the(String day) {
  println("the called with $day")
  return this
}

static def of(year) {
  println("of called with $year")
  return this
}

def propertyMissing(String prop) {
  return prop
}

on August the eighteen of 2025

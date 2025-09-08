// Lecture: FunctionalStylePartIV
// Summary: In this program we explore mutability vs immutabilty with Scala.

object Main {      
    def main(args: Array[String]): Unit = {  
        var buff1 = new StringBuilder
        buff1.append("hello")
        println(buff1)

        buff1 = new StringBuilder
        buff1.append("there")
        println(buff1)

        val buff2 = new StringBuilder
        buff2.append("ok")
        println(buff2)

        // buff2 = new StringBuilder
        // buff2.append("ok?")
        // println(buff2)

        // var is like a variable in
        // Java and C#
        // val is like final in Java
        // and readonly in C# (or is it 
        // like const in C#?)

        // The val data type is similar to const in C#.
        // The const keyword declares constant fields 
        // that cannot be changed once it is assigned. 
        // consts are not variables, they are number, strings, null references, and boolean values
        // The readonly keyword only allows you to assign values to 
        // variables when you declare them AND in a constructor of the same class
        // in which it is declared

        var greet1 = "hello"
        println(greet1)
        println(greet1.getClass())

        greet1 = "howdy"
        println(greet1)

        val greet2 = "hello"
        println(greet2)
        // greet2 = "howdy"
        println(greet2)

        // val is like X const* in C++
    }
}
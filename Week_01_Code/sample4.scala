// Lecture: FunctionalStylePartIII
// Summary: In this program we explore passing functions with Scala.


object Main {
    def totalSelectedValues(values: List[Int])( selector : Int => Boolean) = {
        var total = 0
        values.foreach { e =>
            if(selector(e)) total += e
        }
        /*
        for(e <- values) {
        //    if (selector(e)) total += e
        }
        */
        total
    }

    def checkEven(value : Int) = {
        value % 2 == 0
    }


    def main(args: Array[String]): Unit = {
        var listOfValues = List(1, 2, 4, 5, 6, 7, 8)

        // listOfValues.foreach { e => println(e) }
        // listOfValues.foreach { println(_) }
        // listOfValues.foreach { println }
        // listOfValues.foreach(println)
    
        // println(totalSelectedValues(listOfValues) { e => true })
        // println(totalSelectedValues(listOfValues) { e => e % 2 == 0 })
        // println(totalSelectedValues(listOfValues) { e => true} )

        // foo(int a) // This function takes one parameter (int)
        // foo(int a, double b) // This function takes two parameters (int double)

        // foo() // This function takes no parameters

        // foo(int a, double b)(int c, char d) 

        
        // println(totalSelectedValues(listOfValues) { checkEven })
        // println(totalSelectedValues (listOfValues) { e => checkEven(e) })
        // println(totalSelectedValues(listOfValues)(checkEven))
    }
}
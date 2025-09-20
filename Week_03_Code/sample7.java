// Lecture: ProceduresPartIII
// Summary: In this program we explore block structure and lexical scoping through Java.


public class sample7 {
    public static void main(String[] args) {
        System.out.println(2.0 - 1.1);
    }

    public void foo(int value) {
        int someValue = 2;

        {
            // int someValue - 54;
            int someThing = someValue * 2;
        }
    }
}
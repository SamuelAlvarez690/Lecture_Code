// Lecture: ExpressionsAndSymbols
// Summary: In this program we explore interning with Java.

public class sample9 {
    public static void main(String[] args){
        String bad = new String("hello"); // don't do this
        String greet = "hello";
        System.out.println(bad);
        System.out.println(greet);

        String greet2 = "hello";
        System.out.println(greet2);

        // greet and greet2 point to exactly the same instance
        // in memory, whereas bad is pointing to a different
        // instance of String in memory.

        System.out.println(greet.equals(bad));
        System.out.println(greet.equals(greet2));
        System.out.println(greet == bad);
        System.out.println(greet == greet2);

        String internedString = bad.intern();
        System.out.println(internedString);
        System.out.println(greet == internedString);
    }
}
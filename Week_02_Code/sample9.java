// Lecture: TypingPartIV
// Summary: In this program we explore strong typing through Java.

public class sample9 {
    public static void main (String[] args) {
       Object obj1 = "hello"; // String

       Object obj2 = 2; // Integer

       use(obj1);
       use(obj2);
    }

    // private static void use(Object obj) {
    //     if (obj instanceof String){
    //         String str = (String) obj;

    //         System.out.println(str);
    //     } else {
    //         System.out.println("Invalid....");
    //     }
    // }

    private static void use(Object obj) {
        String str = (String) obj;

        System.out.println(str);
    }
}
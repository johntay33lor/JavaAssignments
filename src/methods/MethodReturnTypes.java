package methods;


public class MethodReturnTypes {
    public static void main(String[] args) {

        System.out.println("Enter a string: " + myString());
        System.out.println("Enter a number: " + myInt());
        System.out.println("Enter a boolean: " + myBoolean());

    }

    public static String myString () {
        return "This is a string";

    }

    public static int myInt () {
        return 3;

    }

    public static boolean myBoolean () {
        return true;

    }
}

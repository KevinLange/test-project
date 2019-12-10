package interfaces;

public interface PrivateInterface {

    /**
     * Java 8 Feature
     */
    default void doSomething() {
        printString("String");
    }

    /**
     * Java 8 Feature
     */
    static void doSomethingStatic() {
        printStringStatic("Static");
    }

    private void printString(String str) {
        System.out.println(str);
    }

    private static void printStringStatic(String str){
        System.out.println(str);
    }
}

package lesson_seven;

public class MyClass {

    static {
        System.out.println("class loaded to memory, static block executed");
    }

    public MyClass() {
        System.out.println("Constructor");
    }
}

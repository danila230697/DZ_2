package lesson_two;

public class MyClass1 implements InterfaceB, InterfaceA {

    @Override
    public void methodB() {
        System.out.println("this is b");
    }

    @Override
    public void methodA() {
        System.out.println("this is from interface a!");
    }
}

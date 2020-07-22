package lesson_two;

public class MainClass {
    public static void main(String[] args) {
        MyClass1 m = new MyClass1();
        DifferentClass d = new DifferentClass();
        InterfaceA i = new MyClass1();
        InterfaceA i1 = new DifferentClass();

        InterfaceA[] arr = {m, d};
        for (int j = 0; j < arr.length; j++) {
            arr[j].methodA();
        }

        m.methodA();
        m.methodB();

        class Mouse implements MouseListener {

            @Override
            public void mouseUp() {

            }

            @Override
            public void mouseDown() {

            }
        }
        Mouse mouse = new Mouse();

        method1(new MouseListener() {
            @Override
            public void mouseUp() {

            }

            @Override
            public void mouseDown() {

            }
        });
    }

    static void method1(MouseListener mouseListener) {

    }
}

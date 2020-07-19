package lesson_seven;

public class MainClass {
    public static void main(String[] args) {
//        MyClass c = new MyClass();
        try {
            Class.forName("lesson_seven.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

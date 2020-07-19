package lesson_one.online;

public class MainClass {

    private static class Animal {
        private String name;
        Animal(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        int i = 5;
        byte b = (byte) i;

        Animal a = new Animal("Barsik");
        System.out.println((a instanceof Animal) ? "wow" : "no way!");

        System.out.println(b);

//        MyClass myClass = new MyClass();
//        int[]ints = {1,2,3,4,5,6,7,8};
//        myClass.method1(ints);
//
//        myClass.method1(1,2,3,4,5,6,7,8);

    }
}

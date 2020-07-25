package lesson_five;

public class Threading {

    /*

     Необходимо написать два метода, которые делают следующее:
     - Создают одномерный длинный массив, например:
     - Заполняют этот массив единицами;
     - Засекают время выполнения, используя метод System.nanoTime();
     - Проходят по всему массиву и для каждой ячейки считают новое значение по формуле: arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

	 Чем отличается первый метод от второго:
     Первый бежит по массиву и высчитывает значения.

     Второй разбивает массив на два массива,
     в двух потоках высчитывает новые значения,
     и потом склеивает эти массивы обратно в один.

	 Пример деления одного массива на два:
	 System.arraycopy(arr, 0, a1, 0, h);
	 System.arraycopy(arr, h, a2, 0, h);
	 Пример обратной склейки:
	 System.arraycopy(a1, 0, arr, 0, h);
	 System.arraycopy(a2, 0, arr, h, h);

    * */

    private static long a;
    private static long b;
    private static long c;

    Threading() {
        incAllVars();
    }

    static Object o = new Object();

    synchronized static void incAllVars() {
        String vars = "";
        for (int i = 0; i < 1000000; i++) {
            a = a + 1;
            b = b + 1;
            c = c + 1;
            vars = "a = " + a + "; b = " + b + "; c = " + c;
            if (a != b || b != c || a != c) {
                System.out.println(vars);
            }
        }
        System.out.println(vars);
    }

    static void incAllVars2() {
        synchronized (o) {
            String vars = "";
            for (int i = 0; i < 1000000; i++) {
                a = a + 1;
                b = b + 1;
                c = c + 1;
                vars = "a = " + a + "; b = " + b + "; c = " + c;
                if (a != b || b != c || a != c) {
                    System.out.println(vars);
                }
            }
            System.out.println(vars);
        }
    }

    public static void main(String[] args) {
        new Threading();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                incAllVars();
            }
        };
        new Thread(r1, "Thread #1").start();
        new Thread(r1, "Thread #2").start();
        new Thread(r1, "Thread #3").start();
//        Thread t = new MyThread("MyThread");
//        t.interrupt();

//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println(Thread.currentThread().getName());
    }
}

public class threads {
    private static final Object mon=new Object();
    private  static volatile char currentLetter='A';
    //Задание выполнил если нужно каждый символ отдельно
    // ну понятно тогда что вместо print пишем println
    public static void main(String[] args) {
threads threads=new threads();
new Thread(()->threads.printA()).start();
new Thread(()->threads.printB()).start();
new Thread(()->threads.printC()).start();
    }
    public static  void printA(){
        synchronized (mon){
            for (int i = 0; i <5 ; i++) {
                while(currentLetter !='A'){
                    try{
                        mon.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.print("A");

                currentLetter='B';

              //  System.out.println("Current "+currentLetter);

                mon.notify();
            }
        }
    }
    public static  void printB(){
        synchronized (mon){
            for (int i = 0; i <5 ; i++) {
                while(currentLetter !='B'){
                    try{
                        mon.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                currentLetter='C';
              //  System.out.println("Current "+currentLetter);
                mon.notify();
            }
        }
    }
    public static void printC(){
        synchronized (mon){
            for (int i = 0; i <5 ; i++) {
                while(currentLetter !='C'){
                    try{
                        mon.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.print("C");
                currentLetter='A';
               // System.out.println("Current "+currentLetter);
              //  System.out.println("-------------------------------------------------------------------------------------------------");
                mon.notifyAll();
            }
        }
    }
}

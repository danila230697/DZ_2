import java.util.Arrays;

public class Array {
    //задание 1
    public void create(int a[]){
        int b[]=new int[a.length];
        int flag=0;
        for (int i = 0; i <a.length ; i++) {
           if(a[i]==4) {
               flag=i;
           }
        }
        flag++;
        for (int i = flag; i <a.length ; i++) {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
        System.out.println(" ");
    }
    //задание 2
    public boolean check14(int a[]){
        int flag1=0;
        int flag4=0;
        int flaganother=0;

        System.out.print("[");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
            if(a[i]==4) {
                flag4++;
            }else if(a[i]==1){
                flag1++;
            }else if(flaganother!=4 ||flaganother!=1){
                flaganother++;
            }


        }
        System.out.print("]");

       if(flag1>0 && flag4>0 && flaganother==0) {
           return true;
       }
       return false;


    }
    //Пытался сделать подругому пока что не получилось
    public void create1(Integer a[]){
        Integer b[]=new Integer[a.length];
        int flag=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==4) {
                flag=i;
            }
        }
        flag++;
        for (int i = flag; i <a.length ; i++) {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }

    }
}

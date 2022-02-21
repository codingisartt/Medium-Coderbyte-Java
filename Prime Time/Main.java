<<<<<<< HEAD
import java.util.Scanner;

public class Main {

    public static boolean PrimeTime(int num){
        if(num<=1 || num>65535)
            return false;
        for(int i=2; i<Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(PrimeTime(s.nextInt()));
    }
=======
import java.util.Scanner;

public class Main {

    public static boolean PrimeTime(int num){
        if(num<1 || num>65535)
            return false;
        for(int i=2; i<Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(PrimeTime(s.nextInt()));
    }
>>>>>>> 25c42bc36ccc79d38c2d8f1c2df18c7c49536df3
}
import java.util.Scanner;

public class Main2 {
    public static boolean PrimeTime(int num){
        boolean conc=true;
        if(num==1){
            return false;
        }
        if(num==2){
            return true;
        }
        for(int i=2;i<1+num/2;i++){
            if(num%i==0){
                conc=false;
                break;
            }
        }
        return conc;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(PrimeTime(s.nextInt()));
    }
}

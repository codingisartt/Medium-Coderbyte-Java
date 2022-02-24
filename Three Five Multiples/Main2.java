import java.util.Scanner;

public class Main2 {
    public static int ThreeFiveMultiples(int num) {
        int a=0;
        for(int i=1;i<num;i++){
          if(i%3==0 || i%5==0 ){
            a+=i;
          }
        }
        return a;
      }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(ThreeFiveMultiples(s.nextInt()));
    }
}

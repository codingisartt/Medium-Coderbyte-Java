import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Set<Integer> set=new HashSet<>();
    public static void Count(int n, int m){
        for(int i=m;i<n;i+=m){
            if(i%m==0){
                set.add(i);
            }
        }
    }
    public static int ThreeFiveMultiples(int num){
        int total=0;
        Count(num,3);
        Count(num,5);
        for(int i:set){
            total+=i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(ThreeFiveMultiples(s.nextInt()));
    }
}
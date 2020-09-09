package pkg5;
import java.util.Scanner;

public class Main {
    static int Fact(int x){
        int fact=1;
        for(int i=1; i<=x; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Fact(scan.nextInt()));
    }
    
}

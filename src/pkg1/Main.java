package pkg1;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        int x=0;
        int sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива.");
        x=scan.nextInt();
        int arr[] = new int[x];
        System.out.println("Введите элементы массива.");
        for(int i=0; i<x; i++){
            arr[i] = scan.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
        
        int n=0;
        sum=0;
        while(n!=x){
            sum+=arr[n];
            n++;
        }
        System.out.println(sum);
        
        n=0;
        sum=0;
        do{
            sum+=arr[n];
            n++;
        }while(n!=x);
        System.out.println(sum);
    }
    
}
    
package pkg4;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       int x=0;
       Scanner scan = new Scanner(System.in);
       System.out.print("Введите количество элементов массива: ");
       x=scan.nextInt();
       int arr[] = new int[x];
       
       //через Math.random
       for(int i=0; i<x; i++){
           arr[i] = (int)(Math.random() * 10);
       }
       for(int i=0; i<x; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();
       for(int i =0; i<x-1; i++){
           for(int j=i+1; j<x; j++){
               if(arr[i]>arr[j]){
                   int m=0;
                   m=arr[j];
                   arr[j]=arr[i];
                   arr[i]=m;
               }
           }
       }
       for(int i=0; i<x; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();
       
       //через класс Random
       Random random = new Random();
       for(int i=0; i<x; i++){
           arr[i]=random.nextInt(10);
       }
       for(int i=0; i<x; i++){
           System.out.print(arr[i] + " ");
       }
       for(int i =0; i<x-1; i++){
           for(int j=i+1; j<x; j++){
               if(arr[i]>arr[j]){
                   int m=0;
                   m=arr[j];
                   arr[j]=arr[i];
                   arr[i]=m;
               }
           }
       }
       System.out.println();
       for(int i=0; i<x; i++){
           System.out.print(arr[i] + " ");
       }
    }
    
}

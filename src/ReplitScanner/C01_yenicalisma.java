package ReplitScanner;

import java.util.Scanner;

public class C01_yenicalisma {
    public static void main(String[] args) {
        /*
        int veri türünün Maximum ve Minimum değerlerini gösteren kodu konsola yazınız.*/


        int arr []={10, 60, 20, 3, 5, -1};

        int max=arr[0];
        int min =arr[0];


        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("en buyuk sayi = " + max);

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]<min){
                min=arr[i];
            }
           
        }
        System.out.println("en kucuk sayi = " + min);



    }
}

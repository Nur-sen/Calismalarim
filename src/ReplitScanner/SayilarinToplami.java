package ReplitScanner;

import java.util.Scanner;

public class SayilarinToplami {


    public static void main(String[] args) {
        /*
       Kullanıcıdan üç basamaklı bir sayı girmesini
       ve bu sayının basamaklarının toplamını bulmasını isteyin.
       Örnek Çıktı:

       Verilen tamsayının rakamları toplamı 10'dur.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Uc basamakli bir sayi girin:");
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;


        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;



        System.out.println("Verilen tamsayinin rakamlari toplami= " + rakamlarToplami);


    }

}

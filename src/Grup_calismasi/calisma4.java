package Grup_calismasi;

import java.util.Scanner;

public class calisma4 {
    public static void main(String[] args) {
        /*   Kullanicidan 2 sayi alaliniz.
  1. sayi taban
  2. sayi Ust
  1 sayinin ussunu hesaplatan code create ediniz.
   3, 3  sonuc = 27

  2  3 = 2*2*2=8

 */
        //1. adim scanner olustur

        Scanner scan=new Scanner(System.in);
        System.out.print("taban sayisi girin : ");
        int sayi1=scan.nextInt();
        System.out.print("ust sayi girin : ");
        int sayi2=scan.nextInt();
        int sayininUssu=1;

        //2.while cozum

        while (sayi2>0){
            sayininUssu*=sayi1;
            sayi2--;
        }

        System.out.println("sayininUssu : " + sayininUssu);


    }
}

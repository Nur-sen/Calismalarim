package Nursen_Proje_Calismalari.GeometrikSekillerYeni;

import java.util.Scanner;

public class Kare extends Dikdortgen{
  static  Scanner scan = new Scanner(System.in);

    public Kare(double kenar) {
        super();

    }

    public static void kareAlanHesaplama(){
        System.out.println("**** Kare Alan Hesaplama Modulune Hosgeldiniz **** ");

        System.out.print("Kenar uzunlugu girin : ");
        double kenar=scan.nextDouble();
        System.out.println("Karenin Alani : " + kenar*kenar);
    }

   public static void kareCevreHesaplama(){
    System.out.println("**** Kare Cevre Hesaplama Modulune Hosgeldiniz **** ");

    System.out.print("Kenar uzunlugu girin : ");
    double kenar=scan.nextDouble();
    System.out.println("Karenin cevresi : " + (kenar+kenar)*2);
}
}
package Nursen_Proje_Calismalari.GeometrikSekillerYeni;

import java.util.Scanner;

public class Dikdortgen extends Sekil{
   static Scanner scan = new Scanner(System.in);
    public Dikdortgen(double uzunKenar, double kisaKenar){

    }

    public Dikdortgen() {

    }

    public static void dikdortgenAlanHesaplama(){
     System.out.println("**** Dikdortgen Alan Hesaplama Modulu **** ");

     System.out.print("Uzun kenar girin: ");
     double uzunKenar=scan.nextDouble();

     System.out.print("Kisa kenar girin : ");
     double kisaKenar=scan.nextDouble();

     System.out.println("Dikdorgenin Alani : " + uzunKenar*kisaKenar);
 }
    public static void dikdortgenCevreHesaplama(){

        System.out.println("**** Dikdortgen Cevre Hesaplama Modulu **** ");
        System.out.print("Uzun kenar girin: ");
        double uzunKenar=scan.nextDouble();

        System.out.print("Kisa kenar girin : ");
        double kisaKenar=scan.nextDouble();

        System.out.println("Dikdorgenin cevresi : " + (uzunKenar+kisaKenar)*2);
    }
}

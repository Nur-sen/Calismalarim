package Nursen_Proje_Calismalari.GeometrikSekillerYeni;

import java.util.Scanner;

public class Cember extends Sekil {
    static Scanner scan = new Scanner(System.in);
   public Cember(double yariCap){

 }
public static void cemberinAlani(){
    System.out.println("**** Cember Alan Hesaplama Modulu ****");
    System.out.print("Cemberin yari capini Girin: ");
     double yariCap=scan.nextDouble();
    System.out.println("cemberin alani: " + yariCap*yariCap*3.14);
}
public static void cemberinCevresi(){
    System.out.println("**** Cember cevresi Hesaplama Modulu ****");
    System.out.print("cemberin yari capini girin: ");
    double yariCap=scan.nextDouble();
    System.out.println("Cemberin cevresi: " + 2*yariCap*3.14);
}

}

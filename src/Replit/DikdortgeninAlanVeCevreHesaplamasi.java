package Replit;

import java.util.Scanner;

public class DikdortgeninAlanVeCevreHesaplamasi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve
        dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

        Örnek Çıktı:

        Alan: 32

        Çevre: 24
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Uzun kenari girin= ");
        int uzunKenar=scan.nextInt();
        System.out.print("Kisa kenari girin= ");
        int kisaKenar=scan.nextInt();

        System.out.println("Dikdortgenin Alani : " + uzunKenar*kisaKenar);
        System.out.println("Dikdortgenin Cevresi: " + 2*(uzunKenar+kisaKenar));
    }
}

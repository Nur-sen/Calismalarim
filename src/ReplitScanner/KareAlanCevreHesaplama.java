package ReplitScanner;

import java.util.Scanner;

public class KareAlanCevreHesaplama {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

       Ornek Cikti :
       Alan: 9
       Cevre: 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Kenar uzunlugunu girin : ");
        int kenarUzunlugunu=scan.nextInt();
        System.out.println("Karenin Alani= " + kenarUzunlugunu*kenarUzunlugunu);
        System.out.println("Karenin Cevresi = " + 2*(kenarUzunlugunu+kenarUzunlugunu));
    }
}

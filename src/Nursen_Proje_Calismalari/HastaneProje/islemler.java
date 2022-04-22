package Nursen_Proje_Calismalari.HastaneProje;

import java.util.Scanner;

import static Nursen_Proje_Calismalari.HastaneProje.HastaneRunner.hastane;

public class islemler {
    static Scanner scan = new Scanner(System.in);



    public static void hastaneOtomasyonu() {
        System.out.println("****** HASTANEMIZE HOS GELDINIZ ****** ");
        System.out.println("Lutfen secim yapiniz :" +
                " \nDoktor arama icin 1'i " +
                "\nHasta arama icin 2'i " +
                "\n" +
                "Hastanin oncelik sirasini ogrenmek icin 3'u " +
                "\ncikis icin 4'u secin");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                DoktorBul();
                hastaneOtomasyonu();
                break;
            case 2:
               hastaBul();
                hastaninOncelikDurumuVarMin();
                hastaneOtomasyonu();
                break;
                case 3:
                    hastaninOncelikDurumuVarMin();
                    break;
        }
    }

    private static void hastaninOncelikDurumuVarMin() {


    }

   public static void hastaBul() {
        System.out.println("hastanin Id numarasini girin: ");
        int hastaIDleri = scan.nextInt();
        boolean hastaVarmi = false;
        for (int i = 0; i < hastane.hastaIDleri.length; i++) {
            if (hastaIDleri == (hastane.hastaIDleri[i])) {
                hastaVarmi = true;
                System.out.println("hasta ismi : " + hastane.hastaIsimleri[i] + " ," + " hasta soyismi: " + hastane.hastaSoyIsimleri[i]+
               " Hastanin rahatsizligi : " + hastane.hastaDurumu[i] );

            }
        }if(!hastaVarmi){
            System.out.println("aranan hasta bulunamadi");
        }
    }

    public static void DoktorBul() {

        System.out.println("aradiginiz dokturun bransini girin: ");
        String doktorBransi = scan.nextLine();
        scan.next();
         boolean doktorVarMi = false;
        for (int i = 0; i < hastane.unvanlar.length; i++) {
            if (doktorBransi.equalsIgnoreCase(hastane.unvanlar[i])) {
                doktorVarMi = true;
                System.out.println("doktor ismi : " + hastane.doctorIsimleri[i] + " ," + " Doktor soyismi: " + hastane.doctorSoyIsimleri[i] +" ," +
                        " Doktor unvani: " + hastane.unvanlar[i]);

            }
            }if(!doktorVarMi) {
            System.out.println("aranan doktor bulunamadi");
        }

    }
}





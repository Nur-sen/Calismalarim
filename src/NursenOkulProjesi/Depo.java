package NursenOkulProjesi;

import java.util.Scanner;

public class Depo {
  static  Scanner scan=new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {
        String tercih="";



        do{
            System.out.println("======== YILDIZ KOLEJI  =========\n" +
                    "=========== ANA MENU =============\n" +
                    " 1- Okul Bilgileri Goruntule \n" +
                    " 2- Ogretmen Menu \n" +
                    " 3- Ogrenci Menu \n" +
                    " Q- Cikis\n");

            System.out.println("Lutfen menuden tercihinizi yapiniz");
            tercih=scan.nextLine();

            switch(tercih){
                case "1"://okul bilgileri
                 Depo.okulBilgileriniyazdir();
                    break;
                case "2"://ogretmen menusu
                    Ogretmen.ogretmenMenu();
                    break;
                case "3"://ogrenci menusu
                    break;
                case "Q"://menuden cikis
                case "q":
                    break;
                default:
                    System.out.println("gecerli bir secim yapin");
            }

        }while(!tercih.equalsIgnoreCase("q"));//kullanici q ya basmadigi surece calisacak
           Depo.projeDurdur();                                              // bunun icin do while yapildi
    }

    private static void okulBilgileriniyazdir() throws InterruptedException {
        System.out.println("======== YILDIZ KOLEJI  =========\n" +
                "\t\t Adres : " + OkulBilgileri.okulAdrsi +
                "\n\t\t Telefon : " + OkulBilgileri.telefon );

        Thread.sleep(2000);


    }

    public static void projeDurdur() {
        System.out.println("okul projesinden ciktiniz");
    }


}

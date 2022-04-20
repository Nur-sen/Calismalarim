package Nursen_Proje_Calismalari.kitapyonetimiYENI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapIslemler {
    public static Scanner scan=new Scanner(System.in);
    public static List<KitapBilgileri> kitapListesi =new ArrayList<>();
    public static int count=1005;




    public static  void guncelkitapListesi(){
        KitapBilgileri  kitap1= new KitapBilgileri(1000,"Suc ve Ceza", "Dostoyevski", "17$");
        KitapBilgileri  kitap2= new KitapBilgileri(1001, "Savas ve Baris", "Tostoy", "19$");
        KitapBilgileri  kitap3= new KitapBilgileri(1002, "Kurk Mantolu Madonna", "Sebahattin Ali", "15$");
        KitapBilgileri  kitap4= new KitapBilgileri(1003,  "Javaya Giris", "Elif Celik", "50$");
        KitapBilgileri  kitap5= new KitapBilgileri(1004, "Javadan Cıkıs Yok", "Haluk Hoca", "100$");
        kitapListesi.add(kitap1);
        kitapListesi.add(kitap2);
        kitapListesi.add(kitap3);
        kitapListesi.add(kitap4);
        kitapListesi.add(kitap5);
       //System.out.println("kitap listesi");
       /* for (int i = 0; i <kitapListesi.size(); i++){
            System.out.println( kitapListesi.get(i));
        }*/
    }

    public static void secimMenusu(){
        System.out.println("kitap Yonetim sayfasina hos geldiniz");
        System.out.println("yapmak istediginiz islemi secin: ");
        System.out.println(" 1-kitap ekle\n" +
                " 2-numara ile kitap goruntule\n" +
                " 3-bilgi ile kitap goruntule\n" +
                " 4-numara ile kitap sil\n" +
                " 5-tum kitaplari listele\n" +
                " 6-cikis");
        System.out.println("secim yapiniz");
        int secim=scan.nextInt();
        switch(secim){
            case 1:
                kitapEkleMethodu();
                secimMenusu();

                break;
            case 2:
                kitapNoIleGoruntule();
                secimMenusu();

                break;
            case 3:
                kitapBilgisiileGoruntule();
                secimMenusu();
                break;
            case 4:
                kitapNoIleSil();
                kitaplistesi();
                secimMenusu();

                break;
            case 5:
                guncelkitapListesi();
                kitaplistesi();
                secimMenusu();

                break;
            case 6:
                menudenCikis();
                break;

        }


    }

    private static void kitaplistesi() {
        System.out.println("kitap listesi:");
        for (int i = 0; i <kitapListesi.size() ; i++) {

            System.out.println(kitapListesi.get(i));
        }

    }

    private static void kitapEkleMethodu() {
        System.out.println("Kutuphaneye eklenecek kitap bilgilerini giriniz");
        scan.nextLine();//dummy
        System.out.print("kitap adi giriniz:");
        String kitapAd = scan.nextLine();
        System.out.print("kitabin yazarini girin : ");
        String yazarAdi=scan.nextLine();
        System.out.print("kitabin fiyatini girin:");
        String kitapFiyati=scan.nextLine();

        KitapBilgileri eklenenYeniKitap= new KitapBilgileri(count,kitapAd,yazarAdi,kitapFiyati);
        kitapListesi.add(eklenenYeniKitap);
        System.out.println("Eklemek istediginiz kitap " + count + " Kitap numarasi ile basarili sekilde eklendi");
        count++;

    }


    private static void kitapNoIleGoruntule() {

        System.out.println("Kitap Numarasini girin: ");
        int kitapNumarasi= scan.nextInt();
        boolean kitapVarMi=false;
        for (int i=0; i<kitapListesi.size(); i++){
            if(kitapNumarasi==kitapListesi.get(i).getCount()){
                kitapVarMi=true;
                System.out.println(kitapListesi.get(i));
            }

        }
        if(!kitapVarMi){
            System.out.println("aradiginiz kitap bulunamadi.");


        }
    }


    private static void kitapBilgisiileGoruntule() {

        System.out.println("Kitap arama bolumune hos geldiniz");
        System.out.println("Secim yapiniz \nKitap adi ile arama icin 1'e \nYazar Adi ile arama icin 2'e basin");
        String secim=scan.next();
        switch (secim) {
            case "1":
                scan.nextLine();//dummy
                System.out.println("Kitap adini girin: ");
                String kitapAdi = scan.nextLine();
                boolean kitapVarMi = false;
                for (int i = 0; i < kitapListesi.size(); i++) {
                    if (kitapListesi.get(i).getKitapAdi().equalsIgnoreCase(kitapAdi)) {
                        kitapVarMi = true;
                        System.out.println(kitapListesi.get(i));
                    }
                }
                if (!kitapVarMi) {
                    System.out.println("aradiginiz kitap bulunamadi.");
                }
                break;

            case "2":
                scan.nextLine();//dummy
                System.out.println("Yazar adi girin: ");
                String yazarAdi = scan.nextLine();
                boolean kitapVarMi2 = false;
                for (int i = 0; i < kitapListesi.size(); i++) {
                    if (kitapListesi.get(i).getKitapAdi().equalsIgnoreCase(yazarAdi)) {
                        kitapVarMi = true;
                        System.out.println(kitapListesi.get(i));
                    }
                }
                if (!kitapVarMi2) {
                    System.out.println("aradiginiz kitap bulunamadi.");
                }
                break;

            default:
                System.out.println("hatali giris yaptiniz");

        }
        }






    private static void kitapNoIleSil() {
        System.out.println("Kitap Numarasini girin: ");
       int kitapNumarasi= scan.nextInt();
        boolean varMi=false;


          for (int i=0; i<kitapListesi.size(); i++) {
            if (kitapNumarasi==kitapListesi.get(i).getCount()) {
                varMi = true;
                System.out.println(kitapListesi.remove(kitapListesi.get(i)));
                System.out.println("silme islemi gerceklesti");
            }


        }if(!varMi){
            System.out.println("aradiginiz kitap bulunamadi.");
        }


    }





    private static void menudenCikis() {

        System.out.println("sisitemden cikisiniz basarili sekilde gerceklesti.");
    }


}

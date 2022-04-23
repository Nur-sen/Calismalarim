package HastaneYeni;

import Nursen_Proje_Calismalari.kitapyonetimiYENI.KitapBilgileri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class islemler {
    static Scanner scan = new Scanner(System.in);
    static  List<Doktor> doktorListesi=new ArrayList<>();
    static  List<Hasta1> hastaListesi=new ArrayList<>();
    static boolean aciliyet;
    static String aktuelDurum;
    static boolean doktorVarMi;
    static int doktorSicilNo=1006;
    static int hastaIDNo=110;
    public static void guncelHastaListesi(){
        Hasta1 hasta1=new Hasta1("Warren","Traven","Allerji",111);
        Hasta1 hasta2=new Hasta1("Petanow","William","Bas agrisi",112);
        Hasta1 hasta3=new Hasta1("Sophia","George","Diabet",113);
        Hasta1 hasta4=new Hasta1("Emma","Tristan", "Soguk alginligi",114);
        Hasta1 hasta5=new Hasta1("Darian","Luis","Migren",115);
        Hasta1 hasta6=new Hasta1("Peter","Cole","Kalp hastaliklari",116);
        hastaListesi.add(hasta1);
        hastaListesi.add(hasta2);
        hastaListesi.add(hasta3);
        hastaListesi.add(hasta4);
        hastaListesi.add(hasta5);
        hastaListesi.add(hasta6);
    }


    public static void guncelDoktorListesi(){
        Doktor doktor1=new Doktor(1000,"Nilson","Avery","Allergist");
        Doktor doktor2=new Doktor(1001,"John","Abel","Norolog");
        Doktor doktor3=new Doktor(1002,"Robert","Erik","Genel cerrah");
        Doktor doktor4=new Doktor(1003,"Marry","Jacob","Cocuk doktoru");
        Doktor doktor5=new Doktor(1004,"Alan","Pedro","Dahiliye");
        Doktor doktor6=new Doktor(1005,"Mahesh","Tristen","Kardiolog");
        doktorListesi.add(doktor1);
        doktorListesi.add(doktor2);
        doktorListesi.add(doktor3);
        doktorListesi.add(doktor4);
        doktorListesi.add(doktor5);
        doktorListesi.add(doktor6);


    }
    public static  void islemMenusu(){
        System.out.println("***** Hastane otomasyon sayfasina hos geldiniz *****");
        System.out.println("==> yapmak istediginiz islemi secin: ");
        System.out.println("==> Doktor bilgilri icin 1'e\n" +
                           "==> Hasta bilgileri icin 2'ye \n" +
                           "==> cikis icin 3'e bsin ");
        System.out.println("secim yapiniz");
        int secim=scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println(" ***** Doktor bilgi sayfasina giris yaptiniz *****");
                System.out.println("==> Doktor eklemek icin 1'e\n" +
                                   "==> Brans bilgisine gore doktor bulmak icin 2'e\n" +
                                   "==> Doktor bilgilerini silmek icin 3'e\n" +
                                   "==> Doktor listesi icin 4'e \n" );

                int doktorSecim=scan.nextInt();
                switch (doktorSecim){
                    case 1:
                        doktorEkle();
                        doktorListeleme();
                        islemMenusu();
                        break;
                    case 2:
                        doktorBulma();
                        islemMenusu();
                        break;
                    case 3:
                        doktorSistemdenCikarma();
                        islemMenusu();
                        break;
                    case 4:
                        doktorListeleme();
                        islemMenusu();
                        break;

                }break;
            case 2:
                System.out.println(" ***** Hasta bilgi sayfasina giris yaptiniz *****");
                System.out.println("==> Hasta eklemek icin 1'e\n" +
                        "==> Guncel Durumuna gore hasta bulmak icin 2'e\n" +
                        "==> Hasta bilgilerini silmek icin 3'e\n" +
                        "==> Hasta listesi icin 4'e \n" );
                int hastaSecim=scan.nextInt();
                switch(hastaSecim){
                    case 1:
                        hastaEkleme();
                        break;
                }

                break;
            case 3:
                break;


        }
    }

    private static void hastaEkleme() {
    }

    private static void cikis() {

        System.out.println("Sistemden cikis gerceklesti");
    }

    private static void doktorSistemdenCikarma() {
        System.out.println("***** Doktor silme bolumundesiniz ****** ");
        System.out.println("sistemden cikarmak istediginiz Doktor'un sicil numarasini girin :");
        int sicilNo=scan.nextInt();
        for (int i = 0; i <doktorListesi.size() ; i++) {
            if((sicilNo==doktorListesi.get(i).getDoktorSicilNo())){
                doktorVarMi=true;
                System.out.println(doktorListesi.remove(doktorListesi.get(i)));
                System.out.println("Sistemden cikarilam basariyla gerceklesti");

            }
        }

        if(!doktorVarMi){
            System.out.println("aradiginiz doktor bulunamadi.");

        }


    }

    private static void doktorEkle() {
        System.out.println("Doktor ekleme bolumundesiniz");
        scan.nextLine();//dummy
        System.out.print("Doktor adi giriniz:");
        String doktorAdi = scan.nextLine();
        System.out.print("Doktor soyad giriniz : ");
        String doktorsoyad=scan.nextLine();
        System.out.print("Bransi giriniz:");
        String brans=scan.nextLine();

        Doktor eklenenYeniDoktor= new Doktor(doktorSicilNo,doktorAdi,doktorsoyad,brans);
        doktorListesi.add(eklenenYeniDoktor);
        System.out.println("Eklemek istediginiz Doktor " + doktorSicilNo + "Sicil nosu ile sisteme basarili sekilde eklendi");
        doktorSicilNo++;

    }

    private static void doktorBulma() { System.out.println("***** Doktor arama bolumundesiniz ****** ");
        System.out.println("Aramak istediginiz Doktor'un sicil numarasini girin :");

       int sicilNo=scan.nextInt();
        for (int i = 0; i <doktorListesi.size() ; i++) {
            if ((sicilNo == doktorListesi.get(i).getDoktorSicilNo())) {
                doktorVarMi = true;
                System.out.println(doktorListesi.get(i));

            }
        }
        if(!doktorVarMi){
            System.out.println("aradiginiz doktor bulunamadi.");

        }
    }

    static void doktorListeleme() {
        System.out.println("Doktor listesi");
        for (int i = 0; i <doktorListesi.size() ; i++) {

            System.out.println(doktorListesi.get(i));
        }
    }
}


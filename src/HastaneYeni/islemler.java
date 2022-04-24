package HastaneYeni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class islemler {
    static Scanner scan = new Scanner(System.in);
    static  List<Doktor> doktorListesi =new ArrayList<>();
    static  List<Hasta1> hastaListesi =new ArrayList<>();
    static boolean aciliyet=false;
    static String aktuelDurum;
    static boolean doktorVarMi;
    static int doktorSicilNo=1006;
    static int hastaIDNo=777;





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
                                   "==> Doktor sicil No'ya gore doktor bulmak icin 2'e\n" +
                                   "==> Doktor bilgilerini silmek icin 3'e\n" +
                                   "==> Doktor listesi icin 4'e " + "\n" +
                                   "==> Doktor menusunden cikmak icin 0'a basin " );

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
                    case 0:
                        doktorMenusucikis();
                        break;

                }break;
            case 2:
                System.out.println(" ***** Hasta bilgi sayfasina giris yaptiniz *****");
                System.out.println("==> Hasta eklemek icin 1'e\n" +
                        "==> HastaID'sine gore hasta bulmak icin 2'e\n" +
                        "==> Hasta bilgilerini silmek icin 3'e\n" +
                        "==> Hasta listesi icin 4'e \n" +
                        "==> Hasta oncelik durumu icin 5'e \n" +
                        "==> Cikis icin 0'a basin" );
                int hastaSecim=scan.nextInt();
                switch(hastaSecim){
                    case 1:
                        hastaEkleme();
                        islemMenusu();
                        break;
                    case 2:
                        hastaBulma();
                        islemMenusu();
                        break;
                    case 3:
                        hastaSilme();
                        islemMenusu();
                        break;
                    case 4:
                        hastaListeleme();
                        islemMenusu();
                        break;
                    case 5:
                        hastaninOncelikDurumu();
                        islemMenusu();
                        break;
                    case 6:
                        hastaMenusundenCikis();
                        break;
                }
                break;
            case  3:
                hastaneOtomasyondanCikis();
                break;


        }
    }

    private static void hastaneOtomasyondanCikis() {

        System.out.println("Sistemden cikis gerceklesti");
    }

    private static void hastaMenusundenCikis() {
        System.out.println("==>Giris menusune donmek icin 1'i " +
                "\n==> Hastane otomasyonundan cikmak icin 2'i secin");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Hasta menusunden cikis yapildi");
                System.out.println("Islem menusune yonlendirildiniz");
                islemMenusu();
                break;
            case 2:
                hastaneOtomasyondanCikis();
                break;
        }

    }



    public static void guncelHastaListesi(){
        Hasta1 hasta1=new Hasta1("Warren","Traven","Allerji",111);
        Hasta1 hasta2=new Hasta1("Petanow","William","Bas agrisi",222);
        Hasta1 hasta3=new Hasta1("Sophia","George","Diabet",333);
        Hasta1 hasta4=new Hasta1("Emma","Tristan", "Soguk alginligi",444);
        Hasta1 hasta5=new Hasta1("Darian","Luis","Migren",555);
        Hasta1 hasta6=new Hasta1("Peter","Cole","Kalp hastaliklari",666);
        hastaListesi.add(hasta1);
        hastaListesi.add(hasta2);
        hastaListesi.add(hasta3);
        hastaListesi.add(hasta4);
        hastaListesi.add(hasta5);
        hastaListesi.add(hasta6);
    }

    public  static void hastaninOncelikDurumu() {
        System.out.println("***** HASTA ONCELIK DURUM BOLUMU *****");
        scan.next();//dummy
        System.out.println("Hastanin durumunu ogrenmek icin hasta sikayetini secin " +
                "\n==> Allerji icin 1'i \n==> Bas agrisi 2'i" +
                "\n==> Diabet icin 3'u \n==> Soguk alginligi icin 4'u " +
                "\n==> Migren icin 5'i \n==> Kalp hastaliklari icin 6'i " +
                "\n== Cikis icin 0' secin");

          int secim=scan.nextInt();
        switch(secim){
            case 1 :
               System.out.println("Hastanin oncelik durumu bulunmamaktadir.");
                break;
            case 2:
                System.out.println("Hastanin oncelik durumu bulunmamaktadir.");
                break;
            case 3:
                System.out.println("Hastanin oncelik durumu bulunmamaktadir.");
                break;
            case 4:
                System.out.println("Hastanin oncelik durumu bulunmamaktadir.");
                break;
            case 5:
                System.out.println("Oncelikli Hasta");
                break;
            case 6:
                System.out.println("Oncelikli Hasta");
                break;
            case  0:
                break;

                default:
                    System.out.println("gecerli bir durum degil");
                    break;
        }

    }

    private static void hastaSilme() {
        System.out.println("***** HASTA SILME BOLUMU ****** ");
        System.out.println("Silmek istediginiz Hastanin ID numarasini girin :");
        boolean hastaVarMi=false;
        int idNo=scan.nextInt();
        for (int i = 0; i < hastaListesi.size() ; i++) {
            if (idNo == hastaListesi.get(i).getHastaIDNo()){
                hastaVarMi = true;
                System.out.println(hastaListesi.remove(hastaListesi.get(i)));
                System.out.println("Hasta silme islemi gerceklesti.");
                System.out.println("Guncel liste asagidaki gibi:");
                hastaListeleme();

            }
        }
        if(!hastaVarMi){
            System.out.println("aradiginiz hasta bulunamadi.");

        }

    }

    private static void hastaListeleme() {
        System.out.println("***** HASTA LISTESI ******");
        for (int i = 0; i <hastaListesi.size() ; i++) {
            System.out.println(hastaListesi.get(i));
        }
    }

    private static void hastaBulma() {
        System.out.println("***** Hasta arama bolumundesiniz ****** ");
        System.out.println("Aramak istediginiz Hastanin ID numarasini girin :");
        boolean hastaVarMi=false;
        int idNo=scan.nextInt();
        for (int i = 0; i < hastaListesi.size() ; i++) {
            if (idNo == hastaListesi.get(i).getHastaIDNo()){
                hastaVarMi = true;
                System.out.println(hastaListesi.get(i));

            }
        }
        if(!hastaVarMi){
            System.out.println("aradiginiz hasta bulunamadi.");

        }
    }

    private static void hastaEkleme() {
        System.out.println(" ***** Hasta ekleme bolumundesiniz *****");
        scan.nextLine();//dummy
        System.out.print("Hasta adi giriniz:");
        String hastaAdi = scan.nextLine();
        System.out.print("Hasta soyad giriniz : ");
        String hastaSoyad=scan.nextLine();
        System.out.print("Hasta durumunu giriniz:");
        String hastaDurumu=scan.nextLine();

        Hasta1 eklenenYeniHasta= new Hasta1(hastaAdi,hastaSoyad,hastaDurumu,hastaIDNo);
        hastaListesi.add(eklenenYeniHasta);
        System.out.println("Eklemek istediginiz Hasta " + hastaIDNo + " ile sisteme basarili sekilde eklendi");
        hastaIDNo+=111;
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
    private static void doktorMenusucikis() {

        System.out.println("==>Giris menusune donmek icin 1'i " +
                           "\n==> Hastane otomasyonundan cikmak icin 2'i secin");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Doktor menusunden cikis yapildi");
                System.out.println("Islem menusune yonlendirildiniz");
                islemMenusu();
                break;
            case 2:
                hastaneOtomasyondanCikis();
                break;
        }
    }

    private static void doktorSistemdenCikarma() {
        System.out.println("***** Doktor silme bolumundesiniz ****** ");
        System.out.println("sistemden cikarmak istediginiz Doktor'un sicil numarasini girin :");
        int sicilNo=scan.nextInt();
        for (int i = 0; i < doktorListesi.size() ; i++) {
            if((sicilNo== doktorListesi.get(i).getDoktorSicilNo())){
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
        System.out.println("Eklemek istediginiz Doktor " + doktorSicilNo + " Sicil nosu ile sisteme basarili sekilde eklendi");
        doktorSicilNo++;

    }

    private static void doktorBulma() {
        System.out.println("***** Doktor arama bolumundesiniz ****** ");
        System.out.println("Aramak istediginiz Doktor'un sicil numarasini girin :");

       int sicilNo=scan.nextInt();
        for (int i = 0; i < doktorListesi.size() ; i++) {
            if ((sicilNo == doktorListesi.get(i).getDoktorSicilNo())) {
                doktorVarMi = true;
                System.out.println(doktorListesi.get(i));

            }
        }
        if(!doktorVarMi){
            System.out.println("aradiginiz doktor bulunamadi.");

        }
    }

    private static void doktorListeleme() {
        System.out.println("******DOKTOR LISTESI *****");
        for (int i = 0; i < doktorListesi.size() ; i++) {

            System.out.println(doktorListesi.get(i));
        }
    }
}


package Nursen_Proje_Calismalari.NursenDepoYonetimiYeni;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Islemler {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    static String miktar;
    static String rafNo;
    static HashMap<Integer, Urunler> urunlerMap=new HashMap<>();
    static  int id=1000;


    public static  void  girisPaneli() throws InterruptedException {
        String  secim="";

            System.out.println( "========================== İŞLEMLER =======================\r\n"
                    + "   ____________________             ____________________    \n"
                    + "   | 1-URUN TANIMLAMA  |            |  2-URUN LISTELEME |   \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                    + "   ____________________             ____________________    \n"
                    + "   | 3-URUN GIRISI     |            | 4-URUN RAFA KOY   |   \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                    + "   ____________________             ____________________    \n"
                    + "   | 5-URUN CIKISI    |            | 6-CIKIS           |    \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " );

            System.out.print("ISLEM SECİNİZ : ");
             secim = scan.next();
            switch (secim) {
                case "1":
                    urunTanimlama();
                    girisPaneli();
                    break;
                case "2"://URUN LISTELEME
                    urunListeleme();
                    girisPaneli();
                    break;
                case "3"://URUN GIRISI
                    urunGirisi();
                    girisPaneli();
                    break;
                case "4"://URUN RAFA KOY
                    urunuRafaKoyma();
                    girisPaneli();
                    break;
                case "5"://URUN CIKISI
                    urunCikisi();
                    girisPaneli();
                    break;
                case "6"://CIKIS
                    depocikis();
                    break;

            }


    }

    private static void depocikis() {
        System.out.println("sistemden cikis yapildi.");
    }

    private static void urunCikisi() {
        System.out.println("Cikisini yapacaginiz urunun Id numarasini girin: ");
        int arananId=scan.nextInt();
        if(urunlerMap.keySet().contains(arananId)){
            System.out.println("Cikisini yapmak istediginiz miktari yazin: ");
            int cikisYapilacakMiktar=scan.nextInt();
            urunlerMap.get(arananId).setMiktar(urunlerMap.get(arananId).getMiktar()-cikisYapilacakMiktar);
            System.out.println("urun cikisi yapildi.");

        }else System.out.println("urun bulunamadi");
    }

    private static void urunuRafaKoyma() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Raf girisini yapmak istediginiz urunun ID sini giriniz : ");
        int arananId=scan.nextInt();
        if(urunlerMap.keySet().contains(arananId)){
            System.out.println("Guncel raf numarasini girin: ");
            String  guncelRafNo = scan.next();
            urunlerMap.get(arananId).setRafNo(guncelRafNo);
            System.out.println("Urun Raf No guncel hale geldi;");
        } else System.out.println("aranan kayit bulunamadi");

    }

    private static void urunGirisi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("   ***      urun icin giris sayfası     ***");
        System.out.print("Giris yapmak istediginiz urunun ID sini giriniz : ");
        int arananId=scan.nextInt();
        if(urunlerMap.keySet().contains(arananId)){
            System.out.println("Guncel miktari girin: ");
            int guncelMiktar = scan.nextInt();
            urunlerMap.get(arananId).setMiktar(guncelMiktar+urunlerMap.get(arananId).getMiktar());
            System.out.println("Urun miktariniz guncel hale geldi;");
        } else System.out.println("aranan kayit bulunamadi");



        }




    private static void urunListeleme() {
        System.out.println("*****  URUN LISTELEME ***** ");
        System.out.println(	"id		ismi 	ureticisi	miktari		birimi		raf\n"+
                		"---------------------------------------------------------------");

        Set<Map.Entry<Integer,Urunler>> urunlerSetList = urunlerMap.entrySet();
        for (Map.Entry<Integer,Urunler> each: urunlerSetList) {
            Integer urunlerKey= each.getKey();
            System.out.printf("%d    %-8s       %-14s %3d          %-14s %s\n",urunlerKey,each.getValue().getUrunIsmi(),each.getValue().getUretici()
            ,each.getValue().getMiktar(),each.getValue().getBirim(),each.getValue().getRafNo());

        }



    }

    private static void urunTanimlama() {

        Scanner scan = new Scanner(System.in);
        System.out.println("======= URUN TANIMLAMA SAYFASI =======");
        System.out.println("urunun adini girin: ");
        String urunIsmi=scan.nextLine().toUpperCase();

        System.out.println("Uretici adi girin: ");
        String uretici=scan.nextLine().toUpperCase();

        System.out.println("Urun miktarini girin:" );
        int miktar=scan.nextInt();

        System.out.println("Urun birimini girin:");
        String birim=scan.next().toUpperCase();

        System.out.println("Raf no girin: ");
        String rafNo=scan.next();

        Urunler urun=new Urunler(urunIsmi,uretici,miktar,birim,rafNo);//const.
        urunlerMap.put(id,urun);
        System.out.println("Eklemek istediginiz urun " + id + " ile sisteme basarili sekilde eklendi");
        id++;
        System.out.println("Urun tanimlanmasi gerceklesti.");




    }



}

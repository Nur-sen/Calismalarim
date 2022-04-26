package NursenOkulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
  static  Scanner scan=new Scanner(System.in);
    static Map<String,String> ogretmenlerMap = new HashMap<>();


    public static void feykOgretmenEkle() {
        ogretmenlerMap.put("123456987411","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412","Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413","Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414","Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415","Alp, Yan, 1984, Matematik");
    }
    public static void ogretmenMenu() throws InterruptedException {
        String tercih="";
        do{
            System.out.println("============= YILDIZ KOLEJI =============\n" +
                    "=========== OGRETMEN MENU ============\n" +
                    "\n" +
                    "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                    "\t   2- Soyisimden Ogretmen Bulma\n" +
                    "\t   3- Branstan Ogretmen Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- ÇIKIŞ\n");
            tercih=scan.nextLine();
            switch(tercih){
                case "1"://Ogretmenler Listesi Yazdir
                    ogretmenLizdesiYazdir();
                    break;
                case "2"://Soyisimden Ogretmen Bulma
                    soyIsimdenOgretmenBulma();
                    break;
                case "3"://Branstan Ogretmen Bulma
                    branstanOretmenBulma();
                    break;
                case "4"://Bilgilerini Girerek Ogretmen Ekleme
                    ogretmenEklemeMethodu();
                    break;
                case "5"://Kimlik No Ile Kayit Silme
                    tcNoIleOgretmenSilme();
                    break;
                case "A":
                    Depo.anaMenu();
                case "a":
                    break;
                case "Q":
                case "q":
                    break;
            }

        }
        while(!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    private static void tcNoIleOgretmenSilme() {
        System.out.println("silinecek ogretmen Tc no girin: ");
        String silinecekOgretmen=scan.nextLine();

        String silinecekValue=ogretmenlerMap.get(silinecekOgretmen);

       String sonucValue= ogretmenlerMap.remove(silinecekOgretmen);
        try {
            boolean sonuc =sonucValue.equalsIgnoreCase(silinecekValue);
            System.out.println("Istenen ogretmen silindi");
        } catch (Exception e) {
            System.out.println("Istediginiz Tc numarasi ile ogretmen bulunamadi.");
        }


    }

    private static void ogretmenEklemeMethodu() {
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                          "========== OGRETMEN EKLEME  ============\n" );
        System.out.println("Tc no girin: ");
        String tcNo=scan.nextLine();
        System.out.println("isim girin: ");
        String isim=scan.nextLine();
        System.out.println("Soyisim girin: ");
        String soyIsim=scan.nextLine();
        System.out.println("Dogum yili girin: ");
        String dYili=scan.nextLine();
        System.out.println("Brans girin: ");
        String brans=scan.nextLine();
        String eklenecekValue= tcNo + ", " + isim + ", " + soyIsim + ", " + dYili +", " + brans;
        ogretmenlerMap.put(tcNo,eklenecekValue);
    }

    private static void branstanOretmenBulma() {
        System.out.println("Ogretmen brans girin: ");
        String istenenBrans=scan.nextLine();
        Set<Map.Entry<String,String>> ogretmenEntrySet=  ogretmenlerMap.entrySet();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                      "========== BRANS ILE OGRETMEN ARA  ============\n" );

        for (Map.Entry<String,String> each:ogretmenEntrySet
        ) {
            String eachKey= each.getKey();
            String eachValue= each.getValue();
            String eachValueArr[]=eachValue.split(", ");//arraye cevirdik
            if(istenenBrans.equalsIgnoreCase(eachValueArr[3])) {
                System.out.printf("%11s %-6s %-5s %9s %-8s\n", eachKey, eachValueArr[0], eachValueArr[1]
                        , eachValueArr[2], eachValueArr[3]);
            }
    }
    }

    private static void soyIsimdenOgretmenBulma() {
        System.out.println("Ogretmen soyad girin: ");
        String istenenSoyIsim=scan.nextLine();
        Set<Map.Entry<String,String>> ogretmenEntrySet=  ogretmenlerMap.entrySet();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                           "========== SOYiSIM ILE OGRETMEN ARA  ============\n" );

        for (Map.Entry<String,String> each:ogretmenEntrySet
        ) {
            String eachKey= each.getKey();
            String eachValue= each.getValue();
            String eachValueArr[]=eachValue.split(", ");//arraye cevirdik
            if(istenenSoyIsim.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%11s %-6s %-5s %9s %-8s\n", eachKey, eachValueArr[0], eachValueArr[1]
                        , eachValueArr[2], eachValueArr[3]);
            }


        }
    }

    public static void ogretmenLizdesiYazdir() {
        //  System.out.println(ogretmenlerMap); listeler ama Map seklinde yazdirir
        //liste halinde yazdirmak gerekir Set seklinde yazmak gerekiyor

         Set<Map.Entry<String,String>> ogretmenEntrySet=  ogretmenlerMap.entrySet();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                           "========== OGRETMEN LISTESI  ============\n" +
                           " TcNo        Isim   SoyIsim  D.Yili  Brans");

        for (Map.Entry<String,String> each:ogretmenEntrySet
             ) {
            String eachKey= each.getKey();
            String eachValue= each.getValue();
            String eachValueArr[]=eachValue.split(", ");//arraye cevirdik
            System.out.printf("%11s %-6s %-5s %9s %-8s\n" ,eachKey, eachValueArr[0], eachValueArr[1]
            , eachValueArr[2], eachValueArr[3]);



        }


    }
}

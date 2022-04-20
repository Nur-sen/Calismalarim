package Nursen_Proje_Calismalari.NursenUcusProjesi;

import java.util.Scanner;

public class JavaAirlens {
    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */
    static String sehir;
    static int yas;
    static int ucusTipi;
    static double priceC = 0.10 * 700;
    static double priceB = 0.10 * 500;
    static double priceD = 0.10 * 900;

   public static void ucusBilgileri() {
        Scanner scan = new Scanner(System.in);
        System.out.println("JavaAirlens'e hos geldiniz. \n gitmek istediginiz rotayi secin B C D  ");
        String sehir = scan.next().toUpperCase();
        System.out.println("ucus tipinizi secin. Tek yon icin --> 1 ' i \n cift yon icin --> 2'i \n secin");
         int ucusTipi = scan.nextInt();
        System.out.println("yasinizi girin : ");
        int yas = scan.nextInt();

    }

    public static void biletTarifesi() {

       String sehir="C";
        if (sehir.equals("B") || sehir.equals("C") || sehir.equals("D")){

            if (yas >=65) {
                if (sehir.equals("B")) {
                    if (ucusTipi == 1) {
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceB * 0.7 + "$");
                    } else if (ucusTipi == 2) {
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.7 * 0.8) * 2 + "$");
                    } else {
                        System.out.println("hatali veri girdiniz");
                    }
                } else if (sehir.equals("C")) {
                    if (ucusTipi == 1) {
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceC * 0.7 + "$");
                    } else if (ucusTipi == 2) {
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.7 * 0.8) * 2 + "$");
                    } else {
                        System.out.println("hatali veri girdiniz");
                    }
                } else if (sehir.equals("D")) {
                    if (ucusTipi == 1) {
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceC * 0.7 + "$");
                    } else if (ucusTipi == 2) {
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.7 * 0.8) * 2 + "$");
                    } else {
                        System.out.println("hatali veri girdiniz");
                    }ucusBilgileri();

                }

            } else if (yas >= 12 && yas <= 24) {
                if (sehir.equals("B")) {
                    if (ucusTipi == 1) {
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceB * 0.9 + "$");
                    } else if (ucusTipi == 2) {
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.9 * 0.8) * 2 + "$");
                    } else {
                        System.out.println("hatali veri girdiniz");
                    }
                }
                else if (sehir.equals("C")) {
                        if (ucusTipi == 1) {
                            System.out.println("Ucusunuz icin bilet odemeniz : " + priceC * 0.9 + "$");
                        } else if (ucusTipi == 2) {
                            System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.9 * 0.8) * 2 + "$");
                        } else {
                            System.out.println("hatali veri girdiniz");
                        }
                    }
                else if (sehir.equals("D")) {
                    if (ucusTipi == 1) {
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceD * 0.9 + "$");
                    } else if (ucusTipi == 2) {
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceD * 0.7 * 0.8) * 2 + "$");
                    } else {
                        System.out.println("hatali veri girdiniz");
                    }
                }


            }
            else if (yas<12){
                if (sehir.equals("B")) {
                    if (ucusTipi == 1) {
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceB * 0.5 + "$");
                    } else if (ucusTipi == 2) {
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.5 * 0.8) * 2 + "$");
                    } else {
                        System.out.println("hatali veri girdiniz");
                    }
                } if (sehir.equals("C")) {
                    if (ucusTipi == 1) {
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceB * 0.5 + "$");
                    } else if (ucusTipi == 2) {
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.5 * 0.8) * 2 + "$");
                    } else {
                        System.out.println("hatali veri girdiniz");
                    }
                }

                if (sehir.equals("D")) {
                    if (ucusTipi == 1) {
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceB * 0.5 + "$");
                    } else if (ucusTipi == 2) {
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.5 * 0.8) * 2 + "$");
                    } else {
                        System.out.println("hatali veri girdiniz");
                    }
                }
            }

        }

            }

        }







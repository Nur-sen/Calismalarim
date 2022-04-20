package Nursen_Proje_Calismalari.HastaneProje;

import JavaProjects.P08_HastaneOtomasyon.Doktor;

public class HastaneRunner {

   static boolean aciliyet = false;

    private static Hastane hastane = new Hastane();

    public static void main(String[] args) {

        String hastaDurumu = "Allerji";
        String unvan = doktorUnvanBul(hastaDurumu);
        hastane.setDoktor(doktorbul(unvan));
        System.out.println("doktor ismi: " + hastane.getDoktor().getIsim());
        System.out.println("Doktor Soyisim: " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvan : " + hastane.getDoktor().getUnvan());






    }

    public static String doktorUnvanBul(String hastaDurumu) {

        if (hastaDurumu.equals("Allerji")) {
            return hastane.unvanlar[0];
        } else if (hastaDurumu.equals("Bas agrisi")) {
            return hastane.unvanlar[1];
        } else if (hastaDurumu.equals("Diabet")) {
            return hastane.unvanlar[2];
        } else if (hastaDurumu.equals("Soguk alginligi")) {
            return hastane.unvanlar[3];
        } else if (hastaDurumu.equals("Migren")) {
            return hastane.unvanlar[4];
        } else if (hastaDurumu.equals("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }

        return "Yanlis Durum";
    }

    private static Doktor doktorbul(String unvan) {
        Doktor doktor = new Doktor();
        for (int i = 0; i < hastane.unvanlar.length; i++) {
            if (unvan.equals(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(hastane.unvanlar[i]);
            }

        }

        return doktor;

    }

    public static String hastaDurumuBul(String aktuelDurum) {

        Durum hastaDurumu = new Durum();

        if (hastaDurumu.equals("Allerji")) {
            aciliyet=false;
        } else if (hastaDurumu.equals("Bas agrisi")) {
            aciliyet = false;
        } else if (hastaDurumu.equals("Diabet")) {
            aciliyet = false;
        } else if (hastaDurumu.equals("Soguk alginligi")) {
            aciliyet = false;
        } else if (hastaDurumu.equals("Migren")) {
            aciliyet = true;
        } else if (hastaDurumu.equals("Kalp Hastaliklari")) {
            aciliyet = true;}


            return "Gecerli bir durum degil";


        }


    }



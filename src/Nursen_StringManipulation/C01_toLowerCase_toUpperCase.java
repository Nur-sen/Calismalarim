package Nursen_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        //biz String methodları arka arkaya kullanabiliriz
        //  ikinci kelimenin ilk harfini kücük yazdiralim

        //str.charAt(5) böyle yazdigimizda sonuc artik String degil char olacaktir
        // dolayisi ile Stringle yapmak istedigimiz tüm degisiklikleri
        // önce yapıp sonra charAt() methodunu kullanacagiz
        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }
}

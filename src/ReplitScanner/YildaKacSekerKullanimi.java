package ReplitScanner;

import java.util.Scanner;

public class YildaKacSekerKullanimi {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

       1 şeker = 1.7 gr
       Örnek Çıktı:
      Yılda 12.41 kg şeker kullanıyor.

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Gunde kac bardak cay iciyorsunuz : ");
        int cayBardagi=scan.nextInt();
        System.out.print("Bir bardaga kac seker atiyorsunuz: ");
        double sekerKullanimi=scan.nextDouble();
        double birSeker=1.7 ;

        sekerKullanimi*=birSeker;

        double yilliksekerMiktari= cayBardagi*sekerKullanimi*365;//

        System.out.println("yilda " +yilliksekerMiktari + " gr seker kullaniyor");


    }
}

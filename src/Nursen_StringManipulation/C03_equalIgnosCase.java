package Nursen_StringManipulation;

import java.util.Scanner;

public class C03_equalIgnosCase {

    public static void main(String[] args) {

        // kullaniciya derse katilip katilmadigini sorun
        //evet derse cevabini "derse katiliminşz saglanmistir" yazdirin
        //hayir derse cavabini "Sonraki derslerimize bekleriz" yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("derse katilmak istermisini ?  \nEvet veya Hayir yaziniz");
        String cevap=scan.next();
         if(cevap.equalsIgnoreCase("evet")){
             System.out.println("cevabiniz : " + cevap + "derse katiliminiz onaylanmıştir");

         }else if(cevap.equalsIgnoreCase("hayir")){
             System.out.println("cevabiniz : " + cevap + "sonraki derslere bekleriz");

         }else{
             System.out.println("lütfen evet veya hayir girin");
         }
    }
}

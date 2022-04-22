package ReplitFoorLoop;

import java.util.Scanner;

public class ForLoop1{
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

         char ch1= 'a' ;
	     String name =“John came late"
	     Expected Output:
         Number of a = 2*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz: ");
        String isim=scan.nextLine();
        System.out.println("bir harf girin: ");
        char harf=scan.next().charAt(0);
        int sayac=0;

        for (int i = 0; i <isim.length() ; i++) {
            if(isim.charAt(i)==harf){
               sayac++;
            }


        }
        System.out.println("isimin icinde " + harf + " harfinin sayisi : " + sayac);





    }
}

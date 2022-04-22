package Interview1;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        /*
        kullanicidan bir string isteyin
        String'de var olan her character'in tekrar sayisini
         sayisini ekrana yazdirin
        Ornek alacan a=3, l=1 ,c=1,n=1
        abaa  a=3 b=1
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string girin: ");
        String str=scan.nextLine();
        int sayac=0;
        //Array ile cozum

        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i-1].equals(arr[i])){
                sayac++;

            }else {
                System.out.println(arr[i-1]+ " sayisi: " +  (sayac+1));
                sayac=0;
            }if(i==arr.length-1){//en sona geldiginde
                System.out.println(arr[i] + " sayisi: " + (sayac+1));


            }
        }






    }
}

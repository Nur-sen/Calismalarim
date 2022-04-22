package Replit;

public class VerilendegerlerinYeriniDegistirmeSwap {
    public static void main(String[] args) {
        /*
        Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

       int a= 3;
       int b= 5;
       Ornek Cikti:
       a=5
       b=3
         */
        int a=3;
        int b=5;
        System.out.println("Swaptan once : " + " a= " + a + " b= " + b);
        int temp=b;
         b=a;
         a=temp;
        System.out.println( "Swap'tan sonra : " + " a = " + b + " b = " + a);





    }
}

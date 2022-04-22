package ReplitScanner;

public class SayilarinOrtalamasi {
    public static void main(String[] args) {
        /*
        Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.

       Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50

       Ornek Cikti:

       Sayilarin Ortalamasi : 30

         */
        int arr[]={22, 20, 30, 28, 50};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }
        System.out.println("Sayilarin ortalamasi:" + toplam/arr.length);
    }
}

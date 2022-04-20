package Array_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOlusturma {
    public static void main(String[] args) {

        //ArrayListin olusturma
        List<String> list = new ArrayList<>(); //ArrayListin yazilimi

          // List<String> list = new List<>(); yaziminda CTE hatasi veririr

        //Liste eleman ekleme : toplu ekleme yapilmaz tek tek ekleme yapilir

        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");

        //list nasil yazdirilir
        System.out.println(list); //[Ali, Veli, Ayse]
        list.add(1,"Esat");//1. index'e istenen deger atanir
        System.out.println(list); //[Ali, Esat, Veli, Ayse]
        list.add(2,"Nursen");
        System.out.println(list);//[Ali, Esat, Nursen, Veli, Ayse]









    }
}

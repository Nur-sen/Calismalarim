package Array_List;

import java.util.ArrayList;
import java.util.List;

public class ListelemanKaldirmaEkleme {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");

        //set() methodu ile yapilir

        list.set(2,"Kemal");
        System.out.println(list);//[Ali, Veli, Kemal]

        //olmayan index'i kaldirip ekleme yaparak RTE verir
    }
}

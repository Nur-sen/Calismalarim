package Array_List;

import java.util.ArrayList;
import java.util.List;

public class ListUzunluBulma {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //Liste eleman ekleme : toplu ekleme yapilmaz tek tek ekleme yapilir

        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        //list uzunlugunu bulma

        System.out.println(list.size()); // 3
    }
}

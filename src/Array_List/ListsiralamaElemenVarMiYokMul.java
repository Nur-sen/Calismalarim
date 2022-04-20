package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsiralamaElemenVarMiYokMul {
    public static void main(String[] args) {

        //Elemen var mi yokmu contains():
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");


        System.out.println(list.contains("Veli")); //true

        System.out.println(list.contains("Cemal"));//false

        //liste siralama

        Collections.sort(list);
        System.out.println(list);//[Ali, Ayse, Veli]

    }
}

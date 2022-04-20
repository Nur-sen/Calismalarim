package Array_List;

import java.util.ArrayList;
import java.util.List;

public class ListElemenSilme {
    public static void main(String[] args) {
        //Listen elemen silme

        List<Integer> list2= new ArrayList<>();

        list2.add(10);
        list2.add(15);
        list2.add(8);
        list2.add(12);
        list2.add(20);

        System.out.println(list2);//[10, 15, 8, 12, 20]

        list2.remove(1);// 1. index i silme
        System.out.println(list2);//[10, 8, 12, 20]

        System.out.println(list2.remove(2));// 2. index e kadar olan kismi siler
        // ve bize 12 yi dondurur.
        //list2.remove(5);
        // System.out.println(list2);// olmay bir index silindiginde RTE veriri (IndexOutOfBoundsException)

        //String remov edersek ;

        List<String> list3 = new ArrayList<>();

        list3.add("Ali");
        list3.add("Osman");

        System.out.println(list3.remove("Hasan")); // olmayan karakterde false doner

        System.out.println(list3.remove("Osman")); //true
        System.out.println(list3);//[Ali]

    }
}

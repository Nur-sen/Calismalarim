package Array_List;

import java.util.Arrays;

public class StringiArrayeCevirme {

    public static void main(String[] args) {
       //String'i array'e cevirme

        String str="Herkes javayi tanisa severdi";

        String arr[] =str.split("");//array'e cevirdik
        System.out.println(Arrays.toString(arr));//[H, e, r, k, e, s,  , j, a, v, a, y, i,  , t, a, n, i, s, a,  , s, e, v, e, r, d, i]

        String arr2[]=str.split("java");
        System.out.println(Arrays.toString(arr2));//[Herkes , yi tanisa severdi]


    }
}

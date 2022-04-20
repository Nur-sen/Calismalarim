package Array_List;

import java.util.Arrays;

public class ArrayiStringeCevirme {
    public static void main(String[] args) {

        //array'i Stringe cevirme

        int arr[]={5,10,25,3,16,75};

        String arrayString= Arrays.toString(arr);
        System.out.println(arrayString);//[5, 10, 25, 3, 16, 75]
        System.out.println(arrayString.substring(5));//0, 25, 3, 16, 75] koseli parantezleride eleman olarak gorup sayar
        System.out.println(arrayString.length());//22



    }
}

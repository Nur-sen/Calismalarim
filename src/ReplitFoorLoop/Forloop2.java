package ReplitFoorLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class Forloop2 {
    public static void main(String[] args) {
        /*Bir String icerisinde yinelenen karakterleri döndüren
          bir kod yazıniz.(mülakat Sorusu)
         Input :
         String str=“Javaisalsoeasy”
         Output: a s */
        String str = "Javaisalsoeasy";
        char arr[]=str.toCharArray();//her bir karakteri  bir array e donusturur
        System.out.println(Arrays.toString(arr));//[J, a, v, a, i, s, a, l, s, o, e, a, s, y]
        ArrayList<Character> output=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {//arr deki bir elemani alir
            for (int j = i+1; j <arr.length ; j++) {//her elemana bakarkem bir onceki
                if (arr[i] == arr[j] && !output.contains(arr[j])) {
                    System.out.println(arr[i]);//o elemani yazdir
                    output.add(arr[j]);//output'a ekliyor
                }

            }
        }
        System.out.println("output: " + output);//output: [a, s]

    }

        }










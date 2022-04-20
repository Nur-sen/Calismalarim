package Grup_calismasi;

import java.util.Arrays;

public class Calisma2 {
    public static void main(String[] args) {
         /* TASK :
bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
input : 1,2,-3,4,-5,-6
output :-1,-2,3,-4,5,6

 */
        int arr[]={1,2,-3,4,-5,-6};
        int yeniArr[]=new int[arr.length];
        
        elemanlarinIsaretiniDegistir(arr,yeniArr);
        


    }

    private static void elemanlarinIsaretiniDegistir(int[] arr, int[] yeniArr) {

        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i]*-1;

        }
        System.out.println(Arrays.toString(yeniArr));

    }
}

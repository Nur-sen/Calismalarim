package Constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
//her obje olusturdugumuzda yakit model gibi degerleri tet tek atama yapmak istemiyorsak

        Volvo arb1=new Volvo("XC60",false,2023,"Benzin");
        System.out.println(arb1.toString());// Mode : XC60 Yakit : Benzin Yil : 2023 Maxhiz : 240
        System.out.println(arb1);//Mode : XC60 Yakit : Benzin Yil : 2023 Maxhiz : 240
    }
}

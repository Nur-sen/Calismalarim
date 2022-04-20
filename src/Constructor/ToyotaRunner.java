package Constructor;

public class ToyotaRunner {
    public static void main(String[] args) {

        Toyota t1=new Toyota();
        System.out.println(t1.marka);//Toyota
        System.out.println(t1.tekerlekAdedi);//4
        t1.model="coeolla";
        t1.yakit="benzin";
        t1.yil=2022;
        System.out.println("T1 modeli : " +t1.model + " yakit : " + t1.yakit + " yil : " + t1.yil);

        Toyota t2=new Toyota();
        t2.model="Yaris";
        t2.yakit="Dizel";
        t2.yil=2021;
        System.out.println("T2 modeli : " +t2.model + " yakit : " + t2.yakit + " yil : " + t2.yil);
        //T2 modeli : Yaris yakit : Dizel yil : 2021
    }
}

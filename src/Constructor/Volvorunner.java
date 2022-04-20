package Constructor;

public class Volvorunner {
    public static void main(String[] args) {
        Volvo arb1= new Volvo();
        System.out.println(arb1.marka);//volvo
        arb1.yakit="Dizel";
        arb1.elektirikliMi=false;
        System.out.println(arb1.maxHiz);//240
        System.out.println(arb1.toString());//Mode : null Yakit : Dizel Yil : 0

        Volvo arb2=new Volvo();
        arb2.yakit="Elektirikli";
        arb2.elektirikliMi=true;
        arb2.model="XC90";
        System.out.println(arb2.toString());
        System.out.println(arb2.maxHiz);

    }

}

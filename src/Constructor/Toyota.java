package Constructor;

public class Toyota {
    String marka="Toyota";
    int tekerlekAdedi=4;
    boolean motoruVarmi=true;
    String model;
    int yil;
    String yakit;

    public void maxHiz(){
        if(yakit.equals("benzin")){
            System.out.println("benzinli araclar max 240 km/hiz yapar");
        }else if(yakit.equals("Dizel")){
            System.out.println("Dizel araclar max 200 km/hiz yapar");
        }

    }
    public void  renkTErcihleri(){
        if(model.equals("Corolla")){
            System.out.println("Corolla araclar icin renk tercihi kirmizi ve Sari");
        }else if(model.equals("Yaris")){
            System.out.println("Yaris araclar icin renk secenekleri Sari ve lacivert");

        }
    }



}

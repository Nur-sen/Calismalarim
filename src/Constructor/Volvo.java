package Constructor;

public class Volvo {
    String marka="Volvo";
    String mansei="Isvec";
    String model;
    boolean elektirikliMi;
    int yil;
    String yakit;
    boolean otomatikPlot=otomatikPlotsorgo();
    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektirikliMi=elk;
        yil=yl;
        yakit=ykt;
    }
    public Volvo(){

    }


    private int maxHizAta() {
        int maxHiz=0;
        if(elektirikliMi){
            maxHiz=160;
        }else{
            maxHiz=240;
        }return maxHiz;
    }

    private boolean otomatikPlotsorgo() {
        boolean sonuc=false;
        if(elektirikliMi){
            sonuc=true;

        }else{
            sonuc=false;
        }return sonuc;
    }
    public String toString(){
        String arabaOzellikler=" Mode : " + model +
                                " Yakit : " + yakit +
                                  " Yil : " + yil+
                                 " Maxhiz : " + maxHiz ;
        return arabaOzellikler;
    }
}

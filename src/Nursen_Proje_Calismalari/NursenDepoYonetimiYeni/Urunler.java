package Nursen_Proje_Calismalari.NursenDepoYonetimiYeni;

public class Urunler {

   protected    String urunIsmi;
   protected   String uretici;
   protected   int miktar;
   protected   String birim;
   protected   String rafNo;
    public Urunler( ) {

    }

    public Urunler( String urunIsmi, String uretici, int miktar, String birim, String rafNo) {

        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.rafNo = rafNo;
    }




    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRafNo() {
        return rafNo;
    }

    public void setRafNo(String rafNo) {
        this.rafNo = rafNo;
    }

    @Override
    public String toString() {
        return "Urunler{" +

                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar='" + miktar+ '\'' +
                ", birim='" + birim + '\'' +
                ", rafNo='" + rafNo + '\'' +
                '}';
    }


}

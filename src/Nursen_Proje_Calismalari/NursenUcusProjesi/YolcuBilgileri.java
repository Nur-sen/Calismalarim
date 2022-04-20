package Nursen_Proje_Calismalari.NursenUcusProjesi;

public class YolcuBilgileri {
     String sehir;
      int yas;
      int ucusTipi;

    public YolcuBilgileri(String sehir) {
        this.sehir = sehir;
    }


    public YolcuBilgileri(String sehir, int yas, int ucusTipi) {
        this.sehir = sehir;
        this.yas = yas;
        this.ucusTipi = ucusTipi;
    }

    @Override
    public String toString() {
        return "YolcuBilgileri{" +
                "sehir='" + sehir + '\'' +
                ", yas=" + yas +
                ", ucusTipi=" + ucusTipi +
                '}';
    }
}

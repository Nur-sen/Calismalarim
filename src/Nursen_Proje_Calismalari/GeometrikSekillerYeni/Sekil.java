package Nursen_Proje_Calismalari.GeometrikSekillerYeni;

public class Sekil {
      double uzunKenar;
      double kisaKenar;
      double yariCap;
      double pi=3.14;
      double kenar;
    public  Sekil(){

    }

    public Sekil(double uzunKenar, double kisaKenar, double kenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
        this.kenar = kenar;
        this.yariCap=yariCap;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                ", yariCap=" + yariCap +
                ", pi=" + pi +
                ", kenar=" + kenar +
                '}';
    }
}


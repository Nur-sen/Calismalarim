package Nursen_Proje_Calismalari.HastaneProje;

import JavaProjects.P08_HastaneOtomasyon.Doktor;
import JavaProjects.P08_HastaneOtomasyon.Hasta;

public class Hastane extends VeriBankasi{
    private Doktor doktor;
    private Hasta hasta;

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }
}

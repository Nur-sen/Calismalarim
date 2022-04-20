package Nursen_Proje_Calismalari.kitapyonetimiYENI;

public class KitapBilgileri {
    int count;
    String kitapAdi;
    String yazarAdi;
    String kitapFiyati;
    public KitapBilgileri(int count, String kitapAdi, String yazarAdi, String kitapFiyati) {
        this.count = count;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyati = kitapFiyati;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getKitapFiyati() {
        return kitapFiyati;
    }

    public void setKitapFiyati(String kitapFiyati) {
        this.kitapFiyati = kitapFiyati;
    }

    @Override
    public String toString() {
        return "KitapBilgileri{" +
                "kitap no=" + count +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapFiyati='" + kitapFiyati + '\'' +
                '}';
    }
}

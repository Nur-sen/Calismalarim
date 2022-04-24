package HastaneYeni;



public class Hasta1 {
    protected String hastaIsmi;
    protected String hastaSoyIsmi;
    protected String hastaDurumu;
    protected int hastaIDNo;

    public Hasta1(String hastaIsmi, String hastaSoyIsmi, String hastaDurumu, int hastaIDNo) {
        this.hastaIsmi = hastaIsmi;
        this.hastaSoyIsmi = hastaSoyIsmi;
        this.hastaDurumu = hastaDurumu;
        this.hastaIDNo = hastaIDNo;
    }

    public String getHastaIsmi() {
        return hastaIsmi;
    }

    public void setHastaIsmi(String hastaIsmi) {
        this.hastaIsmi = hastaIsmi;
    }

    public String getHastaSoyIsmi() {
        return hastaSoyIsmi;
    }

    public void setHastaSoyIsmi(String hastaSoyIsmi) {
        this.hastaSoyIsmi = hastaSoyIsmi;
    }

    public String getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(String hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }

    public int getHastaIDNo() {
        return hastaIDNo;
    }

    public void setHastaIDNo(int hastaIDNo) {
        this.hastaIDNo = hastaIDNo;
    }

    @Override
    public String toString() {
        return
                "hastaIsmi='" + hastaIsmi + '\'' +
                ", hastaSoyIsmi='" + hastaSoyIsmi + '\'' +
                ", hastaDurumu='" + hastaDurumu + '\'' +
                ", hastaIDNo=" + hastaIDNo;
    }
}



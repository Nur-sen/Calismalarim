package HastaneYeni;

public class Doktor {
    protected   String doktorIsmi;
    protected String doktorSoyIsmi;
    protected   String brans;
    protected int doktorSicilNo;

    public int getDoktorSicilNo() {
        return doktorSicilNo;
    }

    public void setDoktorSicilNo(int doktorSicilNo) {
        this.doktorSicilNo = doktorSicilNo;
    }

    public Doktor(int doktorSicilNo, String doktorIsmi, String doktorSoyIsmi, String brans) {
        this.doktorIsmi = doktorIsmi;
        this.doktorSoyIsmi = doktorSoyIsmi;
        this.brans = brans;
        this.doktorSicilNo=doktorSicilNo;
    }

    public String getDoktorIsmi() {
        return doktorIsmi;
    }

    public void setDoktorIsmi(String doktorIsmi) {
        this.doktorIsmi = doktorIsmi;
    }

    public String getDoktorSoyIsmi() {
        return doktorSoyIsmi;
    }

    public void setDoktorSoyIsmi(String doktorSoyIsmi) {
        this.doktorSoyIsmi = doktorSoyIsmi;
    }

    public  String  getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return " Doktor sicil no: " + doktorSicilNo+
                " doktorIsmi='" + doktorIsmi + '\'' +
                ", doktorSoyIsmi='" + doktorSoyIsmi + '\'' +
                ", brans='" + brans ;
    }


}

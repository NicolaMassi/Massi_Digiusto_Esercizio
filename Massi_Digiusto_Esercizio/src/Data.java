public class Data {
    private int giorno;
    private String mese;
    private int anno;

    public Data(){}

    public Data(int giorno, String mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public void setGiorno(int giorno){
        this.giorno = giorno;
    }

    public void setMese(String mese){
        this.mese = mese;
    }

    public void setAnno(int anno){
        this.anno = anno;
    }

    public int getGiorno(){
        return giorno;
    }

    public String getMese(){
        return mese;
    }

    public int getAnno(){
        return anno;
    }

    public String toString(){
        return giorno + mese + anno;
    }
}

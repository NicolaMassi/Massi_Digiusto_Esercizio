public class Gara {
    private Data data;
    private int oraInizio;
    private Pista pisteDisp[] = new Pista[];
    private Atleta atleti[] = new Atleta[];

    public Gara(){}

    public Gara(Data data, int oraInizio, Pista pisteDisp[], Atleta atleti[]){
        this.data = data;
        this.oraInizio = oraInizio;
        this.pisteDisp[] = pisteDisp;
        this.atleti[] = atleti;
    }

    public void setData(Data data){
        this.data = data;
    }

    public void setOraInizio(int oraInizio){
        this.oraInizio = oraInizio;
    }

    public void setPisteDisp(Pista pisteDisp[]){
        this.pisteDisp = pisteDisp;
    }

    public void setAtleti(Atleta atleti[]){
        this.atleti = atleti;
    }

    public Data getData(){
        return data;
    }

    public int getOraInizio(){
        return oraInizio;
    }

    public Pista getPisteDisp(int index){
        return pisteDisp[index];
    }

    public Atleta getAtleti(int index){
        return atleti[index];
    }    
}
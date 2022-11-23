public class Pista {

    private int numero;
    private String condizioni;
    private int lunghezza;
    private int nCorsie;


    public Pista(){}

    public Pista(int numero, String condizioni, int lunghezza, int nCorsie){

        this.numero = numero;
        this.condizioni = condizioni;
        this.lunghezza = lunghezza;
        this.nCorsie = nCorsie;

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCondizioni(String condizioni) {
        this.condizioni = condizioni;
    }

    public void setLunghezza(int lunghezza){
        this.lunghezza = lunghezza;
    }

    public void setNCorsie(int nCorsie){
        this.nCorsie = nCorsie;
    }

    public int getNumero(){
        return numero;
    }

    public String getCondizioni(){
        return condizioni;
    }

    public int getLunghezza(){
        return lunghezza;
    }

    public int getNCorsie(){
        return nCorsie;
    }
}

public class Atleta {

    private String nome;
    private String cognome;
    private Data dataNascita;    //Implementare con la classe Data
    private String specialita;

    public Atleta(){}

    public Atleta(String nome, String cognome, Data dataNascita, String specialita){

        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.specialita = specialita;

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public void setDataNascita(Data dataNascita){
        this.dataNascita = dataNascita;
    }

    public void setSpecialita(String specialita){
        this.specialita = specialita;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }
    
    public Data getDataNascita(){
        return dataNascita;
    }

    public String getSpecilita(){
        return specialita;
    }
}

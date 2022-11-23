import java.util.Scanner;
public class Main{    
    public static void main(String[] args) {
        
        Gara gara = new Gara();
        int nAtleti;
        int nPiste;
        
        int scelta = 0;
        boolean exc;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di atleti: ");
        nAtleti = input.nextInt();

        do{
            do{
                exc = false;
                try{
                    System.out.println("Scegliere una delle seguenti opzioni disponibli:\n\n");
                    System.out.println("0. Uscita dal programma.\n");
                    System.out.println("1. Visualizzare la data della gara.\n");
                    System.out.println("2. Visualizzare l'ora della gara.\n");
                    System.out.println("3. Visualizzare gli atleti in gara.\n");
                    System.out.println("4. Visualizzare le piste disponibili.\n");
                    System.out.println("5. Modificare i dati inseriti relativi alla gara.\n");
                    System.out.println("Scelta: ");
                    scelta = input.nextInt();
                }catch(Exception e){
                    System.out.println("Errore d'inseriemnto! Riprovare.\n");
                    exc = true;
                    input.nextLine();
                }
            }while(exc);

            switch(scelta){
                case 0:
                    System.out.println("Uscita dal programma in corso...");
                    break;
                case 1:
                    System.out.println("La gara si disputa il " + gara.getData().toString());
                    break;
                case 2:
                    System.out.println("La gara iniziera' alle ore " + gara.getOraInizio());
                    break;
                case 3:
                    visualizzaAtleti(nAtleti, gara);
                    break;
                case 4:
                    visualizzaPiste(nPiste, gara);
                    break;
                case 5:
                    System.out.println("Modifica dei dati inseriti\n\n");
                    modificaInserimento();
                    break;
            }
        }while(scelta != 0);
    }

    public static void visualizzaAtleti(int nAtleti, Gara gara){
        System.out.println("Gli atleti che parteciperanno alla gara sono i seguenti:\n");
        for(int i = 0; i < nAtleti; i++){
            System.out.println((i+1) + gara.getAtleti(i).toString() + ".");
        }
    }

    public static void visualizzaPiste(int nPiste, Gara gara){
        System.out.println("Le piste disponibili sono le seguenti:\n");
        for(int i = 0; i < nPiste; i++){
            System.out.println((i+1) + gara.getPisteDisp(i).toString() + ".");
        }
    }

    public static Gara modificaInserimento(Gara gara){
        
        return gara;
    }

    public static Data inserimentoData(Scanner input){

        Data dataAux;
        int giornoAux;
        String meseAux;
        int annoAux;

        System.out.print("Inserire il giorno: ");
        giornoAux = input.nextInt();
        System.out.print("Inserire il mese: ");
        meseAux = input.nextLine();
        System.out.print("Inserire l'anno: ");
        annoAux = input.nextInt();

        dataAux = new Data(giornoAux, meseAux, annoAux);

        return dataAux;

    }
        public static void inserimentoGara(Scanner input, Gara gara, Atleta atleti[], int nAtleti){

        Data dataAux;
        int giornoAux;
        String meseAux;
        int annoAux;
        int oraInizioAux;

        System.out.println("Inserimento della data della gara");
        dataAux = inserimentoData(input);

        System.out.print("Inserire l'ora di inizio: ");
        oraInizioAux = input.nextInt();

        System.out.println("Inserimento degli atleti\n");
        inserimentoAtleti(input, atleti);

    }

    public static void inserimentoAtleti(Scanner input, Atleta atleti[]){

        String nomeAux, cognomeAux, specialitaAux;
        Data dataNascitaAux;


        for(int i = 0; i < atleti.length; i++){

            System.out.print("Inserimento del "+ (i + 1) +"atleta: ");
            System.out.print("Inserire il nome: ");
            nomeAux = input.nextLine();
            System.out.print("Inserire il cognome: ");
            cognomeAux = input.nextLine();
            System.out.println("Inserimento della data di nascira dell'atleta");
            dataNascitaAux = inserimentoData(input);
            System.out.print("Inserire la specilità dell'atleta: ");
            specialitaAux = input.nextLine();

            atleti[i] = new Atleta(nomeAux, cognomeAux, dataNascitaAux, specialitaAux);
        }
            public static void inserimentoGara(Scanner input, Gara gara, Atleta atleti[], int nAtleti){

        Data dataAux;
        int giornoAux;
        String meseAux;
        int annoAux;
        int oraInizioAux;

        System.out.println("Inserimento della data della gara");
        dataAux = inserimentoData(input);

        System.out.print("Inserire l'ora di inizio: ");
        oraInizioAux = input.nextInt();

        System.out.println("Inserimento degli atleti\n");
        inserimentoAtleti(input, atleti);

    }

    public static void inserimentoAtleti(Scanner input, Atleta atleti[]){

        String nomeAux, cognomeAux, specialitaAux;
        Data dataNascitaAux;


        for(int i = 0; i < atleti.length; i++){

            System.out.print("Inserimento del "+ (i + 1) +"atleta: ");
            System.out.print("Inserire il nome: ");
            nomeAux = input.nextLine();
            System.out.print("Inserire il cognome: ");
            cognomeAux = input.nextLine();
            System.out.println("Inserimento della data di nascira dell'atleta");
            dataNascitaAux = inserimentoData(input);
            System.out.print("Inserire la specilità dell'atleta: ");
            specialitaAux = input.nextLine();

            atleti[i] = new Atleta(nomeAux, cognomeAux, dataNascitaAux, specialitaAux);
        }
    }
}

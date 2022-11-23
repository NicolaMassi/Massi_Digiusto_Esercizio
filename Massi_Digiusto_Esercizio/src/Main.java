import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Gara gara = new Gara();
        int scelta = 0;
        boolean exc;
        Scanner input = new Scanner(System.in);

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
    
}

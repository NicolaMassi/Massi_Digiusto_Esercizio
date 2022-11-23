/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Matteo
 */
public class Main {

    public static void main(String[] args) {

        int nAtleti;

        System.out.print("Inserire il numero di atleti: ");
        nAtleti = input.nextInt();


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

}

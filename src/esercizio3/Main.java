package esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RubricaTelefonica rubrica = new RubricaTelefonica();
        rubrica.add("valerio", "3456789012");
        rubrica.add("maria", "3456789013");
        rubrica.add("piero", "3456789014");
        rubrica.add("marco", "3456789015");
        rubrica.add("maurizio", "3456789016");

        System.out.println("ricerca tramite numero: inserisci il numero della persona che vuoi cercare");
        String numero = sc.next();
        System.out.println(rubrica.searchContactByNumber(numero));
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("ricerca tramite nome: inserisci il nome della persona che vuoi cercare");
        String nome = sc.next();
        System.out.println(rubrica.searchContactByName(nome));

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("inserisci il nome da cancellare");
        String Name = sc.next();
        rubrica.deleteContact(Name);
        System.out.println("-----------------------------------------------------------------------------");
        rubrica.printRubrica();
        sc.close();
    }
}
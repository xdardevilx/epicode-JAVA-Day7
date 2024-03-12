package esercizio1;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il numero degli elementi da inserire");
        int N = sc.nextInt();
        Set<String> parole = new HashSet<String>();
        System.out.println("inserisci le parole");
        for (int i = 0; i < N; i++){
            String parola = sc.next();
            if (!parole.add(parola)) {
                System.out.println("Parola duplicata: " + parola);
            }
        }

        System.out.println("parole distinte");

        for (String parola : parole){
            System.out.println(parola);
        }

        System.out.println("il numero delle parole distinte è " + parole.size());
        sc.close();
    }
}

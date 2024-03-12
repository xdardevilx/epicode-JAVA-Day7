package esercizio3;

import java.util.HashMap;

public class RubricaTelefonica {
    private HashMap<String, String> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }

    public void add(String name, String number) {
        rubrica.put(name, number);
    }

    public void deleteContact(String name) {
        rubrica.remove(name);
    }

    public String searchContactByNumber(String telephoneNumber) {
        for (String name : rubrica.keySet()) {
            if (rubrica.get(name).equals(telephoneNumber)) {
                return name;
            }
        }
        return "non è stato trovato nulla";
    }

    public String searchContactByName(String name) {
        return rubrica.get(name);
    }

    public void printRubrica() {
        for (String name : rubrica.keySet()) {
            System.out.println(name + " " + rubrica.get(name));
            System.out.println();
        }
    }
}


package esercizio2;

import java.util.*;

public class Esercizio2 {
    public static List<Integer> randomNumbers(int n) {
    List<Integer> randomList = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < n; i++){
        randomList.add(random.nextInt(101));
    }
        Collections.sort(randomList);
    return randomList;
    }

    public static List<Integer> reverseList (List<Integer> orginalList){
        List<Integer> newList = new ArrayList<>(orginalList);
        Collections.reverse(newList);
        orginalList.addAll(newList);
        return orginalList;

    }

    public static void booleanList(List<Integer> originalList, boolean condition){
    for(int i = 0; i < originalList.size(); i++){
            if(condition && i % 2 == 0){
                 System.out.println(originalList.get(i));
            }else{
                System.out.println(originalList.get(i));
            }
        }
    }


    public static void main(String[] args) {
        int N = 10;
        List<Integer> randomList = randomNumbers(N);
        System.out.println("-----------------Lista ordinata-------------------------------");
        System.out.println("Lista ordinata: " + randomList);
        System.out.println("-----------------Lista inversa-------------------------------");
        System.out.println("Lista inversa: " + reverseList(randomList));
        System.out.println("---------------------Lista in boolean true-------------------------------");
        booleanList(randomList, true);
        System.out.println("---------------------Lista in boolean false-------------------------------");
        booleanList(randomList, false);

    }
}

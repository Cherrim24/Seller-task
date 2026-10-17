import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sandbox {

    static void sellersSort(String[] cities, Map<Integer, String[]> sellers){
        for (Map.Entry<Integer, String[]> entry : sellers.entrySet()){
            for (int i = 0; i <= 0; i++) {
                String [] limited = entry.getValue();
                String [] toPrint = {};
                if (limited[i].equals(cities[i])) {
                    toPrint[i] = limited[i];
                    System.out.println(toPrint[i]);
                }
            }


        }
    }
    public static void main(String[] args) {
        String [] seller1 = {"Москва", "Самара", "Ростов"};
        String [] seller2 = {"Москва", "Самара", "Ростов", "Казань", "Курган", "Пенза"};
        String [] seller3 = {"Самара", "Ростов", "Курган", "Пенза"};
        String [] seller4 = {"Москва", "Казань", "Тула"};
        String [] cities = {"Москва", "Казань", "Тула"};
        Map<Integer, String[]> sellers = new HashMap<>();
        sellers.put(1, seller1);
        sellers.put(2, seller2);
        sellers.put(3, seller3);
        sellers.put(4, seller4);

        Sandbox.sellersSort(cities, sellers);





    }


}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add( "Mars");
        myList.add("Mercury");
        myList.add("Jupiter");
        myList.add("Saturn");
        System.out.println("Imprimir list (respeta orden (mas lento)): ");
        imprimirCollection(myList);

        // myList.forEach(item -> {
        //    System.out.println("item = " + item);
        // });

        Set mySet = new HashSet();
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        System.out.println("Imprimir set (no respeta orden): ");
        imprimirCollection(mySet);

        Map myMap = new HashMap();
        myMap.put("Value1", "Tony");
        myMap.put("Value2", "Canccelara");
        myMap.put("Value3", "Cavendish");

        String element = (String) myMap.get("Value2");
        System.out.println("element = " + element);
        imprimirCollection(myMap.keySet());
        imprimirCollection(myMap.values());
    }

    public static void imprimirCollection(Collection collection){
        /*for (Object element: collection
             ) {
            System.out.println("element = " + element);
        }*/

        collection.forEach(element -> System.out.println("element = " + element));
    }
}
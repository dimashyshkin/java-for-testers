import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> ourList = new ArrayList<>();

        ourList.add("Dmitry");
        System.out.println(ourList);

        ourList.add("Olga");
        System.out.println(ourList);

        ourList.add("Roman");
        System.out.println(ourList);

        System.out.println(ourList.get(0));

        ourList.set(0, "Alex");
        System.out.println(ourList);

        String removed = ourList.remove(0);
        System.out.println(ourList);
        System.out.println(removed);


        ourList.add("John");
        ourList.add("Bill");
        ourList.add("Arthur");
        ourList.add("Sofia");

        System.out.println("There are " + ourList.size() + " items in the list");

        System.out.println(ourList + " contains Dmitry: " + ourList.contains("Dmitry"));
        System.out.println(ourList + " contains Olga: " + ourList.contains("Olga"));

        System.out.println("Index of Olga is: " + ourList.indexOf("Olga"));
        System.out.println("Is empty: " + ourList.isEmpty());

        System.out.println(" - - - - - - ");

        for (String value : ourList) {
            System.out.println(value);
        }

        Iterator<String> iterator = ourList.iterator();
        String name = iterator.next();
        System.out.println("Name is: " + name);
        name = iterator.next();
        System.out.println("Second name is: " + name);
    }
}

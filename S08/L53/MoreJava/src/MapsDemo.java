import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> age = new HashMap<>();
        age.put("Dmitry", 33);
        age.put("Olga", 33);
        age.put("Roman", 3);
        System.out.println(age);

        System.out.println("Age of Dmitry is " + age.get("Dmitry"));

        System.out.println("All keys: " + age.keySet());
        System.out.println("All values: " + age.values());
        System.out.println("All pairs: " + age.entrySet());

        age.replace("Dmitry", 34);
        System.out.println(age);

        age.remove("Olga");
        System.out.println(age);
    }
}

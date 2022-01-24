public class JavaLoops {
    public static void main(String[] args) {
        int pages = 12;
        for (int i = 1; i <= pages; i++) {
            // Execute some code on each page
            System.out.println(i);
        }

        String[] students = {"Dmitry", "Olga", "Roman"};
        for (String student : students) {
            System.out.println(student);
        }
    }
}

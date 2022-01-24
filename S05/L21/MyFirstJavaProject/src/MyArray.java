public class MyArray {
    public static void main(String[] args) {
        String[] students = {"Dmitry", "Olga", "Roman"};
        int[] numbers = {1, 5, 10, 100};

        System.out.println(students[0]);

        students[0] = "James";
        System.out.println(students[0]);

        System.out.println("There are " + students.length + " students in the class");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

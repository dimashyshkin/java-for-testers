public class Homework4 {
    public static void main(String[] args) {
        // Write a loop, that will replace all letters o in the sentence with 0
        String str = "Hello world!";
        String newStr = "";
        int index = 0;
        while (index < str.length()) {
            char x = str.charAt(index);
            if (x == 'o') {
                newStr = newStr + 0;
            } else {
                newStr = newStr + x;
            }
            index++;
        }
        System.out.println(newStr);
    }
}

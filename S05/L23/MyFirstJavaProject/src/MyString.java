import java.util.Locale;

public class MyString {
    public static void main(String[] args) {
        String hello = "Hello, Dmitry!";
        System.out.println(hello);

        int stringLength = hello.length();
        System.out.println(stringLength);

        String helloUp = hello.toUpperCase();
        System.out.println(helloUp);

        String helloLow = hello.toLowerCase();
        System.out.println(helloLow);

        String addStrings = helloLow + helloUp;
        System.out.println(addStrings);

        String stringWithInt = hello + ", this string length is: " + stringLength;
        System.out.println(stringWithInt);

        String movie = "My favorite movie is \n\"Home Alone\"";
        System.out.println(movie);
    }
}

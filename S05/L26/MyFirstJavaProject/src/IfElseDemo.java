public class IfElseDemo {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            System.out.println("x is 10");
        } else if (x > 10) {
            System.out.println(x + " is more than 10");
        } else {
            System.out.println(x + " is less than 10");
        }

        boolean cold = true;
        int time = 1900;
        if (time < 1200) {
            System.out.println("Good morning");
        } else if (time >= 1200 && time < 1800) {
            System.out.println("Good afternoon");
        } else {
            if (cold) {
                System.out.println("Good evening, it's cold");
            } else {
                System.out.println("Good warm evening");
            }
        }
    }
}

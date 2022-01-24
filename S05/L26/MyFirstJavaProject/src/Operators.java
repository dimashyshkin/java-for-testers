public class Operators {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println(++a);
        System.out.println(++a);
        System.out.println(++a);

        System.out.println(--b);
        System.out.println(--b);
        System.out.println(--b);

        int c = 10;
        c += 3;
        System.out.println(c);

        int sum = a + b;
        System.out.println(sum);

        System.out.println(a == b);
        System.out.println(a != b);


        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        System.out.println("-------------");

        System.out.println(3 > 2 && 10 < 9);
        System.out.println(3 > 2 || 10 < 9);


    }
}

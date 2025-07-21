import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double  a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        String result1 = String.format("%.3f", a);
        String result2 = String.format("%.3f", b);
        String result3 = String.format("%.3f", c);
        System.out.println(a+" + "+b+" + "+c);
    }
}
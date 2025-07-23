import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b + c);
        System.out.println(everage(a,b,c));
        System.out.println((subtraction(a,b,c)));

    }

    public static int everage(int a, int b, int c) {

        int average = (a+b+c)/3;
        return average;
    }
    public static int subtraction (int a, int b, int c) {
        int sum = a + b + c;
        return sum - everage(a,b,c);
    }

}

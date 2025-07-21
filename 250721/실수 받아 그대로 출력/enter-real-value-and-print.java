import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        a = Math.round(a * 1000) / 1000.0; 
        String result = String.format("%.2f", a);
        System.out.println(result);
    }
}
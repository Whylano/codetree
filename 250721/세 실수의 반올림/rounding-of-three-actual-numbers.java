import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double  a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        a = Math.round(a * 1000) / 1000.0; 
        b = Math.round(b * 1000) / 1000.0; 
        c = Math.round(c * 1000) / 1000.0; 
        System.out.printf("%.3f\n" ,a);
        System.out.printf("%.3f\n" ,b);
        System.out.printf("%.3f" ,c);
    }
}
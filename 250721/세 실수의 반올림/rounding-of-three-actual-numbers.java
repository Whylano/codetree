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
        String result1 = String.format("%.3f", a);
        String result2 = String.format("%.3f", b);
        String result3 = String.format("%.3f", c);
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        System.out.println(a+"\n"+b+"\n"+decimalFormat.format(c));
    }
}
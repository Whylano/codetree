import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b + " "+everage(a,b));

    }
    public static String everage(int a, int b) {
        String res = "";
        double average = (double) (a+b)/2;
        res += average;
        return res;
    }
}
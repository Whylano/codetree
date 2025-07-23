import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res1 = new StringBuilder();
        int a = sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            res1.append((a*i)+" ");
        }
        System.out.println(res1);
    }
}

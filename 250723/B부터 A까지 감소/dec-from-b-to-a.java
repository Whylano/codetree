import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder res1 = new StringBuilder();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int inRes = b;
        for (int i = 0; i <= (b-a); i++) {
            res1.append((inRes)+" ");
            inRes += -1;
        }
            System.out.println(res1);
    }
}

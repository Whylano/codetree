import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            res.append(a);
        }
        System.out.println(res);

    }
}

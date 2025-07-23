import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String res ="";
        if(a<b){
            res +="1";
        }else{
            res +="0";
        }
        if(a==b){
            res +=" 1";
        }else{
           res +=" 0";
        }
        System.out.println(res);
    }
}

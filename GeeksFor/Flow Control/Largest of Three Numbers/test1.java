import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans1 = Math.max(a,b);
        int ans = Math.max(ans1,c);
        System.out.println(ans);
    }
}

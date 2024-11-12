import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextByte();
        if (a>=b && a>=c){
            System.out.println(a);
        } else if (b>=a && b>=c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

    }
}
///& operator isliye cux ek bhi false hua toh overall statement false hojana chaheye isliye & use kiye

import java.util.Scanner;
public class scanner_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("the entered string is " + s);
        int x = sc.nextInt();
        System.out.println("the entered integer is " + x);
        float y = sc.nextFloat();
        System.out.println("the  entered float is "+y);
    }
}

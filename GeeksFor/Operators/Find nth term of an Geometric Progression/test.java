import java.util.Scanner;

///give will be a,r,n
/// formula ar^n-1


public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of r = ");
        int r = sc.nextInt();
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        int nthTermOfGp = a*(int)(Math.pow(r,n-1));
        System.out.print("The " +n+" th "+"term of an GP is = " + nthTermOfGp);

    }
}

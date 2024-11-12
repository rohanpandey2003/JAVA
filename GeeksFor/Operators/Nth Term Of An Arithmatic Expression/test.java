import java.util.Scanner;

///a will be given
///d will be given
/// N will  be give
/// scanner lagana padega a N d me
/// initalize krna padega

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of d = ");
        int d = sc.nextInt();
        System.out.print("Enter the value of N = ");
        int N = sc.nextInt();
        int nthTerm = a+(N-1)*d;
        System.out.print("the " + N + "th " + "term of an AP is = " + nthTerm);
    }

}

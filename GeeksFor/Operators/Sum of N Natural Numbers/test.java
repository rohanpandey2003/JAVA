import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n :- ");
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        System.out.println("the value of the sum of " + n + " natural numbers are :- " + sum);
        ///here the formula is derived from Arithmatic progression
        ///the precendece of multiplication and division is same hence it will do the sum from left to right in the fomrula


    }
}

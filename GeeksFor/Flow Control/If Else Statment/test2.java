import java.util.Scanner;

///else statement is optional you can write a code without else statement and only if statement
///Writing the previous code without else
public class test2 {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.print("Enter the number n :- ");
        int n = print.nextInt();
        if(n<0){
            System.out.println("Invalid Number");
        }
        System.out.println("the sum of first " + n + " natural number is:- " + n*(n+1)/2);

    }
}

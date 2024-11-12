import java.util.Scanner;

///to take a number n from the use and print the sum of first n natural number and if the number is negative then
/// show the message error
public class test1 {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.print("Enter the number n :- ");
        int n = print.nextInt();
        int sum = n*(n+1)/2;
        if(n>0){
            System.out.print("the number is positive and the sum of natural numbers till n is :- " + sum);

        }
        else{
            System.out.println("ERROR");
        }

    }
}

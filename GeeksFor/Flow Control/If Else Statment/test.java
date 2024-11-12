///If Else Statements :- They are also called conditional statements or control statements
/* if(condition)
 {
  Statements to be executed when condition is true
  }
 else
 {
Statements to be executed when condition is not true }*/

import java.util.Scanner;

/// the basic statements of if else
///




public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :- ");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("the number is even");

        }
        else {
            System.out.println("the number is odd");
        }
    }
}

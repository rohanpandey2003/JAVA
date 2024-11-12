import java.util.Scanner;

///enter the number and print the 5 possible outcome if even print positive or negative same with odd and if zero print 0

public class test3 {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.print("Enter the number n :- ");
        int n = print.nextInt();
        if(n==0){
            System.out.println("the number is zero");
        }
        else if (n%2!= 0) {
            System.out.println("The number is odd");
            if(n>0){
                System.out.print(" And the number is positive");
            }
            else {
                System.out.println(" And the number is negative");
            }




        }
        else{
                System.out.println("the entered number is even");
                if(n>0){
                    System.out.print(" And it is positive");

                }
                else{
                    System.out.println(" And it is negative");
                }

        }

    }
    ///isko aese bhi kr sakte the if me statement n>0 dalte and then nested loop me n%2==0 wali statement aese he else if me n<0 then nested loop me odd wali statement then else me SOP("print zero") ezzy

}

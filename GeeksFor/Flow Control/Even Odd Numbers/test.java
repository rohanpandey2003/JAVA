import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of cups :- ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("OPPONENT");
        }
        else {
            System.out.println("YOU");
        }
    }
}

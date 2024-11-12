import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :- ");
        int n = sc.nextInt();
        int remainder = n%10;
        int y = Math.abs(remainder);
        System.out.println("the last digit is :- " + y);

    }
}
///absolute isliye liye because agar negative number rha toh uska remainder negative ata hai and last digit kese negative hogga thats why


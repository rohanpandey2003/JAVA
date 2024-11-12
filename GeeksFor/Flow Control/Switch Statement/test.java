import java.util.Scanner;

///when you have a fixed variable and according to the value of this variable you have multiple branches you use a switch statement
///ek variable k multiple values rhti hai isliye switch statment us ekrte hai
/// agar break statment nai lagega toh code sare cases ko impliment kr dega
///default keyword is for switch purpose
/// we can have string as part of the switch cases from java 7 onwards
/// same as if elseif else statements bas isme elseif statemnt bht sare rhenge
public class test {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        Scanner sc = new Scanner(System.in);
        char move = sc.next().charAt(0);
        switch (move){
            case 'l' :
                x--;
                break;
            case 'r' :
                x++;
                break;
            case 'u' :
                y++;
                break;
            case 'd' :
                y--;
                break;
            default:
                System.out.println("invalid");
        }

    }
}

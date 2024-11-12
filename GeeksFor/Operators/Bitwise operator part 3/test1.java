///Unsigned Right Shift Operator :- basically in case of negative number the leading bits were converted to 1 but here the leading bits are converted to 0 like in case of positive numbers
/// The negative number becomes positive in unsigned right shift operator
/// x:111....10
/// (x>>>1):011....11----->hence the positive number
///(x>>>2):001......11------>the leading bits are zeros and last bits are ignored
///



public class test1 {
    public static void main(String[] args) {
        int x = -2;
        System.out.println(x>>>1);
        System.out.println(x>>>2);

    }
}

///Bitwise not or bitwise compliment:-it basically takes input number consider in binary bit
/// and convert in to opposite bits for example 0 to 1 and converts 1 to 0
/// for example  x = 000......01(32 digits)
///             ~x = 111......10(32 digits)
///In java positive number are stored using simple basic decimal to binary conversions for
/// example +3(decimal) - 00000..11(32 digits) binary
/// But in case of b=negative numbers they are stored in 2's compliment
/// meaning if the left most bit is 0 means trailing zeros then it is a positive number
/// otherwise it is a negative number
/// x = 000......01(32 digits)---------->it is a positive number
///~x = 111......10(32 digits)------->it is a negative number after doing compliment
/// #2's compliment representation:-
/// if u given a number -x then its 2's compliment representation is 2^32 - x
/// Get the number by putting in to the formula then do the simple binary conversion then the given binary number is the
/// 2's representation of -x
/// for example 2^32 - 1 = 111..11(32 times 1)
/// 2^3 - 1 = 111(3 times 1 means 7 ka binary is 111)
///  x = 000......01(32 digits)
///~x = 111......10(32 digits)--->this number is basically 2^32 - 1 - 1 means 2^32 - 2 by comparing with the formula the number is basically binary representation of -2
/// for example x = 00000...0101
///            ~x = 11111...1010----> here we have subtracted 5 from the binary basically we have subtracted 101 from the binary but 101 is 5 in decimal therefore 2^32 - 1 -5 hence the number is -6
///~x------->it is representation of not operator once applied all the bits get inverted and you get negative for positive and positive for the negative
///








public class test {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(~x);
    }
}

///left shift operator:-it takes a number whose binary representation is to be shifted and takes another number on how many times we have to shift the binary representation of the number it returns the integer value of new binary representation we get
/// x = 000...0011(32 digits)
/// (x<<1) = 000...0110(32 digits)---> 6 </1)> sare numbers left me shift hogye since 32 digits he rhenge toh ek zero end me chala gya
/// here the 1st bit is ignored and the remaing 31 bits moved ahead and 0 is added at the end
///  if we do this 3<<30 then the leading number is 1(11000...00) thus the positive number can be converted in to negative using ledt shift
///jitta number dalega utte agge k bits ignore hojanege and then utte bits piche lag janege
/// Now we have x = -1 means 2^32 - 1
/// x = 11111..111
/// now x<<1,then the 1st bit is ignored and the whole is moved left side and the zero is added in the end
/// (x<<1) -----> 11111...110 thus it is 2^32 -1 -1 therefor it is 2^32 - 2 thus the number is 2
/// Now left shift operator basically means multiplication of 2 if you left shift a number x by y youre result is x*2^y






public class test1 {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(x<<1);
        System.out.println(x<<2);
        System.out.println(x<<30);
        int y = 4;
        int z = x<<y;
        System.out.println(z);
        int a = -1;
        System.out.println(a<<1);
    }
}

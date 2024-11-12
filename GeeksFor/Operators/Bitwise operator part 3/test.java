///Right shift operator is basically opposite of left shit
/// for example x>>1 here the last most 1 bit is ignored and the other bits are moved right and the zero is added in the front
/// for example x : 00...100001
///        (x>>1) : 000...10000(decimal value is 16)
///        (x>>2) : 0000...1000
/// here the first 30 bits are moved to the right side and last 2 bits are ignored and have 2 new zeroes at the front
///In case of negatives it is different it fills the leading bits with 1 in case of positive it fills with zero in negative it does so because the number remains negative thats why
/// for example x : 1111...10(-2)
///         (x>>1): 11111..11----> here the last bit is ignored and all the bits moved right by 1 and leading bit is 1 added
///if u shift -2 with any value greater than or equals to 1 then you will get -1 only
///



public class test {
    public static void main(String[] args) {
        int x = 33;
        System.out.println(x>>1);
        System.out.println(x>>2);
        int a = -2;
        System.out.println(a>>1);
        System.out.println(a>>2);
    }
}

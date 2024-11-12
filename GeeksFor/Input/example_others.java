class point{
    int x;
    int y;
}

public class example_others {
    public static void main(String[] args) {
        point obj1 = new point();
        obj1.x = 10;
        obj1.y=12;
        point obj2 = obj1;
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        obj2.y = 34;
        System.out.println(obj2.y);

    }
}

import java.io.*;
public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a string :- ");
        String s = br.readLine();
        System.out.println("the name is :- " + s);
    }
}

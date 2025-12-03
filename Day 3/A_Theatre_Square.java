import java.util.Scanner;

public class A_Theatre_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();// taking inputs from user
        Long m = in.nextLong();
        Long a = in.nextLong();
        Long result = ((n + a - 1) / a) * ((m + a - 1) / a);// calculating number of flagstones needed
        System.out.println(result);// printing the result
    }
}

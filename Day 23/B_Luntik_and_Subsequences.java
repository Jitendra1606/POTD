import java.util.Scanner;

public class B_Luntik_and_Subsequences {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int one = 0;
            int zero = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    zero++;
                } else if (arr[i] == 1) {
                    one++;
                }
            }
            long ans = (1L << zero) * one;
            System.out.println(ans);
        }
    }
}
// 1 will decide number of ways(if only 1 is present then with this 1 only one
// combination is possible and if 2 one are present then we will have 2 times
// the combinaation)
// here most important is zero , the presence of zero decides the number of ways
// bcz 0 does not imply any effect on sum but it will affect our subsequences
// as we know nC0 + nC1 + nC2 ... = 2^n
// this contains every possible way of how zero is present in our combinations
// one 0 present or two zero present and every combiation on different indices
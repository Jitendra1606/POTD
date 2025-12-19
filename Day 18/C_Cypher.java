import java.net.SocketPermission;
import java.util.Scanner;

public class C_Cypher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            for (int k = 0; k < n; k++) {
                int o = in.nextInt();
                String s = in.next();
                int digit = arr[k];
                for (int j = 0; j < o; j++) {
                    char c = s.charAt(j);
                    if (c == 'U') {
                        digit--;
                        if (digit < 0)
                            digit = 9;
                    } else {
                        digit++;
                        if (digit > 9)
                            digit = 0;
                    }
                }
                arr[k] = digit;
            }
            for (int r = 0; r < n; r++) {
                System.out.print(arr[r] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
import java.util.*;

public class P090 {
    private static final int[] divide = new int[]{11, 7, 5, 3, 2};

    private static void primeFactorization(int n, StringBuilder sb) {
        int[] count = new int[5];
        for (int i = 0; i < 5; i++) {
            while (n % divide[i] == 0) {
                count[i]++;
                n /= divide[i];
            }
        }

        for (int i = 4; i >= 0; i--) {
            sb.append(count[i]).append(" ");
        }
        sb.append("\n");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            sb.append("#").append(testCase).append(" ");
            primeFactorization(n, sb);
        }
        System.out.print(sb.toString());
    }
}

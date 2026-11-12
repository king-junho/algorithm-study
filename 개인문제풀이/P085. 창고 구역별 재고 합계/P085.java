import java.util.Scanner;

public class P085 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int q = sc.nextInt();
            int[][] storage = new int[h + 1][w + 1];
            long[][] dp = new long[h + 1][w + 1];

            for (int row = 1; row <= h; row++) {
                for (int col = 1; col <= w; col++) {
                    storage[row][col] = sc.nextInt();
                }
            }

            for (int row = 1; row <= h; row++) {
                for (int col = 1; col <= w; col++) {
                    if (row == 1) {
                        dp[row][col] = storage[row][col] + dp[row][col - 1];
                    } else if (col == 1) {
                        dp[row][col] = storage[row][col] + dp[row - 1][col];
                    } else {
                        dp[row][col] = dp[row][col - 1] + dp[row - 1][col]
                                - dp[row - 1][col - 1] + storage[row][col];
                    }
                }
            }

            sb.append("#").append(testCase).append(" ");

            for (int i = 0; i < q; i++) {
                int r1 = sc.nextInt();
                int c1 = sc.nextInt();
                int r2 = sc.nextInt();
                int c2 = sc.nextInt();

                long result = dp[r2][c2] - dp[r1 - 1][c2] - dp[r2][c1 - 1]
                        + dp[r1 - 1][c1 - 1];
                sb.append(result).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}

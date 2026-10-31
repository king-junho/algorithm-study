import java.util.Scanner;

public class P078Review1 {
    private static int n;
    private static int m;
    private static long k;

    private static int backtrack(int[] prices, int depth, int currentIdx, long sum) {
        if (depth == m) {
            if (sum == k) {
                return 1;
            } else {
                return 0;
            }
        }
        int count = 0;
        for (int i = currentIdx; i < n; i++) {
            count += backtrack(prices, depth + 1, i + 1, sum + prices[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int testCase = 1; testCase <= t; testCase++) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextLong();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) prices[i] = sc.nextInt();
            sb.append("#").append(testCase).append(" ")
                    .append(backtrack(prices, 0, 0, 0)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

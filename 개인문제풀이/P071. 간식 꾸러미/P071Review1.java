import java.util.Scanner;

public class P071Review1 {
    private static int maxCount(int[] prices, int b) {
        int left = 0;
        int result = 0;
        long sum = 0;
        for (int right = 0; right < prices.length; right++) {
            sum += prices[right];
            while (sum > b) {
                sum -= prices[left];
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int b = sc.nextInt();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) prices[i] = sc.nextInt();
            sb.append("#").append(testCase).append(" ")
                    .append(maxCount(prices, b)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

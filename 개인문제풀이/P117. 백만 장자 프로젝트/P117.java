import java.util.Scanner;
class Solution {
    private static long maxBenefit(int[] prices) {
        long benefit = 0;
        long maxPrice = prices[prices.length - 1];

        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            } else {
                benefit += maxPrice - prices[i];
            }
        }
        return benefit;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int test_case = 1; test_case <= t; test_case++) {
            int n = sc.nextInt();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }
            sb.append("#").append(test_case).append(" ").append(maxBenefit(prices)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

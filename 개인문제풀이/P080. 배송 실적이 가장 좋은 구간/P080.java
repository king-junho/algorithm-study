import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class P080 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] delivery = new int[n];
            for (int i = 0; i < n; i++) {
                delivery[i] = sc.nextInt();
            }

            int left = 0;
            long maxSum = 0;
            long sum = 0;
            int start = 0;
            for (int right = 0; right < n; right++) {
                sum += delivery[right];
                if (right - left + 1 == k) {
                    if (sum > maxSum) {
                        maxSum = sum;
                        start = left;
                    }
                    sum -= delivery[left];
                    left++;
                }
            }
            sb.append("#").append(testCase).append(" ")
                    .append(start + 1).append(" ").append(maxSum).append("\n");
        }
        System.out.print(sb.toString());
    }
}

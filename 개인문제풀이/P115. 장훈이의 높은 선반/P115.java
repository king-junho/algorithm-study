import java.awt.*;
import java.util.*;

class Solution {
    private static int result;

    private static void findMinHeight(int[] heights, int startIdx, int remaining) {
        int n = heights.length;
        for (int i = startIdx; i < n; i++) {
            int currentHeight = heights[i];

            if (remaining <= currentHeight) {
                result = Math.min(result, currentHeight - remaining);
                continue;
            }

            findMinHeight(heights, i + 1, remaining - currentHeight);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int b = sc.nextInt();
            int[] heights = new int[n];
            result = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                heights[i] = sc.nextInt();
            }

            findMinHeight(heights, 0, b);
            sb.append("#").append(testCase).append(" ").append(result).append("\n");
        }
        System.out.print(sb.toString());
    }
}

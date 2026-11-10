import java.util.*;

public class P093 {
    private static int lookView(int[] buildings) {
        int result = 0;
        int n = buildings.length;
        int[] dp = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(buildings[0]);
        pq.add(buildings[1]);
        pq.add(buildings[2]);
        pq.add(buildings[3]);

        for (int idx = 2; idx < n - 2; idx++) {
            pq.remove(buildings[idx]);
            pq.add(buildings[idx + 2]);

            int maxValue = pq.peek();
            dp[idx] = (buildings[idx] - maxValue) > 0 ? buildings[idx] - maxValue : 0;

            pq.add(buildings[idx]);
            pq.remove(buildings[idx - 2]);
        }

        return Arrays.stream(dp).sum();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int testCase = 1; testCase <= 10; testCase++) {
            int n = sc.nextInt();
            int[] buildings = new int[n];
            for (int i = 0; i < n; i++) {
                buildings[i] = sc.nextInt();
            }

            sb.append("#").append(testCase).append(" ").append(lookView(buildings)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

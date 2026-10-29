import java.awt.Point;
import java.util.PriorityQueue;
import java.util.Scanner;
class Node implements Comparable<Node> {
    int row, col, cost;
    public Node(int row, int col, int cost) {
        this.row = row; this.col = col; this.cost = cost;
    }
    @Override public int compareTo(Node o) { return Integer.compare(cost, o.cost); }
}
public class P066 {
    private static final int[] dr = {-1, 1, 0, 0};
    private static final int[] dc = {0, 0, -1, 1};
    private static int dijkstra(int[][] costs, int[][] dp) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(0, 0, costs[0][0]));
        dp[0][0] = costs[0][0];
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int nowRow = current.row, nowCol = current.col;
            int cost = current.cost;
            if (cost > dp[nowRow][nowCol]) continue;
            for (int direction = 0; direction < 4; direction++) {
                int nr = nowRow + dr[direction], nc = nowCol + dc[direction];
                if (nr < 0 || nc < 0 || nr >= dp.length || nc >= dp[0].length) continue;
                int nextCost = cost + costs[nr][nc];
                if (nextCost < dp[nr][nc]) {
                    dp[nr][nc] = nextCost;
                    pq.offer(new Node(nr, nc, nextCost));
                }
            }
        }
        return dp[costs.length - 1][costs[0].length - 1];
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int testCase = 1; testCase <= t; testCase++) {
            int rows = sc.nextInt(), cols = sc.nextInt();
            int[][] costs = new int[rows][cols], dp = new int[rows][cols];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    costs[row][col] = sc.nextInt();
                    dp[row][col] = Integer.MAX_VALUE;
                }
            }
            sb.append("#").append(testCase).append(" ").append(dijkstra(costs, dp)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

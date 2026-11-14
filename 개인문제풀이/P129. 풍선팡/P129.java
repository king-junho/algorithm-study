import java.util.Scanner;

class Solution {
    private static final int[] dr = {-1, 1, 0, 0};
    private static final int[] dc = {0, 0, -1, 1};

    private static int maxLeaf(int[][] map) {
        int best = 0;
        int H = map.length;
        int W = map[0].length;
        for (int row = 0; row < H; row++) {
            for (int col = 0; col < W; col++) {
                int count = map[row][col];
                int sum = count;
                for (int direction = 0; direction < 4; direction++) {
                    for (int i = 1; i <= count; i++) {
                        int nr = row + dr[direction] * i;
                        int nc = col + dc[direction] * i;
                        if (nr >= 0 && nr < H && nc >= 0 && nc < W) {
                            sum += map[nr][nc];
                        }
                    }
                }
                best = Math.max(best, sum);
            }
        }
        return best;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int test_case = 1; test_case <= t; test_case++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] map = new int[n][m];
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < m; col++) {
                    map[row][col] = sc.nextInt();
                }
            }
            sb.append("#").append(test_case).append(" ").append(maxLeaf(map)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

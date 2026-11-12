import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Solution {
    private static final int[] dr = {-1, 1, 0, 0};
    private static final int[] dc = {0, 0, -1, 1};

    private static int isEscape(int[][] map, Point startPoint) {
        int n = map.length;
        boolean[][] visited = new boolean[n][n];
        Queue<Point> queue = new ArrayDeque<>();
        visited[startPoint.y][startPoint.x] = true;
        queue.offer(startPoint);

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int row = current.y;
            int col = current.x;

            for (int direction = 0; direction < 4; direction++) {
                int nr = row + dr[direction];
                int nc = col + dc[direction];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                    continue;
                }
                if (map[nr][nc] == 3) {
                    return 1;
                }
                if (!visited[nr][nc] && map[nr][nc] == 0) {
                    visited[nr][nc] = true;
                    queue.offer(new Point(nc, nr));
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int testCase = 1; testCase <= 10; testCase++) {
            int t = sc.nextInt();
            int[][] map = new int[16][16];
            Point startPoint = new Point();

            for (int i = 0; i < 16; i++) {
                String line = sc.next();
                for (int j = 0; j < 16; j++) {
                    int value = line.charAt(j) - '0';
                    if (value == 2) {
                        startPoint = new Point(j, i);
                    }
                    map[i][j] = value;
                }
            }
            sb.append("#").append(t).append(" ")
                    .append(isEscape(map, startPoint)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

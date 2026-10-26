import java.util.HashSet;
import java.util.Scanner;

public class P038 {
    public static HashSet<Integer> numbers;
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    private static void backtrack(int x, int y, int[][] map, int sum, int depth) {
        if (depth == 6) {
            numbers.add(sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= 4 || ny < 0 || ny >= 4) continue;
            backtrack(nx, ny, map, sum * 10 + map[ny][nx], depth + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int testCase = 1; testCase <= T; testCase++) {
            numbers = new HashSet<>();
            int[][] map = new int[4][4];
            for (int row = 0; row < 4; row++)
                for (int col = 0; col < 4; col++) map[row][col] = sc.nextInt();
            for (int row = 0; row < 4; row++)
                for (int col = 0; col < 4; col++) backtrack(col, row, map, map[row][col], 0);
            System.out.println("#" + testCase + " " + numbers.size());
        }
    }
}

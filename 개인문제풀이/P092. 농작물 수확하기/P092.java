import java.util.*;

public class P092 {
    private static int harvest(int[][] map) {
        int sum = 0;
        int n = map.length;

        for (int i = 0; i < n; i++) {
            int size = i <= n / 2 ? 2 * i + 1 : 2 * (n - 1 - i) + 1;
            int mid = n / 2;
            int startIdx = Math.abs(mid - i);
            int idx = 0;

            while (size > 0) {
                sum += map[i][startIdx + idx];
                size--;
                idx++;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int[][] map = new int[n][n];

            for (int i = 0; i < n; i++) {
                String line = sc.next();
                for (int j = 0; j < n; j++) {
                    map[i][j] = line.charAt(j) - '0';
                }
            }

            sb.append("#").append(testCase).append(" ").append(harvest(map)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

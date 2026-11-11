import java.util.HashSet;
import java.util.Scanner;

public class P097 {
    private static int checkMap(int[][] map) {
        HashSet<Integer> set;

        // 열 검사
        for (int r = 0; r < 9; r++) {
            set = new HashSet<>();
            for (int c = 0; c < 9; c++) {
                set.add(map[r][c]);
            }
            if (set.size() != 9) {
                return 0;
            }
        }

        // 행 검사
        for (int c = 0; c < 9; c++) {
            set = new HashSet<>();
            for (int r = 0; r < 9; r++) {
                set.add(map[r][c]);
            }
            if (set.size() != 9) {
                return 0;
            }
        }

        // 칸 검사
        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        set.add(map[r + i][c + j]);
                    }
                }
                if (set.size() != 9) {
                    return 0;
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int[][] map = new int[9][9];
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    map[r][c] = sc.nextInt();
                }
            }
            sb.append("#").append(testCase).append(" ").append(checkMap(map)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

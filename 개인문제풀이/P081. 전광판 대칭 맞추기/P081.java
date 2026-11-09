import java.util.Scanner;

public class P081 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int[][] boards = new int[h][w];
            int result = 0;

            for (int row = 0; row < h; row++) {
                String line = sc.next();
                for (int col = 0; col < w; col++) {
                    boards[row][col] = line.charAt(col) - '0';
                }
            }

            for (int row = 0; row < (h + 1) / 2; row++) {
                for (int col = 0; col < (w + 1) / 2; col++) {
                    int ones = boards[row][col];
                    int size = 1;
                    int rightCol = w - col - 1;
                    int downRow = h - row - 1;

                    if (rightCol != col) {
                        ones += boards[row][rightCol];
                        size++;
                    }
                    if (downRow != row) {
                        ones += boards[downRow][col];
                        size++;
                    }
                    if (downRow != row && rightCol != col) {
                        ones += boards[downRow][rightCol];
                        size++;
                    }

                    result += Math.min(ones, size - ones);
                }
            }

            sb.append("#").append(testCase).append(" ").append(result).append("\n");
        }
        System.out.print(sb.toString());
    }
}

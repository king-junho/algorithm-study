import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P098 {
    private static String[] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        String[] result = new String[n];
        int[][] temp = new int[n][n];
        StringBuilder sb;
        Arrays.fill(result, "");

        for (int rotate = 0; rotate < 3; rotate++) {
            temp = new int[n][n];
            for (int i = 0; i < n; i++) {
                sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    temp[i][j] = matrix[n - 1 - j][i];
                    sb.append(matrix[n - 1 - j][i]);
                }
                sb.append(" ");
                result[i] += sb.toString();
            }
            matrix = temp.clone();
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            String[] result = new String[n];
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            result = rotateMatrix(matrix);
            sb.append("#").append(testCase).append("\n");
            for (int i = 0; i < n; i++) {
                sb.append(result[i]).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}

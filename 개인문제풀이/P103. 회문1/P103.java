import java.util.Scanner;

public class P103 {
    private static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();

        if (word.equals(reversedWord)) {
            return true;
        } else {
            return false;
        }
    }

    private static int findPalindrome(char[][] map, int k) {
        int count = 0;
        StringBuilder rowWord;
        StringBuilder colWord;
        if (k == 1) {
            return 64;
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j <= map.length - k; j++) {
                rowWord = new StringBuilder();
                colWord = new StringBuilder();
                for (int m = 0; m < k; m++) {
                    rowWord.append(map[i][j + m]);
                    colWord.append(map[j + m][i]);
                }
                if (isPalindrome(rowWord.toString())) {
                    count++;
                }
                if (isPalindrome(colWord.toString())) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= 10; testCase++) {
            int n = 8;
            int k = sc.nextInt();
            char[][] map = new char[n][n];

            for (int i = 0; i < n; i++) {
                String line = sc.next();
                for (int j = 0; j < n; j++) {
                    map[i][j] = line.charAt(j);
                }
            }

            sb.append("#").append(testCase).append(" ").append(findPalindrome(map, k)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            String[] deckA = new String[n];
            String[] deckB = new String[n];
            Arrays.fill(deckB, "");

            for (int i = 0; i < (n + 1) / 2; i++) {
                deckA[i] = sc.next();
            }
            for (int i = 0; i < n - ((n + 1) / 2); i++) {
                deckB[i] = sc.next();
            }

            sb.append("#").append(testCase).append(" ");
            for (int i = 0; i < (n + 1) / 2; i++) {
                sb.append(deckA[i]).append(" ").append(deckB[i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}

import java.util.Scanner;

class Solution {
    private static int findMode(int[] scoreCount) {
        int maxValue = 0;
        int result = 0;

        for (int i = 0; i < scoreCount.length; i++) {
            if (maxValue <= scoreCount[i]) {
                result = i;
                maxValue = scoreCount[i];
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int test_case = 1; test_case <= t; test_case++) {
            int n = sc.nextInt();
            int[] scoreCount = new int[101];

            for (int i = 0; i < 1000; i++) {
                scoreCount[sc.nextInt()]++;
            }

            sb.append("#").append(n).append(" ").append(findMode(scoreCount)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

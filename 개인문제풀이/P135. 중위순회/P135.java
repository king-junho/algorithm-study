import java.util.Scanner;

class Solution {
    private static String inOrder(int n, int currentIdx, String[] words) {
        String result = "";
        if (currentIdx * 2 > n) {
            if (currentIdx <= n) {
                return words[currentIdx];
            }
            return "";
        }

        result += inOrder(n, currentIdx * 2, words);
        result += words[currentIdx];
        result += inOrder(n, currentIdx * 2 + 1, words);
        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] words = new String[n + 1];

            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                String[] input = line.split(" ");
                int index = Integer.parseInt(input[0]);
                String letter = input[1];
                words[index] = letter;
            }

            sb.append("#").append(test_case).append(" ")
              .append(inOrder(n, 1, words)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

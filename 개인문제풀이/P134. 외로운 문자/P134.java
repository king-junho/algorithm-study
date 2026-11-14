import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int test_case = 1; test_case <= t; test_case++) {
            String line = sc.next();
            String result = "";
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                int index = result.indexOf(c);
                if (index == -1) {
                    result += c;
                } else {
                    result = result.replace(c, ' ');
                }
            }

            sb.append("#").append(test_case).append(" ");
            result = result.trim();
            if (result.length() == 0) {
                sb.append("Good");
            } else {
                char[] words = result.toCharArray();
                Arrays.sort(words);
                for (int i = 0; i < words.length; i++) {
                    if (words[i] != ' ') {
                        sb.append(words[i]);
                    }
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}

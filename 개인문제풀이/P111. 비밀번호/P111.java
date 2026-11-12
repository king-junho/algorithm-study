import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            String word = sc.next();
            StringBuilder wordSb = new StringBuilder(word);
            boolean isRemove = true;

            while (isRemove) {
                isRemove = false;
                for (int i = 0; i < word.length() - 1; i++) {
                    if (word.charAt(i) == word.charAt(i + 1)) {
                        wordSb.delete(i, i + 2);
                        word = wordSb.toString();
                        isRemove = true;
                        break;
                    }
                }
            }

            sb.append("#").append(test_case).append(" ").append(word).append("\n");
        }
        System.out.print(sb.toString());
    }
}

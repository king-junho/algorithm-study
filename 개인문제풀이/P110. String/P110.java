import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            String target = sc.next();
            String line = sc.next();
            int count = 0;

            while (true) {
                int index = line.indexOf(target);
                if (index == -1) {
                    break;
                }

                count++;
                line = line.substring(index + 1);
            }

            sb.append("#").append(n).append(" ").append(count).append("\n");
        }
        System.out.print(sb.toString());
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String command = sc.next();
                int index = sc.nextInt();
                int count = sc.nextInt();
                for (int j = 0; j < count; j++) {
                    list.add(index + j, sc.nextInt());
                }
            }
            sb.append("#").append(test_case).append(" ");
            for (int i = 0; i < 10; i++) {
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}

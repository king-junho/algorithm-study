import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int test_case = 1; test_case <= t; test_case++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < 3; i++) {
                int n = sc.nextInt();
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            sb.append("#").append(test_case).append(" ");
            for (int key : map.keySet()) {
                if (map.get(key) == 1 || map.get(key) == 3) {
                    sb.append(key).append("\n");
                    break;
                }
            }
        }
        System.out.print(sb.toString());
    }
}

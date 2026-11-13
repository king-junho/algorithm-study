import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Solution {
    private static int isPaired(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            switch (current) {
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return 0;
                    }
                    stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return 0;
                    }
                    stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return 0;
                    }
                    stack.pop();
                    break;
                case '>':
                    if (stack.isEmpty() || stack.peek() != '<') {
                        return 0;
                    }
                    stack.pop();
                    break;
                default:
                    stack.push(current);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            String s = sc.next();
            sb.append("#").append(test_case).append(" ")
                    .append(isPaired(s)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

import java.awt.*;
import java.util.*;

class Solution {
    private static int stickCount(String line) {
        int count=0;
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<line.length()-1; i++){
            char currentChar = line.charAt(i);
            char nextChar = line.charAt(i+1);
            if(currentChar=='(' && nextChar==')') {
                count+=stack.size();
                i++;
            } else if(currentChar=='('){
                stack.push('(');
            } else {
                stack.pop();
                count++;
            }
        }
        return line.charAt(line.length()-2)!='(' ? count+1 : count;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for(int test_case=1; test_case<=t; test_case++) {
            String line = sc.next();
            sb.append("#").append(test_case).append(" ").append(stickCount(line)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

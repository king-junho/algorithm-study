import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Solution {
  private static int isPaired(String s){
    Deque<Character> stack = new ArrayDeque<>();

    for(int i=0; i<s.length(); i++){
      char current = s.charAt(i);

      switch(current){
        case ')':
          if(stack.isEmpty() || stack.peek()!='('){
            return 0;
          }
          stack.pop();
          break;
        case ']':
          if(stack.isEmpty() || stack.peek()!='['){
            return 0;
          }
          stack.pop();
          break;
        case'}':
          if(stack.isEmpty() || stack.peek()!='{'){
            return 0;
          }
          stack.pop();
          break;
        case '>':
          if(stack.isEmpty() || stack.peek()!='<'){
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
    /*
    1. 14:12 시작 ~ 14:05 종 료
    스택에 넣는 괄호 문제
    왼쪽 괄호는 스택에 넣고
    오른쪽 괄호가 들어왔을 때 스택 제일 위에 있는 괄호랑 비교한다.
    (1) 비교해서 같으면 pop
    (2) 같지 않으면 0 리턴

    문자열 마지막까지 다 돌았을 때 스택이 남아있다면 0 아니면 1 반환

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(L)
    공간 복잡도 : O(L)

    3. 자료구조
    Deque<Character> stack
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    for(int test_case=1; test_case<=10; test_case++){
      int n = sc.nextInt();
      String s = sc.next();

      sb.append("#").append(test_case).append(" ").append(isPaired(s)).append("\n");
    }
    System.out.print(sb.toString());

  }

}


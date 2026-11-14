import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) throws Exception {
    /*
    1. 20:55 시작 ~ 18:25 종 료
    list에 n만큼 문자열 넣기
    m만큼 반복문 돌면서
      y만큼 돌면서 idx에다가 삽입

    list 10개 출력

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N+M)
    공간 복잡도 : O(N+M*y)

    3. 자료구조
    LinkedList<Integer>
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    for(int test_case=1; test_case<=10; test_case++) {
      int n = sc.nextInt();
      List<Integer> list = new LinkedList<>();

      for(int i=0; i<n; i++){
        list.add(sc.nextInt());
      }

      int m = sc.nextInt();
      for(int i=0; i<m; i++){
        String command = sc.next();
        int index = sc.nextInt();
        int count = sc.nextInt();

        for(int j=0; j<count; j++){
          list.add(index+j, sc.nextInt());
        }
      }
      sb.append("#").append(test_case).append(" ");

      for(int i=0; i<10; i++){
        sb.append(list.get(i)).append(" ");
      }
      sb.append("\n");
    }
    System.out.print(sb.toString());

  }



}


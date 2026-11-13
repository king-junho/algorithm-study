import java.util.Arrays;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) throws Exception {
    /*
    1. 12:30 시작 ~ 12:32 종 료
    숫자열 오름차순 정렬 출력

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(NlogN)
    공간 복잡도 : O(N)

    3. 자료구조
    int[] numbers
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int[] numbers = new int[n];

      for(int i=0; i<n; i++){
        numbers[i] = sc.nextInt();
      }

      Arrays.sort(numbers);

      sb.append("#").append(test_case).append(" ");
      for(int i=0; i<n; i++){
        sb.append(numbers[i]).append(" ");
      }
      sb.append("\n");
    }
    System.out.print(sb.toString());
  }

}


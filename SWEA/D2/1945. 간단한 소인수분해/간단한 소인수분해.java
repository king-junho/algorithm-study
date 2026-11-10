import java.util.*;

class Solution {
  private static final int[] divide = new int[]{11,7,5,3,2};

  private static void primeFactorization(int n, StringBuilder sb){
    int[] count = new int[5];
    for(int i=0; i<5; i++){
      while(n%divide[i]==0){
        count[i]++;
        n/=divide[i];
      }
    }

    for(int i=4; i>=0; i--){
      sb.append(count[i]).append(" ");
    }
    sb.append("\n");
  }
  public static void main(String[] args) throws Exception{
    /*
    1. 13:52 시작 ~ 14:03 종 료
    int[] divide = {11,7,5,3,2}
    int[] count = {} /각 숫자로 나눈 개수 기록
    11부터 시작해서 나머지가 0이 아니라면 나누고 해당 idx의 카운트 기록

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(1)
    공간 복잡도 : O(1)

    3. 자료구조
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++){
      int n = sc.nextInt();

      sb.append("#").append(test_case).append(" ");
      primeFactorization(n,sb);
    }
    System.out.print(sb.toString());
  }
}

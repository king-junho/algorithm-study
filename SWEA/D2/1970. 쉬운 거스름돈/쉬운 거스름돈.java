import java.util.Scanner;

class Solution {

  public static void main(String[] args) throws Exception {
    /*
    1. 12:55 시작 ~ 13:00 종 료
    그리디 문제 금액이 높은 돈부터 차례대로 계산
    int[] unit = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10}
    int count=0;
    for(int i=0; i<unit.length; i++)
      if(money==0)
        break;
      count+=money/unit[i];
      money=money%unit[i];

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(1)
    공간 복잡도 : O(1)

    3. 자료구조
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();
    int unit[] = new int[]{50000, 10000, 5000, 1000, 500, 100 ,50, 10};

    for(int test_case=1; test_case<=t; test_case++) {
      int money =  sc.nextInt();

      sb.append("#").append(test_case).append("\n");

      for(int i=0; i<unit.length; i++) {
        sb.append(money/unit[i]).append(" ");
        money %= unit[i];
      }
      sb.append("\n");
    }
    System.out.print(sb.toString());
  }

}


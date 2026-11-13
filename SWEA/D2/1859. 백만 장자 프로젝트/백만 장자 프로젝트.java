import java.util.Scanner;

class Solution {
  private static long maxBenefit(int[] prices){
    long benefit=0;

    long maxPrice = prices[prices.length-1];

    for(int i=prices.length-2; i>=0; i--){
      if(prices[i]>maxPrice){
        maxPrice=prices[i];
      }else{
        benefit+=maxPrice-prices[i];
      }

    }
    return benefit;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 11:53 시작 ~ 17:50 종 료
    내일 가격이 오늘 가격과 같거나 크다면 구매
      (1) 구매한 개수++
      (2) 구매한 가격 += 현재 가격

    내일 가격이 오늘 가격보다 작으면
      (1) 결과값 += 현재까지 구매한 개수 * 오늘 가격 - 구매한 가격
      (2) 구매한 개수 = 0, 구매한 가격 = 0으로 초기화

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N)
    공간 복잡도 : O(N)

    3. 자료구조
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int[] prices = new int[n];
      for(int i=0;i<n;i++) {
        prices[i] = sc.nextInt();
      }

      sb.append("#").append(test_case).append(" ").append(maxBenefit(prices)).append("\n");
    }
    System.out.print(sb.toString());
  }

}


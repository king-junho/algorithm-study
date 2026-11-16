import java.util.Scanner;

class Solution {
  private static int findBelowMean(int[] incomes, int mean){
    int count=0;
    for(int i=0; i<incomes.length; i++){
      if(incomes[i]<=mean){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 12:47 시작 ~ 12:52 종 료
    각 자료의 평균 구하고 해당 평균보다 작은 수 count 반환

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int[] incomes = new int[n];
      int mean = 0;
      for(int i=0; i<n; i++){
        int income = sc.nextInt();
        mean+=income;
        incomes[i] = income;
      }
      mean/=incomes.length;

      sb.append("#").append(test_case).append(" ").append(findBelowMean(incomes,mean)).append("\n");
    }
    System.out.print(sb.toString());

  }
}


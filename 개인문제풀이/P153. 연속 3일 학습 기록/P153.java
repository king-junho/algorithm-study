import java.util.Scanner;

public class P153 {
  private static int maxPeriod(int[] numbers){
    int maxValue=0;
    int left=0;
    int sum=0;

    for(int right=0; right<numbers.length; right++){
      sum+=numbers[right];

      while(right-left==3){
        sum-=numbers[left];
        left++;
      }
      maxValue=Math.max(maxValue,sum);
    }


    return maxValue;
  }
  public static void main(String[] args) throws Exception {
    /*
    1.14:30 시작 ~ 14:35
    투포인터 연속된 최대 구간 찾기

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[]
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int [] numbers = new int[n];

      for(int i=0; i<n; i++){
        numbers[i] = sc.nextInt();
      }

      sb.append("#").append(test_case).append(" ").append(maxPeriod(numbers)).append("\n");
    }
    System.out.print(sb.toString());

  }
}

import java.util.Scanner;

public class P152 {
  private static int maxPeriod(int[] numbers, int k){
    int maxLength=0;
    int n = numbers.length;
    int left=0;
    int remain = k;

    for(int right=0; right<n; right++){
      if(numbers[right]==0){
        remain--;
      }

      if(remain<0){
        while(left<right&&numbers[left]!=0){
          left++;
        }
        left++;
        remain++;
      }

      int length = right-left+1;
      if(length>maxLength){
        maxLength=length;
      }

    }


    return maxLength;
  }
  public static void main(String[] args) throws Exception {
    /*
    1.13:50 시작 ~ 11:34
    투포인터 연속된 최대 구간 찾기
    int remain=k;

    for(int right=0; right<n; right++){
      if(numbers[right]==0){
        remain--;
      }

      if(remain<0){
        해당 구간에서 길이 탐색
        length = right-left+1;
        remain =k-1;
        left=right;
      }
    }

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
      int k = sc.nextInt();
      int [] numbers = new int[n];

      for(int i=0; i<n; i++){
        numbers[i] = sc.nextInt();
      }

      sb.append("#").append(test_case).append(" ").append(maxPeriod(numbers,k)).append("\n");
    }
    System.out.print(sb.toString());

  }
}

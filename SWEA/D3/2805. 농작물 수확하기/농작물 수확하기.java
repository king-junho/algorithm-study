import java.util.*;

class Solution {
  public static void main(String[] args) throws Exception{
    /*
    1. 14:20 시작 ~ 14:51 종 료
    커져가고 작아지는 것 for문으로 계산
    int sum=0;
    for(i=0; i<n i++){
      int size = i<=n/2 ? 1+2*i : 1+2(n-1-i)
      int mid = n/2;

      while(size>0){
        sum+=Math.abs(mid-i)
        size--;
      }
    }

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N^2)
    공간 복잡도 : O(N^2)

    3. 자료구조
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++){
      int n = sc.nextInt();
      int mid = n/2;
      int sum=0;

      for(int row=0; row<n; row++){
        String line = sc.next();
        int start = Math.abs(mid-row);
        int end = n-start;

        for(int col=start; col<end; col++){
          sum+=line.charAt(col)-'0';
        }
      }

      sb.append("#").append(test_case).append(" ").append(sum).append("\n");
    }
    System.out.print(sb.toString());
  }
}

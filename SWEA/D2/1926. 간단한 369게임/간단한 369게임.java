import java.util.Arrays;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) throws Exception {
    /*
    1. 12:35 시작 ~ 12:32 종 료
    3,6,9 게임
    문자열로 보자 각 문자열에서 3,6,9라면 - 붙이고 한 번도 안 나오면 현재 숫자 붙이기

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N)
    공간 복잡도 : O(N)

    3. 자료구조
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int n = sc.nextInt();
    boolean isTarget = false;

    for(int i=1; i<=n; i++){
      String num = String.valueOf(i);
      isTarget=false;
      for(int j=0; j<num.length(); j++){
        if(num.charAt(j)=='3' || num.charAt(j)=='6' || num.charAt(j)=='9'){
          sb.append("-");
          isTarget=true;
        }
      }
      if(!isTarget){
        sb.append(num);
      }
      sb.append(" ");
    }
    System.out.print(sb.toString());
  }

}


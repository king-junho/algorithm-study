import java.util.Scanner;

class Solution {
  private static boolean isPalindrome(int n){
    String num = String.valueOf(n);
    StringBuilder reverseNum = new StringBuilder(num).reverse();

    if(num.equals(reverseNum.toString())){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args) throws Exception {
    /*
    1. 21:30 시작 ~ 18:25 종 료
    for(int i = start; i*i<=end; i++){
      if(isPalindrome(i) && isPalindrome(i**2){
        count++;
      }

    }
    return count;


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(log(B-A))
    공간 복잡도 : O(1)

    3. 자료구조

    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for (int test_case = 1; test_case <= t; test_case++) {
      int start = sc.nextInt();
      int end = sc.nextInt();
      int count=0;

      for(int i=start; i<=end; i++){
        double sqrtNum = Math.sqrt(i);
        if(sqrtNum%1.0==0){
          if(isPalindrome(i) && isPalindrome((int)sqrtNum)){
            count++;
          }
        }

      }

      sb.append("#").append(test_case).append(" ").append(count).append("\n");
    }
    System.out.print(sb.toString());
  }
}


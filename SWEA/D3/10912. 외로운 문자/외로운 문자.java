import java.util.Arrays;
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
    1. 21:47 시작 ~ 21:43 종 료
    문자열 크기만큼 반복하면서
    문자열 인덱스 반환 -1라면 추가하고 있다면 그 index 삭제
    최종 문자열 길이가 0이라면 Good 출력 아니라면 정렬후 출력

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(L)
    공간 복잡도 : O(1)

    3. 자료구조
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for (int test_case = 1; test_case <= t; test_case++) {
      String line = sc.next();
      String result = "";
      for(int i=0; i<line.length(); i++){
        char c = line.charAt(i);
        int index = result.indexOf(c);

        if(index == -1){
          result+=c;
        }else{
          result=result.replace(c,' ');
        }
      }

      sb.append("#").append(test_case).append(" ");
      result = result.trim();

      if(result.length()==0){
        sb.append("Good");
      }else{
        char[] words = result.toCharArray();
        Arrays.sort(words);
        for(int i=0; i<words.length; i++){
          if(words[i]!=' '){
            sb.append(words[i]);
          }

        }
      }
      sb.append("\n");

    }
    System.out.print(sb.toString());
  }
}


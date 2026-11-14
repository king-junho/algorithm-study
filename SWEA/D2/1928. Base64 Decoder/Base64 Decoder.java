import java.util.Scanner;

class Solution {
  public static void main(String[] args) throws Exception {
    /*
    1. 15:17 시작 ~ 15:40 종 료
    1. 표1을 보고 입력받은 문자들을 각각 대응하는 숫자로 변경한다.
    2. 각 숫자들을 6자리 이진수로 표현하고, 이 이진수들을 한 줄로 쭉 이어 붙인다.
    3. 한 줄로 쭉 이어붙인 이진수들을 8자리씩 끊어서 십진수로 바꾼다.
    4. 각각의 십진수를 아스키 코드로 변환한다.

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N)
    공간 복잡도 : O(N)

    3. 자료구조
    String[] lines
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();
    String base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    StringBuilder result = new StringBuilder();

    for(int test_case=1; test_case<=t; test_case++) {
      System.out.print("#"+test_case+" ");
      result = new StringBuilder();
      String line = sc.next();

      for(int i=0; i<line.length(); i+=4){
        String input = line.substring(i,i+4);
        String totalBits = "";

        for(int j=0; j<input.length(); j++){
          String bits = Integer.toBinaryString(base64.indexOf(input.charAt(j)));
          bits = String.format("%6s",bits).replace(' ','0');

          totalBits+=bits;
        }


        for(int j=0; j<totalBits.length(); j+=8){
          int value = Integer.parseInt(totalBits.substring(j, j+8), 2);

          char letter = (char)value;
          System.out.print(letter);
        }
      }
      System.out.println();
    }
  }



}


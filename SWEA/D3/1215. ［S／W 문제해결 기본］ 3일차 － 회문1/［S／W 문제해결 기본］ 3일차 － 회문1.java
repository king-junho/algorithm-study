import java.util.Scanner;

class Solution {
  private static boolean isPalindrome(String word){
    String reversedWord = new StringBuilder(word).reverse().toString();

    if(word.equals(reversedWord)){
      return true;
    }else{
      return false;
    }
  }
  private static int findPalindrome(char[][] map, int k){
    int count=0;
    StringBuilder rowWord;
    StringBuilder colWord;
    for(int rowStart=0; rowStart<8; rowStart++){
      for(int colStart=0; colStart<=map.length-k; colStart++){
        rowWord = new StringBuilder();
        colWord = new StringBuilder();
        for(int i=0; i<k; i++){
          rowWord.append(map[rowStart][colStart+i]);
          colWord.append(map[colStart+i][rowStart]);
        }
        //System.out.println("rowWord:"+rowWord.toString());
        if(isPalindrome(rowWord.toString())){
          count++;
        }
        //System.out.println("colWord: "+colWord.toString());
        if(isPalindrome(colWord.toString())){
          count++;
        }
      }
    }

    return count;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 14:25 시작 ~ 11:57 종 료
    직선만 확인하므로 각 행, 열 돌면서 확인
    (1) 행 확인할 때
    for(int row=0; row<=n-k row++)
      if(isPalindrome(행 단어))
      if(isPalindrome(열 단어))

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(1) : 자료 상관 없이 최악 8*8
    공간 복잡도 : O(1) : 자료 상관 없이 100*100

    3. 자료구조
    char[][] map
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    for(int test_case=1; test_case<=10; test_case++) {
      int n = 8;
      int k = sc.nextInt();
      char[][] map = new char[n][n];

      for(int i=0; i<n; i++){
        String line = sc.next();
        for(int j=0; j<n; j++){
          map[i][j] = line.charAt(j);
        }
      }

      sb.append("#").append(test_case).append(" ").append(findPalindrome(map,k)).append("\n");
    }
    System.out.print(sb.toString());
  }

}

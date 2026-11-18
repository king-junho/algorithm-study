import java.awt.*;
import java.util.*;

enum Color{
  W,
  B,
  R;
};

public class P142 {
  private static int minCount(char[][] flags, int[][] colorCount){
    int result=Integer.MAX_VALUE;
    int row = flags.length;
    int col = flags[0].length;

    int wCount=0;
    int bCount=0;
    int rCount=0;

    for(int w=0; w<row-2; w++){
      wCount+=(col-colorCount[0][w]);
      for(int b=w+1; b<row-1; b++){
        bCount+=(col-colorCount[1][b]);
        for(int r=b+1; r<row; r++){
          rCount+=(col-colorCount[2][r]);
        }
        result=Math.min(wCount+bCount+rCount,result);
        rCount=0;
      }
      bCount=0;
    }

    return result;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 15:15 시작 ~ 15:50 종 료
    각 행마다 W, B, R 개수 카운트

    for(int w=0; w<row-2; w++)
      wCount+=(col-w개수)
      for(int b=w+1; b<row-1; b++)
        bCount+=(col-b개수)
        for(int r=b+1; r<row; r++)
          rCount+=(col-r개수)

    result=Math.min(result,count);
    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N*M) :
    공간 복잡도 : O(N*M) :

    3. 자료구조
    char[][] flags
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      char[][] flags = new char[n][m];
      int[][] colorCount = new int[3][n];

      for(int row=0; row<n; row++) {
        String line = sc.next();
        for(int col=0; col<m; col++) {
          char c =  line.charAt(col);
          colorCount[Color.valueOf(String.valueOf(c)).ordinal()][row]++;
          flags[row][col] = c;
        }
      }


      sb.append("#").append(test_case).append(" ").append(minCount(flags,colorCount)).append("\n");
    }
    System.out.print(sb.toString());

  }
}


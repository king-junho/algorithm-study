import java.util.Scanner;

public class P039 {
  private static int doRight(int row, int col, int[][] map){
    int count=0;

    if(col-1>=0 && map[row][col-1]==1){
      return 0;
    }
    while(col<map.length && map[row][col]!=0){
      count++;
      col++;
    }
    return count;
  }

  private static int doDown(int row, int col, int[][] map){
    if(row-1>=0 && map[row-1][col]==1){
      return 0;
    }

    int count=0;

    while(row<map.length &&map[row][col]!=0){
      count++;
      row++;
    }
    return count;
  }
  public static void main(String[] args) {
    /*
    1. 해당 위치가 흰 부분(1)이라면
      오른쪽으로 벽에 닿거나 검은색일 때까지 놓았을 때 K와 개수가 같다면 result++
      아래로 벽에 닿거나 검은색일 때까지 놓았을 때 K와 개수가 같다면 result++

    2. 시간 복잡도 O(N^2) 공간 복잡도 O(N^2)
    3. int[][] map : NxN 격자판 생성
     */
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int test_case=1; test_case<=T; test_case++){
      int N = sc.nextInt();
      int K = sc.nextInt();
      int result=0;

      int map[][] = new int[N][N];

      for(int row=0; row<N; row++){
        for(int col=0; col<N; col++){
          map[row][col] = sc.nextInt();
        }
      }

      for(int row=0; row<N; row++){
        for(int col=0; col<N; col++){
          if(map[row][col]!=0){
            //오른쪽으로 쭉 가서 칸 수 확인
            if(doRight(row,col,map)==K){
              result++;
            }

            //아래로 쭉 가서 칸 수 확인
            if(doDown(row,col,map)==K){
              result++;
            }

          }
        }
      }



      System.out.println("#"+test_case+" "+result);
    }
  }
}

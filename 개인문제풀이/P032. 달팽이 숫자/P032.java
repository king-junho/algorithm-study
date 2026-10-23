import java.util.Scanner;

public class P032 {
  public static void main(String[] args) {
    /*
    1. 아이디어
    오른쪽 방향으로 진행하면서 벽에 부딪치거나 숫자가 0이 아니면 90도 방향 전환 후 계속해서 숫자 채워넣기

    2. 시간 복잡도 O(N) 공간복잡도 O(N^2)

     */
    Scanner sc = new Scanner(System.in);
    int T;
    T=sc.nextInt();
    sc.nextLine();

    for(int test_case=1; test_case<=T; test_case++){
      int N = sc.nextInt();
      int[][] map = new int[N][N];

      //오, 아래, 왼, 위
      int[] dx = new int[]{1,0,-1,0};
      int[] dy = new int[]{0,1,0,-1};
      int direction = 0;
      int x=0;
      int y=0;

      for (int i=1; i<=N*N; i++){
        map[y][x]=i;
        int nx = dx[direction]+x;
        int ny = dy[direction]+y;

        if(nx<0 || nx>=N || ny<0 || ny>=N ||map[ny][nx]!=0){
          direction = (direction+1)%4;
        }

        x=dx[direction]+x;
        y=dy[direction]+y;
      }
      System.out.println("#"+test_case);
      for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
          System.out.print(map[i][j]+" ");
        }
        System.out.println();
      }

    }
  }
}

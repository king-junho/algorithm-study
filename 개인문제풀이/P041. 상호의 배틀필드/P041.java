import java.util.Scanner;

public class P041 {
  //상하좌우
  private static final int[] dx = new int[]{0,0,-1,1};
  private static final int[] dy = new int[]{-1,1,0,0};
  private static boolean canMove(int x, int y, String[][] map){
    int H = map.length;
    int W = map[0].length;

    if(x<0 || x>=W || y<0 || y>=H){
      return false;
    }

    if(!map[y][x].equals(".")){
      return false;
    }
    return true;
  }

  private static void shoot(int x, int y, int direction, String[][] map){
    int H = map.length;
    int W = map[0].length;

    while(true){
      if(x<0 || x>=W || y<0 || y>=H){
        break;
      }
      if(map[y][x].equals("*")){
        map[y][x]=".";
        break;
      }
      else if(map[y][x].equals("#")){
        break;
      }
      x+=dx[direction];
      y+=dy[direction];
    }
  }

  public static void main(String[] args) {
    /*
    1. command만큼 반복하면서 현재 작업 수행
        움직이는 동작이면 방향 먼저 바꾸고 -> 이동할 수 있는지 판단 후(격자 안에 있는지, 이동 가능한 발판인지) -> 이동 가능하면 이동
        포탄 발사 명령이면 현재 방향으로 진행 -> 벽에 맞으면 평지로 변경 강철 벽에 맞으면 그냥 종료

    2. 시간 복잡도 O(N*W) or O(N*H) 공간 복잡도 O(H*W)
    3. String[][] map : NxN 격자판 생성
      String[] command : 사용자 명령어
     */

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int test_case=1; test_case<=T; test_case++){
      int H = sc.nextInt();
      int W = sc.nextInt();
      int x=0;
      int y=0;
      int direction=0;
      String[][] map = new String[H][W];

      for(int i=0; i<H; i++){
        String line = sc.next();
        if(line.contains("^")){
          x=line.indexOf("^");
          y=i;
          direction=0;
        }
        else if(line.contains("v")){
          x=line.indexOf("v");
          y=i;
          direction=1;
        }
        else if(line.contains("<")){
          x=line.indexOf("<");
          y=i;
          direction=2;
        }
        else if(line.contains(">")){
          x=line.indexOf(">");
          y=i;
          direction=3;
        }

        map[i] = line.split("");
      }

      int N = sc.nextInt();
      String[] commands = sc.next().split("");

      for(String command : commands){
        switch(command){
          case "S":
            shoot(x,y,direction,map);
            break;
          case "U":
            direction = 0;
            if(canMove(x,y-1,map)){
              map[y][x]=".";
              y--;
            }
            map[y][x]="^";
            break;
          case "D":
            direction = 1;
            if(canMove(x,y+1,map)){
              map[y][x]=".";
              y++;
            }
            map[y][x]="v";
            break;
          case "L":
            direction = 2;
            if(canMove(x-1,y,map)){
              map[y][x]=".";
              x--;
            }
            map[y][x]="<";
            break;
          case "R":
            direction = 3;
            if(canMove(x+1,y,map)){
              map[y][x]=".";
              x++;
            }
            map[y][x]=">";
            break;
        }
      }



      System.out.print("#"+test_case+" ");
      for(int row=0; row<H; row++){
        for(int col=0; col<W; col++){
          System.out.print(map[row][col]);
        }
        System.out.println();
      }
    }
  }
}

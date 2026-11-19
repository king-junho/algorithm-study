import java.util.Scanner;

enum Direction{
  U,
  D,
  L,
  R
}

class Command{
  char command;
  int dist;

  public Command(char command, int dist){
    this.command = command;
    this.dist = dist;
  }
}

public class P155 {
  //상하좌우
  private static final int[] dr={-1,1,0,0};
  private static final int[] dc={0,0,-1,1};
  private static void moveRobot(char[][] map, Command[] commands, int row, int col, StringBuilder sb){
    int totalSum=0;
    int failCount=0;
    int h = map.length;
    int w = map[0].length;

    for(Command command : commands){
      int direction = Direction.valueOf(String.valueOf(command.command)).ordinal();
      int dist = command.dist;
      boolean isMove=true;

      //이동 확인
      for(int i=1; i<=dist; i++){
        int nr = row+dr[direction]*i;
        int nc = col+dc[direction]*i;

        if(nr<0 || nr>=h || nc<0 || nc>=w || map[nr][nc]=='#'){
          isMove=false;
          failCount++;
          break;
        }
      }

      if(isMove){
        int sum=0;
        for(int i=0; i<dist; i++){
          row = row+dr[direction];
          col = col+dc[direction];
          if(map[row][col]=='.'){
            continue;
          }else{
            sum+=map[row][col]-'0';
            map[row][col]='.';
          }
        }
        totalSum+=sum;
      }
    }


    sb.append(row+1).append(" ").append(col+1).append(" ").append(totalSum).append(" ").append(failCount).append("\n");
  }
  public static void main(String[] args) throws Exception {
    /*
    1.15:10 시작 ~ 15:41
    시뮬레이션 문제
    (1) 먼저 이동 하면서 sum계산 끝까지 이동가능하면
    (2) 한 칸씩 이동하면서 지나간 곳 .으로 변경

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(Q*D) :
    공간 복잡도 : O(HW) :

    3. 자료구조
    char[][] map
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t= sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++){
      int h =  sc.nextInt();
      int w = sc.nextInt();
      int q =  sc.nextInt();
      char[][] map = new char[h][w];
      Command[] commands = new Command[q];

      int startRow=0;
      int startCol=0;

      for(int row=0; row<h; row++){
        String line=sc.next();
        for(int col=0; col<w; col++){
          char c =  line.charAt(col);
          if(c=='S'){
            startRow = row;
            startCol = col;
            c='.';
          }
          map[row][col]=c;
        }
      }

      for(int i=0; i<q; i++){
        char command = sc.next().charAt(0);
        int dist =  sc.nextInt();
        commands[i] = new Command(command, dist);
      }

      sb.append("#").append(test_case).append(" ");
      moveRobot(map,commands,startRow,startCol,sb);
    }
    System.out.print(sb.toString());

  }
}

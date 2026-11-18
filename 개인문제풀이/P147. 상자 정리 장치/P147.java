import java.util.Arrays;
import java.util.Scanner;

class Command{
  char command;
  int num;

  public Command(char command, int num){
    this.command = command;
    this.num = num;
  }
}
public class P147 {
  private static void commandProcess(Command command, int[][] map){
    int h = map.length;
    int w = map[0].length;
    int idx = command.num-1;
    int temp;

    switch(command.command){
      case 'H':
        temp = map[idx][w-1];
        for(int col=w-1; col>0; col--){
          map[idx][col] = map[idx][col-1];
        }
        map[idx][0]=temp;
        break;
      case 'V':
        temp = map[h-1][idx];
        for(int row=h-1; row>0; row--){
          map[row][idx] = map[row-1][idx];
        }
        map[0][idx]=temp;
        break;
    }
  }

  private static void applyGravity(int[][] map){
    int h = map.length;
    int w= map[0].length;

    for(int col=0; col<w; col++){
      int writeRow = h-1;

      for(int readRow=h-1; readRow>=0; readRow--){
        if(map[readRow][col]!=0){
          map[writeRow][col] = map[readRow][col];
          writeRow--;
        }
      }
      while(writeRow>=0){
        map[writeRow][col]=0;
        writeRow--;
      }
    }
  }

  private static void process(int[][] map, Command[] commands, int count,StringBuilder sb){
    int removedCount=0;
    int h = map.length;
    int w= map[0].length;

    for(Command command : commands){
      //명령 처리
      commandProcess(command, map);

      //반복
      while(true){
        int removedRow=0;
        //같은 행 삭제
        for(int row=0; row<h; row++){
          int col=0;
          int color = map[row][col];

          if(color==0){
            continue;
          }

          while(col<w && map[row][col]==color){
            col++;
          }

          if(col==w){
            Arrays.fill(map[row],0);
            removedRow++;
          }
        }

        //삭제한 행 없으면 종료
        if(removedRow==0){
          break;
        }

        //삭제한 행 있다면 아래로 떨어뜨리기
        applyGravity(map);
        removedCount += removedRow*w;
      }
    }

    sb.append(removedCount).append(" ").append(count-removedCount).append("\n");
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 11:20 시작 ~ 11:00 종 료
    시뮬레이션 문제
    (1) 명령 수행
    걍 명령 수행 제일 마지막에 있는 값 미리 저장해두고
    i=1; i<n; i++까지 현재 값에 전에 값 대입
    마지막에 마지막에 있는 값은 저장해둔 값 대입

    (2) 작업 반복
    boolean isRemove=false;

    while(true){
      1. 각 행 돌면서 삭제할 수 있는 행 있나 확인
      2. 삭제할 행 있다면 is Remove=true;

      if(!isRemove){
        제일 밑에서부터 채워가면서 만약 현재 값이 0 이면 그 위에 row값 범위 안 벗어나면 가져오고 해당 값은 0으로 갱신
        break;
      }
    }

    2. 행 없다면 패스
    3. 행 있다면

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(NQ) :
    공간 복잡도 : O(N+Q) :

    3. 자료구조
    Box[] boxes
    PriorityQueue<Order>
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t= sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++){
      int h =  sc.nextInt();
      int w =  sc.nextInt();
      int q =   sc.nextInt();
      int[][] map =new int[h][w];
      int count=0;

      for(int row=0; row<h; row++){
        for(int col=0; col<w; col++){
          int value = sc.nextInt();
          if(value!=0){
            count++;
          }
          map[row][col] = value;
        }
      }

      Command[] commands = new Command[q];
      for(int i=0; i<q; i++){
        char c = sc.next().charAt(0);
        int num = sc.nextInt();
        commands[i] = new Command(c,num);
      }

      sb.append("#").append(test_case).append(" ");
      process(map,commands,count, sb);
    }
    System.out.print(sb.toString());


  }
}

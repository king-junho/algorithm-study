import java.util.Arrays;
import java.util.Scanner;

public class P147 {
    private static void applyGravity(int[][] map){
        int h = map.length;
        int w= map[0].length;

        for(int col=0; col<w; col++){
            int writeRow=h-1;
            for(int readRow=h-1; readRow>=0; readRow--){
                if(map[readRow][col]!=0){
                    map[writeRow][col]=map[readRow][col];
                    writeRow--;
                }
            }
            while(writeRow>=0){
                map[writeRow][col]=0;
                writeRow--;
            }
        }
    }
    public static void main(String[] args) throws Exception {
    /*
    1.13:35 시작 ~ 14:10
    시뮬레이션 문제
    명령 수행 H 행 제거 V 열 제거

    명령 수행 후
    removedRow=0
    do{
    removedRow=0;
        1. 모든 행 확인 모든 열이 같으면 삭제(removedCount++) 아니라면 다르면 패스
        2. 삭제한 행이 있으면 아래로 떨어뜨리기
    }while(removedCount>0)


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(Q*H*W) :
    공간 복잡도 : O(H*W) :

    3. 자료구조
    int[][] map
    */


        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int q = sc.nextInt();
            int count =0;
            int removedCount=0;

            int[][] map = new int[h][w];

            for(int row=0; row<h; row++){
                for(int col=0; col<w; col++){
                    int color = sc.nextInt();
                    if(color!=0){
                        count++;
                    }
                    map[row][col] = color;
                }
            }

            for(int i=0; i<q; i++){
                char command = sc.next().charAt(0);
                int num =  sc.nextInt()-1;

                switch(command){
                    case 'H' ->{
                        int temp = map[num][w-1];
                        for(int col=w-1; col>0; col--){
                            map[num][col] = map[num][col-1];
                        }
                        map[num][0]=temp;
                    }

                    case 'V' ->{
                        int temp = map[h-1][num];
                        for(int row=h-1; row>0; row--){
                            map[row][num] = map[row-1][num];
                        }
                        map[0][num]=temp;
                    }
                }


                //삭제할 열 확인
                while(true){
                    int removedRow=0;
                    for(int row=0; row<h; row++){
                        boolean isRemoved = true;

                        int color = map[row][0];

                        if(color==0){
                            continue;
                        }

                        for(int col=1; col<w; col++){
                            if(map[row][col]!=color){
                                isRemoved = false;
                                break;
                            }
                        }
                        if(isRemoved){
                            Arrays.fill(map[row], 0);
                            removedRow++;
                        }
                    }

                    if(removedRow>0){
                        applyGravity(map);
                        removedCount+=(removedRow*w);
                    }else{
                        break;
                    }
                }
            }


            sb.append("#").append(test_case).append(" ")
                    .append(removedCount).append(" ")
                    .append(count-removedCount).append("\n");
        }
        System.out.print(sb.toString());
  }
}

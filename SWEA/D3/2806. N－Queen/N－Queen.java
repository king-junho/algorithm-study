import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    private static boolean canPlace(int[][] map, int row, int col){
        //왼쪽 위 대각선에 퀸 있는지 확인
        int idx=1;

        while(row-idx>=0 && col-idx>=0){
            if(map[row-idx][col-idx]==1){
                return false;
            }
            idx++;
        }
        idx=0;

        while(row-idx>=0 && col+idx<map.length){
            if(map[row-idx][col+idx]==1){
                return false;
            }
            idx++;
        }

        //오른쪽 위 대각선에 퀸 있는지 확인

        return true;
    }
    private static int findCase(int[][] map, boolean[] visited, int row){
        int n =map.length;

        if(row==n){
            return 1;
        }

        int count=0;

        for(int col=0; col<n; col++){
            if(visited[col]){
                continue;
            }

            if(canPlace(map,row,col)){
                visited[col]=true;
                map[row][col]=1;
                count+=findCase(map,visited,row+1);
                visited[col]=false;
                map[row][col]=0;
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
    /*
    1.14:10 시작 ~ 14:45분 종료
    백트레킹 문제
    각 row 돌면서 각 col 확인
    if(row==n){
        reutrn 1;
    }
    int count=0;

    for(int col=0; col<n; col++){
        if(visited[col])
            continue;
        방문 안 했으면
        방문처리하고
        count+=backtrack(map,visited,row+1)
        visited[col]=false;
    }

    return count;
    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N!) :
    공간 복잡도 : O(N*N) :

    3. 자료구조
    int[][] map
    boolean[] visited
    */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=t; test_case++){
            int n = Integer.parseInt(br.readLine());
            int[][] map = new int[n][n];
            boolean[] visited = new boolean[n];

            sb.append("#").append(test_case).append(" ")
                    .append(findCase(map,visited,0)).append("\n");
        }
        System.out.print(sb.toString());

  }
}


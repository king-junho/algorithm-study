import java.util.Scanner;

class Solution {
    //상하좌우
    private static final int[] straightDr = new int[]{-1,1,0,0};
    private static final int[] straightDc = new int[]{0,0,-1,1};
    //오위, 오아, 왼아, 왼
    private static final int[] diagonaDr = new int[]{-1,1,1,-1};
    private static final int[] diagonaDc = new int[]{1,1,-1,-1};

    private static int maxKill(int[][] map, int m) {
        int maxValue=0;
        int n = map.length;
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                int diagonaSum=map[row][col];
                int straightSum=map[row][col];
                for(int direction=0; direction<4; direction++){
                    for(int i=1; i<=m-1; i++){
                        int straightRow = row+straightDr[direction]*i;
                        int straightCol = col+straightDc[direction]*i;
                        if(straightRow>=0 && straightRow<n && straightCol>=0 && straightCol<n){
                            straightSum+=map[straightRow][straightCol];
                        }
                        int diagonaRow = row+diagonaDr[direction]*i;
                        int diagonaCol = col+diagonaDc[direction]*i;
                        if(diagonaRow>=0 && diagonaRow<n && diagonaCol>=0 && diagonaCol<n){
                            diagonaSum+=map[diagonaRow][diagonaCol];
                        }
                    }
                }
                maxValue=Math.max(maxValue,Math.max(straightSum,diagonaSum));
            }
        }
        return maxValue;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for(int test_case=1; test_case<=t; test_case++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] map = new int[n][n];
            for(int row=0; row<n; row++){
                for(int col=0; col<n; col++){
                    map[row][col] = sc.nextInt();
                }
            }
            sb.append("#").append(test_case).append(" ").append(maxKill(map,m)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

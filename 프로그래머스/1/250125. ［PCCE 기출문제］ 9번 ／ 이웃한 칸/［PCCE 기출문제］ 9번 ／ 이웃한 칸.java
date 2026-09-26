class Solution {
    public int solution(String[][] board, int h, int w) {
        //동서북남
        int[] dh = {0,0,-1,1};
        int[] dw = {1,-1,0,0};
        int nh,nw;
        int count=0;

        for(int i=0; i<4; i++){
            nh = h+dh[i];
            nw = w+dw[i];
            
            if(nh<0 || nh>=board.length ||nw<0 ||nw>=board[0].length)
                continue;

            if(board[h][w].equals(board[nh][nw])){
                count++;
            }
        }
        return count;
    }
}
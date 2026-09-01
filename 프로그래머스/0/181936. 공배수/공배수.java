class Solution {
    public int solution(int number, int n, int m) {
        if(Math.max(n,m)%Math.min(n,m)==0){
            return number%Math.max(n,m)==0 ? 1:0;
        }
        else{
            return number%(n*m)==0 ? 1:0;
        }
    }
}
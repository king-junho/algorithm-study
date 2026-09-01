class Solution {
    public int solution(int[] num_list) {
        int a=1,b=0;
        for(int n : num_list) {
            a*=n;
            b+=n;
        }
        
        return a<Math.pow(b,2)?1:0;
    }
}
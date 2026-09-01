class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int value = a;

        for(boolean type : included) {
            if(type){
                answer+=a;
            }
            a+=d;
        }

        return answer;
    }
}
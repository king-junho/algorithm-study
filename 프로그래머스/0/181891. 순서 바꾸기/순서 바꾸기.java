class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx=n%num_list.length;
        int[] answer = new int[num_list.length];

        for(int i=0; i<num_list.length; i++){
            answer[i]=num_list[idx];
            idx=(idx+1)%num_list.length;
        }

    
        return answer;
    }
}
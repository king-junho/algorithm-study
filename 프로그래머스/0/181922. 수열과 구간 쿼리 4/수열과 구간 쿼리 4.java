class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int s,e,k;
        for(int[] query : queries) {
            s=query[0];
            e=query[1];
            k=query[2];

            for(int i=s; i<=e; i++){
                if(i%k==0){
                    arr[i]+=1;
                }
            }
        }

        return arr;
    }
}
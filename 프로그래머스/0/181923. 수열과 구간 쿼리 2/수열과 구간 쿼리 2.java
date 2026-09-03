class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int idx=0;

        for(int[] query : queries) {
            int min_value=-1;
            int s,e,k;
            s=query[0];
            e=query[1];
            k=query[2];

            for(int i=s; i<=e; i++){
                if(arr[i]>k){
                    if(min_value!=-1){
                        min_value = Math.min(min_value,arr[i]);
                    }else{
                        min_value=arr[i];
                    }
                }
            }
            result[idx]=min_value;
            idx++;
        }
    
        return result;
    }
}
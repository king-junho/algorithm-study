class Solution {
    public String solution(String my_string, int m, int c) {
        int target = 0;
        StringBuilder sb = new StringBuilder();

        for(String s : my_string.split("")) {
            if(target==c-1){
                sb.append(s);
            }
            target=(target+1)%m;
        }
        
        return sb.toString();
    }
}
class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] strings = my_string.split("");
        StringBuffer sb= new StringBuffer();

        for(int[] query : queries){
            sb = new StringBuffer();
            int s,e;
            s=query[0];
            e=query[1];
            sb.append(my_string.substring(0,s));
            for(int i=e; i>=s; i--){
                sb.append(strings[i]);
            }
            sb.append(my_string.substring(e+1));
            my_string = sb.toString();
            strings = my_string.split("");
        }
        return sb.toString();
    }
}
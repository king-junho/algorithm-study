class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuffer sb = new StringBuffer();
        int i =0;
        for(int[] part : parts) {
            sb.append(my_strings[i].substring(part[0],part[1]+1));
            i++;
        }
        return sb.toString();
    }
}
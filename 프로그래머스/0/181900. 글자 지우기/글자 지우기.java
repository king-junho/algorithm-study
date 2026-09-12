class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strings = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(int index : indices){
            strings[index] = "";
        }

        for(String s : strings){
            if(s!=""){
                sb.append(s);
            }
        }

        return sb.toString();
    }
}
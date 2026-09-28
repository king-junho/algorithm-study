class Solution {
    public String solution(String myString) {
        StringBuilder builder = new StringBuilder();
        for(String s : myString.split("")){
            if(s.equalsIgnoreCase("a")){
                builder.append('A');
            }else{
                builder.append(s.toLowerCase());
            }
        }
        return builder.toString();
    }
}
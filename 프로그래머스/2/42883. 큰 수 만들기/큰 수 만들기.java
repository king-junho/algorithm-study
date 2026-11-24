class Solution {
    public String solution(String number, int k) {
        StringBuilder stack = new StringBuilder();

        for(int i=0; i<number.length(); i++){
            char current = number.charAt(i);
            while(k>0
                    && !stack.isEmpty()
                    && stack.charAt(stack.length()-1)<current){
                k--;
                stack.deleteCharAt(stack.length()-1);
            }

            stack.append(current);
        }

        stack.setLength(stack.length()-k);


        return stack.toString();
    }


}
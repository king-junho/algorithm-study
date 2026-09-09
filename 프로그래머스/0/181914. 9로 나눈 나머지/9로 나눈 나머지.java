class Solution {
    public int solution(String number) {
        String[] numbers = number.split("");
        int sum=0;
        for(String i : numbers){
            sum += Integer.parseInt(i);
        }
        //System.out.println(sum);
        return sum%9;
    }
}
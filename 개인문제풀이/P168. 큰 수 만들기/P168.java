public class P168 {

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

    public static void main(String[] args) throws Exception {
    /*
    1.20:05 시작 ~ 20:17

    앞자리 숫자가 커야하므로 앞자리 숫자가 제일 크게 시작하는 지점 찾기
    문자열 처음부터 돌면서
    (1) 제일 마지막에 있는 숫자랑 비교해서 현재 숫자가 더 크면 마지막 숫자 지우기 k--
    (2) k가 0보다 클 때까지 반복
    (3) 이후 남은 문자열은 그대로 넣고
    (4) k가 0보다 크다면 문자열의 길이는 현재 길이에서 k뺀것만큼 뒤에거 제거하고 출력


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(L) :
    공간 복잡도 : O(1) :

    3. 자료구조
    */
        String number = "4177252841";
        int k =4;

        Solution s = new Solution();
        System.out.println(s.solution(number, k));
  }
}

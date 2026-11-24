import java.util.HashSet;
import java.util.Set;

public class P006 {
    private boolean isPrime(int n){
        if(n<2){
            return false;
        }

        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    private int findPrime(String numbers, boolean[] visited, String current, Set<Integer> set){
        if(!current.isEmpty()){
            int value = Integer.parseInt(current);
            if(!set.contains(value)&&isPrime(value)) {
                set.add(value);
            }
        }
        int best=set.size();

        for(int i=0; i<numbers.length(); i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            int child = findPrime(numbers,visited,current+numbers.charAt(i),set);
            best=Math.max(best,child);
            visited[i] = false;
        }

        return best;
    }
    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length()];
        Set<Integer> set = new HashSet<>();

        return findPrime(numbers, visited, "", set);
    }

    public static void main(String[] args) throws Exception {
    /*
    1.22:00 시작 ~ 22:20분 종료
    백트레킹으로 가능한 경우의 수 탐색
    각 가능한 경우의 수
    (1) set에 이미 있는지 확인 *있으면 다음
    (2) 없다면 isPrime(숫자)로 소수인지 검증
    (3) 소수라면 set에다가 저장

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(L!) : L은 문자열 길이
    공간 복잡도 : O(L) : L은 문자열 길이

    3. 자료구조
    boolean[] visited
    */
        String numbers = "44";

        Solution s = new Solution();
        System.out.println(s.solution(numbers));
  }
}

import java.util.Arrays;

public class P028 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int count=0;
        while(left<=right){
            if(left==right){
                count++;
                break;
            }

            if(people[left]+people[right]<=limit){
                left++;
            }

            right--;
            count++;
        }

        return count;
    }


    public static void main(String[] args) throws Exception {
    /*
    1.20:30 시작 ~ 20:40
    정렬 후 오른쪽부터 구명보트 태우고
    만약 왼쪽 최소값과 현재 최대값을 태울 수 있으면 left++

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[] people
    */

        Solution s = new Solution();
        int[] people = {70,50,80,50};

        System.out.println(s.solution(people, 100));
  }
}

public class P031 {
  private int result;

  private void binarySearch(int startIdx, int endIdx, int target,int[] numbers){
    if(startIdx>endIdx){
      return;
    }

    int mid = (startIdx+endIdx)/2;

    if(numbers[mid]<target){
      binarySearch(mid+1,endIdx,target,numbers);
    }else{
      result=mid;
      binarySearch(startIdx,mid-1,target,numbers);
    }
  }
  public int solution(int[] numbers, int target){
    /*
    1. 아이디어
    numbers[mid]<target 이면 오른쪽 이진탐색
    numbers[mid]>=target이면 mid값 저장하고 왼쪽 이진탐색 계속 진행
    이중탐색으로 탐색

    2. 시간복잡도
    시간복잡도 : O(logN)
    공간복잡도 : O(logN)

    3. 자료구조
     */
    result=numbers.length;
    binarySearch(0,numbers.length-1,target,numbers);
    return result;
  }



}

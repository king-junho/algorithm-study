public class P030 {
    private int binarySearch(int startIdx, int endIdx, int target, int[] numbers) {
        if (startIdx > endIdx) {
            return -1;
        }
        int mid = (startIdx + endIdx) / 2;
        if (numbers[mid] == target) {
            return mid;
        }
        if (numbers[mid] > target) {
            return binarySearch(startIdx, mid - 1, target, numbers);
        } else {
            return binarySearch(mid + 1, endIdx, target, numbers);
        }
    }

    public int solution(int[] numbers, int target) {
        return binarySearch(0, numbers.length - 1, target, numbers);
    }
}

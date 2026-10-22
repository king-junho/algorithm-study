public class P027 {
    public int[] solution(int[] sequence, int k) {
        int startIdx = 0, endIdx = 0;
        int left = 0;
        int right = 0;
        int sum = sequence[right];
        int length = Integer.MAX_VALUE;
        while (left < sequence.length) {
            if (sum == k && length > right - left) {
                startIdx = left;
                endIdx = right;
                length = right - left;
            }
            if (sum >= k) {
                sum -= sequence[left];
                left++;
            } else {
                if (right >= sequence.length - 1) {
                    break;
                }
                right++;
                sum += sequence[right];
            }
        }
        return new int[]{startIdx, endIdx};
    }
}

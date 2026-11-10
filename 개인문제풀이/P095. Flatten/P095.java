import java.util.*;

public class P095 {
    private static int dump(int[] boxes, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int maxIdx = 0;
            int minIdx = 0;
            int maxValue = 0;
            int minValue = 100;

            for (int idx = 0; idx < boxes.length; idx++) {
                if (boxes[idx] > maxValue) {
                    maxIdx = idx;
                    maxValue = boxes[idx];
                }

                if (boxes[idx] < minValue) {
                    minIdx = idx;
                    minValue = boxes[idx];
                }
            }
            boxes[minIdx]++;
            boxes[maxIdx]--;
        }

        int maxValue = 0;
        int minValue = 100;
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] > maxValue) {
                maxValue = boxes[i];
            }

            if (boxes[i] < minValue) {
                minValue = boxes[i];
            }
        }
        return maxValue - minValue;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int testCase = 1; testCase <= 10; testCase++) {
            int n = sc.nextInt();
            int[] boxes = new int[100];
            for (int i = 0; i < 100; i++) {
                boxes[i] = sc.nextInt();
            }
            sb.append("#").append(testCase).append(" ").append(dump(boxes, n)).append("\n");
        }
        System.out.print(sb.toString());
    }
}

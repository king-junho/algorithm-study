import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Box implements Comparable<Box> {
  int index;
  int size;
  int period;
  int count;

  @Override
  public int compareTo(Box o){
    return this.size-o.size;
  }

  Box(int index, int size) {
    this.index = index;
    this.size = size;
    this.period = 0;
    this.count=0;
  }
}

class Order implements Comparable<Order>{
  int time;
  int size;
  int period;

  @Override
  public int compareTo(Order o){
    return this.time-o.time;
  }

  Order(int time, int size, int period) {
    this.time = time;
    this.size = size;
    this.period = period;
  }
}

public class P145 {
  private static void process(Box[] boxes, Order[] orders, StringBuilder sb){
    int time=0;
    int failCount=0;

    for(Order currentOrder : orders){
      if(currentOrder.time!=time){
        time=currentOrder.time;
      }

      boolean isPossible = false;
      for(Box box : boxes){
        if(box.size>=currentOrder.size && box.period<=currentOrder.time){
          box.period = time+currentOrder.period;
          box.count++;
          isPossible = true;
          break;
        }
      }

      if(!isPossible){
        failCount++;
      }
    }

    int maxCount=0;
    int result= boxes.length+1;

    for(Box box : boxes){
      if(maxCount<=box.count){
        if(maxCount==box.count){
          result=Math.min(result,box.index);
        }else{
          result=box.index;
          maxCount=box.count;
        }
      }
    }

    if(maxCount==0){
      result=0;
    }

    sb.append(failCount).append(" ").append(result).append("\n");
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 9:35 시작 ~ 10:16 종 료
    Box 사이즈별로 받아서 정렬
    Order 시간, 입력순으로 정렬


    time=-1;
    While(!pq.isEmpty())
      current = pq.poll();
      if(current!=time)
        time++
      Box앞에서부터 반복
        (0) isPossible = false;
        (1) 현재 Box의 크기>= 현재 요청 size
        (2) periods[i] <= 현재 요청 time
        (3) 두개 다 만족하면 현재 Box period, count 갱신, isPossible=true break;
      !isPossible 다 안 되면 실패 카운트 ++

     마지막에 박스별로 돌면서 담은 횟수 확인


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(NQ) :
    공간 복잡도 : O(N+Q) :

    3. 자료구조
    Box[] boxes
    PriorityQueue<Order>
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++){
      int n = sc.nextInt();
      int q = sc.nextInt();
      Box[] boxes = new Box[n];
      Order[] orders = new Order[q];

      for(int i=0; i<n; i++){
        int size = sc.nextInt();
        boxes[i] = new Box(i+1,size);
      }
      Arrays.sort(boxes);

      for(int i=0; i<q; i++){
        int time = sc.nextInt();
        int size = sc.nextInt();
        int period = sc.nextInt();
        orders[i] = new Order(time,size,period);
      }
      Arrays.sort(orders);

      sb.append("#").append(test_case).append(" ");
      process(boxes,orders,sb);
    }
    System.out.print(sb.toString());
  }
}


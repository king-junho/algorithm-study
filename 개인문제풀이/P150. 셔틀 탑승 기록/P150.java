import java.util.Arrays;
import java.util.Scanner;

class Passenger implements Comparable<Passenger>{
    int arriveTime;
    char priority;
    boolean isBoard;

    Passenger(int arriveTime, char priority){
        this.arriveTime = arriveTime;
        this.priority = priority;
    }

    @Override
    public int compareTo(Passenger o) {
        return Integer.compare(this.arriveTime, o.arriveTime);
    }
}

class Bus implements Comparable<Bus>{
    int departureTime;
    int capacity;
    int priorityCapacity;
    Bus(int departureTime, int capacity, int priorityCapacity){
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.priorityCapacity = priorityCapacity;
    }
    @Override
    public int compareTo(Bus o) {
        return Integer.compare(this.departureTime, o.departureTime);
    }
}

public class P150 {
    private static void process(Passenger[] passengers, Bus[] buses, StringBuilder sb){
        int maxWait=0;
        int idx=0;
        int priorityIdx=0;

        for(Bus bus:buses){
            int p = bus.priorityCapacity;

            while(p>0 && priorityIdx<passengers.length){
                if(passengers[priorityIdx].arriveTime>bus.departureTime){
                    break;
                }
                if(passengers[priorityIdx].priority=='E' && !passengers[priorityIdx].isBoard){
                    maxWait = Math.max(maxWait, bus.departureTime-passengers[priorityIdx].arriveTime);
                    passengers[priorityIdx].isBoard = true;
                    p--;
                }
                priorityIdx++;
            }

            int remain = bus.capacity-bus.priorityCapacity+p;

            while(remain>0 && idx<passengers.length){
                if(passengers[idx].arriveTime>bus.departureTime){
                    break;
                }

                if(!passengers[idx].isBoard){
                    remain--;
                    passengers[idx].isBoard = true;
                    maxWait = Math.max(maxWait, bus.departureTime-passengers[idx].arriveTime);
                }
                idx++;
            }



        }


        int onCount=0;
        for(Passenger p : passengers){
            if(p.isBoard){
                onCount++;
            }
        }

        sb.append(onCount).append(" ").append(passengers.length-onCount).append(" ").append(maxWait).append("\n");
    }
    public static void main(String[] args) throws Exception {
    /*
    1.20:05 시작 ~ 20:35
    시뮬레이션 문제
    승객들을 도착시간 순으로 정렬(같은 시간엔 입력된 순으로 순서유지)
    버스도 도착시간 출발시간 순으로 정렬(같은 시간엔 입력된 순으로 순서유지)

    각 버스마다 반복하면서
        1. 버스 출발시간>=승객 도착시간이거나 2. 아직 탑승하지 않았으면 탑승 가능
        (1) 우선 승객부터 탑승
        while(priorityCapacity>0){
            우선승객부터 태우기
        }
        (2) 남은 자리는 탑승 한도에 맞게 순서대로 탑승
        while(한도-우선탑승한도-priorityCapacity){
            남은 승객 순서대로 태우기
        }


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(M*N) :
    공간 복잡도 : O(N+M) :

    3. 자료구조
    Bus[] buses
    Passenger[] passengers
    */

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            Passenger[] passengers = new Passenger[n];
            Bus[] buses = new Bus[m];

            for(int i=0; i<n; i++){
                int arriveTime = sc.nextInt();
                char priority = sc.next().charAt(0);
                passengers[i] = new Passenger(arriveTime, priority);
            }
            Arrays.sort(passengers);

            for(int i=0; i<m; i++){
                int departureTime = sc.nextInt();
                int capacity = sc.nextInt();
                int priorityCapacity = sc.nextInt();

                buses[i] = new Bus(departureTime, capacity, priorityCapacity);
            }
            Arrays.sort(buses);


            sb.append("#").append(test_case).append(" ");
            process(passengers,buses,sb);
        }
        System.out.print(sb.toString());
  }
}

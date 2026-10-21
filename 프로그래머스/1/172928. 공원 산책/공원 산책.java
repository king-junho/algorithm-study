class Solution {
    public enum DIRECTION {
    E(0),
    W(1),
    N(2),
    S(3);

    private int idx;

    DIRECTION(int idx) {
      this.idx = idx;
    }

    public int getIdx() {
      return idx;
    }

  }
    public int[] solution(String[] park, String[] routes){
    /*
    주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
    주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
      위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.

    1. 아이디어
    현재 위치 (y,x) 필요
    for(String route : routes}로 명령 반복
      현재 위치가 공연을 벗어나는지 체크 -> 벗어나면 continue
      현재 방향에 장애물 있는지 체크 -> 있다면 continue

    반복문 종료 후 현재 위치 반환

    2. 시간복잡도
    시간복잡도 : O(라우트 길이 * 이동할 거리)
    공간복잡도 :

    3. 자료구조
     */

    int H = park.length;
    int W = park[0].length();
    int currentX = 0, currentY = 0;
    boolean isPass = false;

    //동서북남
    int[] dy = new int[]{0,0,-1,1};
    int[] dx = new int[]{1,-1,0,0};

    for(int i=0; i<H; i++){
      if(park[i].contains("S")){
        currentX=park[i].indexOf("S");
        currentY=i;
        break;
      }
    }

    for(String route: routes){
      String[] routeArray = route.split(" ");
      DIRECTION direction = DIRECTION.valueOf(routeArray[0]);
      int distance = Integer.parseInt(routeArray[1]);
      int x=currentX;
      int y= currentY;
      isPass=true;

      for(int i=0; i<distance; i++){
        int ny = y+dy[direction.getIdx()];
        int nx = x+dx[direction.getIdx()];

        if(nx<0 || nx>=W || ny<0 || ny>=H){
          isPass=false;
          break;
        }

        if(park[ny].charAt(nx)=='X'){
          isPass=false;
          break;
        }
        x=nx;
        y=ny;
      }
      
      if(isPass){
        currentX = x;
        currentY = y;
      }
    }
    return new int[]{currentY,currentX};
  }
}
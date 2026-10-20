class Solution {
    private int answer;

  private void backtrack(int k, int currentIdx, int[][]dungeons, boolean[] visited, int count){
    if(k<dungeons[currentIdx][0]){
      answer=Math.max(answer,count);
      return;
    }
    count++;

    if(count== dungeons.length){
      answer=count;
      return;
    }

    visited[currentIdx]=true;

    for(int i=0; i<dungeons.length; i++){
      if(visited[i]){
        continue;
      }
      visited[i]=true;
      backtrack(k-dungeons[currentIdx][1], i,dungeons, visited, count);
      visited[i]=false;
    }
      visited[currentIdx]=false;
  }

  public int solution(int k, int[][] dungeons){
    /*
    1. 아이디어
    던전 개수 8개 이하이므로 백트레킹으로 접근
    던전의 순서 상관 있으므로 visited 필요 백트레킹 처음부터 시작
      if 현재 피로도 < 최소 필요 피로도 이면 return count 초기화 후 값 비교해서 최대값 저장;
      입장 가능하면 count ++ & 피로도 차감 -> 여기서 for문으로 다른 던전 탐색 시작
        다른 던전 방문하지 않았다면 해당 던전 방문처리 후 백트레킹 새로이 반복

    dungeons[i] = {최소 필요 피로도, 소모 피로도};

    2. 시간복잡도
    시간복잡도 : 모든 던전을 순서 고려하여 조회하므로 N!
    공간복잡도 : 스택 생성 만 O(N+1)

    3. 자료구조
    boolean [] = new visited[N]
     */
    boolean[] visited = new boolean[dungeons.length];
    for(int i=0; i<dungeons.length; i++){
      backtrack(k, i, dungeons, visited, 0);
    }

    return answer;
  }
}
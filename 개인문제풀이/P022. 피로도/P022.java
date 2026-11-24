public class P022 {
    private int goDungeon(int[][] dungeons, boolean[] visited, int current, int depth){
        int best=depth;

        for(int i=0; i<dungeons.length; i++){
            if(current<dungeons[i][0] || visited[i]){
                continue;
            }


            visited[i]=true;
            int child = goDungeon(dungeons,visited,current-dungeons[i][1], depth+1);
            best=Math.max(best,child);
            visited[i]=false;
        }

        return best;
    }
    public int solution(int k, int[][] dungeons) {
        int answer;
        boolean[] visited = new boolean[dungeons.length];
        answer = goDungeon(dungeons,visited,k,0);

        return answer;
    }

    public static void main(String[] args) throws Exception {
    /*
    1.20:20 시작 ~ 20:38
    백트레킹 문제 가능한 모든 경우의 수 탐색
    goDungeon(dungeons, visited, current, depth)

    int best=0;
    for(int i=0; i<dungeons.length; i++){
        if(current<dungeons[i].need)
            continue;
         visited[i]=true;
         int child = goDungeon(dungeons, visited, current-dungeons[i]-consume, depth+1);
         visited[i]=false;
         best=Math.max(best,child);
    }

    return best;


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N!) :
    공간 복잡도 : O(N) :

    3. 자료구조
    */
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        Solution s = new Solution();
        System.out.println(s.solution(k, dungeons));
  }
}

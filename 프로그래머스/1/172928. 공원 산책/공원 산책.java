class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[] routeSplit;
        String dir;
        int dist;

        int w=0,h=0,nw=0,nh=0;
        int width=park[0].length();
        int height=park.length;
        boolean isObstacle;

        //출발점, 직사각형 가로 세로 구하기
        for(int i=0; i<height; i++){
            if(park[i].contains("S")){
                h=i;
                w=park[i].indexOf('S');
            }
        }

        //route별로 이동 시작
        for(String route : routes){
            routeSplit = route.split(" ");
            dir = routeSplit[0];
            dist = Integer.parseInt(routeSplit[1]);
            isObstacle=false;

            //왼, 오로 움직일 때
            switch(dir){
                case "W" -> {
                    nw = w-dist;
                    if(nw>=0 && nw<width &&!park[h].substring(nw,w).contains("X")){
                        w=nw;
                    }
                }
                case "E" -> {
                    nw = w+dist;
                    if(nw>=0 && nw<width &&!park[h].substring(w,nw+1).contains("X")){
                        w=nw;
                    }
                }
                case "N" -> {
                    nh = h-dist;
                    if(nh>=0 && nh<height){
                        for(int i=nh; i<h; i++){
                            if(park[i].substring(w,w+1).contains("X")){
                                isObstacle=true;
                                break;
                            }
                        }
                        if(!isObstacle){
                            h=nh;
                        }
                    }

                }
                case "S" -> {
                    nh = h+dist;
                    if(nh>=0 && nh<height){
                        for(int i=h; i<=nh; i++){
                            if(park[i].substring(w,w+1).contains("X")){
                                isObstacle=true;
                                break;
                            }
                        }
                        if(!isObstacle){
                            h=nh;
                        }
                    }
                }
            }

        }
        
        return new int[]{h,w};
    }
}
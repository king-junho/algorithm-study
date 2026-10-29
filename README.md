# algorithm-study
This is an auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).


---

# 코딩테스트 학습 기록

Java로 카카오 채용 코딩테스트와 SSAFY SW 역량 평가를 준비한다. 카카오테크 부트캠프 선발 전형은 별도로 구분한다. 운영 규칙은 [AGENTS.md](AGENTS.md)를 따른다.

## 진행 현황

| 번호 | 제목 | 출처·구분 | 유형 | 난이도 | 결과 | 풀이 시간 | 시간·공간 복잡도 |
| --- | --- | --- | --- | --- | --- | --- | --- |
| P001 | [숫자 비교하기](<개인문제풀이/P001. 숫자 비교하기/README.md>) | [프로그래머스 120807](https://school.programmers.co.kr/learn/courses/30/lessons/120807) · 일반 공개 연습 | 조건문 | 입문 | 로컬 검증 통과 · 92점 | 1분 | O(1) · O(1) |
| P002 | [같은 숫자는 싫어](<개인문제풀이/P002. 같은 숫자는 싫어/README.md>) | [프로그래머스 12906](https://school.programmers.co.kr/learn/courses/30/lessons/12906) · 일반 공개 연습 | 배열·반복문 | 기초 | 로컬 검증 통과 · 91점 | 10분 | O(n) · O(n) |
| P004 | [실패율](<개인문제풀이/P004. 실패율/README.md>) | [카카오 2019 공채](https://school.programmers.co.kr/learn/courses/30/lessons/42889) · 공개 기출 | 집계·정렬 | 실전 입문 | 로컬 검증 통과 · 82점 | 20분 | O(M log(N+1)+N log(N+1)) · O(N) |
| P005 | [캐시](<개인문제풀이/P005. 캐시/README.md>) | [카카오 공채](https://school.programmers.co.kr/learn/courses/30/lessons/17680) · 공개 기출 | 문자열·시뮬레이션 | 실전 기초 | 로컬 검증 통과 · 86점 | 20분 | O(MC) · O(C), C>0・문자열 길이 고정 |
| P008 | [연결된 방 찾기](<개인문제풀이/P008. 연결된 방 찾기/README.md>) | [공개 연습 참고](https://school.programmers.co.kr/learn/courses/30/lessons/43162) · 창작(기출 아님) | BFS 기본 탐색 | BFS 첫 연습 | 로컬 검증 통과 · 89점 | 20분 | O(V+E) · O(V) |
| P009 | [방 방문 순서](<개인문제풀이/P009. 방 방문 순서/README.md>) | 창작(기출 아님) | BFS·방문 순서 | BFS 첫 연습 | 로컬 검증 통과 · 97점 | 약 10분 | O(V+E) · O(V) |
| P010 | [목표 방까지 최소 이동](<개인문제풀이/P010. 목표 방까지 최소 이동/README.md>) | 창작(기출 아님) | BFS·최단거리 | BFS 기초+ | 로컬 검증 통과 · 93점 | 최초20분・추가수정 미보고 | O(V+E) · O(V) |
| P011 | [모든 방까지의 거리](<개인문제풀이/P011. 모든 방까지의 거리/README.md>) | 창작(기출 아님) | BFS·거리 배열 | BFS 기초 | 로컬 검증 통과 · 98점 | 20분 | O(V+E) · O(V) |
| P012 | [게임 맵 최단거리](<개인문제풀이/P012. 게임 맵 최단거리/README.md>) | [프로그래머스 1844](https://school.programmers.co.kr/learn/courses/30/lessons/1844) · 일반 공개 연습 | 격자 BFS·최단거리 | BFS 기초 응용 | 로컬 검증 통과 · 96점 | 35분 | O(MN) · O(MN) |
| P013 | [DFS로 연결된 방 세기](<개인문제풀이/P013. DFS로 연결된 방 세기/README.md>) | 창작(기출 아님) | 재귀 DFS·방문 표시 | DFS 첫 연습 | 도움 후 수정·통과97점 | 최초15분・추가미보고 | O(V+E) · O(V) |
| P014 | [DFS 방 방문 순서](<개인문제풀이/P014. DFS 방 방문 순서/README.md>) | 창작(기출 아님) | 재귀 DFS·방문 순서 | DFS 기초 | 로컬 검증 통과 · 96점 | 10분 | O(V+E) · O(V) |
| P015 | [연결된 방 그룹 세기](<개인문제풀이/P015. 연결된 방 그룹 세기/README.md>) | [공개 연습 변형](https://school.programmers.co.kr/learn/courses/30/lessons/43162) · 기출 아님 | 재귀 DFS·연결 요소 | DFS 기초+ | 로컬 검증 통과 · 98점 | 10분 | O(V+E) · O(V) |
| P016 | [섬의 개수](<개인문제풀이/P016. 섬의 개수/README.md>) | [공개 연습 참고](https://school.programmers.co.kr/learn/courses/30/lessons/154540) · 창작(기출 아님) | 격자 DFS·연결 요소 | DFS 기초 응용 | 로컬 검증 통과 · 93점 | 30분 | O(NM) · O(NM) |
| P017 | [가장 큰 섬의 넓이](<개인문제풀이/P017. 가장 큰 섬의 넓이/README.md>) | [공개 연습 참고](https://school.programmers.co.kr/learn/courses/30/lessons/154540) · 창작(기출 아님) | 격자 DFS·영역 크기 | DFS 기초 응용+ | 해설 후 수정·통과96점 | 최초40분・추가미보고 | O(NM) · O(NM) |
| P018 | [중복 없이 번호 나열하기](<개인문제풀이/P018. 중복 없이 번호 나열하기/README.md>) | [공개 연습 참고](https://school.programmers.co.kr/learn/courses/30/lessons/42839) · 창작(기출 아님) | 백트래킹·순열 | 백트래킹 입문 | 로컬 검증 통과 · 93점 | 15분 | O(mK) · O(n+m+mK), K=P(n,m) |
| P019 | [오름차순으로 번호 고르기](<개인문제풀이/P019. 오름차순으로 번호 고르기/README.md>) | [공개 연습 참고](https://school.programmers.co.kr/learn/courses/30/lessons/12977) · 창작(기출 아님) | 백트래킹·조합 | 백트래킹 기초 | 수정 후 통과94점 | 30분 | 시간상한 O(nC(n,m-1)+mK) · 공간O(n+m+mK), K=C(n,m) |
| P020 | [합이 목표인 조합](<개인문제풀이/P020. 합이 목표인 조합/README.md>) | [공개 연습 참고](https://school.programmers.co.kr/learn/courses/30/lessons/12977) · 창작(기출 아님) | 백트래킹·조건부 조합 | 백트래킹 기초+ | 로컬 검증 통과 · 97점 | 15분 | O(mK) · O(m+mR), K=C(n,m), R=정답수 |
| P021 | [타겟 넘버](<개인문제풀이/P021. 타겟 넘버/README.md>) | [프로그래머스 43165](https://school.programmers.co.kr/learn/courses/30/lessons/43165) · 일반 공개 연습 | 재귀 DFS·부호 선택 | 기초 응용 | 수정 후 통과94점 | 30분 | O(2^N) · O(N) |
| P023 | [영어 끝말잇기](<개인문제풀이/P023. 영어 끝말잇기/README.md>) | [프로그래머스 12981](https://school.programmers.co.kr/learn/courses/30/lessons/12981) · 일반 공개 연습 | 시뮬레이션·문자열·중복 검사 | 시뮬레이션 입문 | HashSet 개선·통과95점 | 15분 | 평균O(WL) · O(W) |
| P024 | [공원 산책](<개인문제풀이/P024. 공원 산책/README.md>) | [프로그래머스 172928](https://school.programmers.co.kr/learn/courses/30/lessons/172928) · 일반 공개 연습 | 시뮬레이션·격자 이동 | 기초 응용 | 통과96점 | 미보고 | O(HW+QD) · O(1) |
| P025 | [크레인 인형뽑기 게임](<개인문제풀이/P025. 크레인 인형뽑기 게임/README.md>) | [프로그래머스 64061](https://school.programmers.co.kr/learn/courses/30/lessons/64061) · 2019 카카오 겨울 인턴십 공개 기출 | 시뮬레이션·격자 상태 변경 | 기초 응용 | 통과98점 | 20분 | O(CN) · O(C) |
| P026 | [숫자의 표현](<개인문제풀이/P026. 숫자의 표현/README.md>) | [프로그래머스 12924](https://school.programmers.co.kr/learn/courses/30/lessons/12924) · 일반 공개 연습 | 투 포인터·연속 구간 합 | 입문 | 통과98점 | 수정10분 | O(n) · O(1) |
| P027 | [연속된 부분 수열의 합](<개인문제풀이/P027. 연속된 부분 수열의 합/README.md>) | [프로그래머스 178870](https://school.programmers.co.kr/learn/courses/30/lessons/178870) · 일반 공개 연습 | 투 포인터·최단 구간 | 기초 응용 | 통과97점 | 25분 | O(N) · O(1) |
| P028 | [구명보트](<개인문제풀이/P028. 구명보트/README.md>) | [프로그래머스 42885](https://school.programmers.co.kr/learn/courses/30/lessons/42885) · 일반 공개 연습 | 정렬·투 포인터·그리디 | 기초 응용 | 통과95점 | 40분 초과 | O(N log N) · O(N) |
| P029 | [두 수의 합을 0에 가깝게](<개인문제풀이/P029. 두 수의 합을 0에 가깝게/README.md>) | [BOJ2470 참고](https://www.acmicpc.net/problem/2470) · 공개 연습 기반 함수형 변형 | 정렬·투 포인터·최솟값 | 기초 응용 | 통과96점 | 15분 | O(N log N) · O(N)(정렬 포함 최악) |
| P030 | [정렬된 배열에서 값 찾기](<개인문제풀이/P030. 정렬된 배열에서 값 찾기/README.md>) | [개념 참고](https://cp-algorithms.com/num_methods/binary_search.html) · 독립 창작 | 이진 탐색 | 입문 | 수정 통과95점 | 최초30분·추가미보고 | O(log N) · O(log N)(재귀) |
| P031 | [target 이상인 첫 위치](<개인문제풀이/P031. target 이상인 첫 위치/README.md>) | [개념 참고](https://cp-algorithms.com/num_methods/binary_search.html#lower-bound-and-upper-bound) · 독립 창작 | 이진 탐색·경계 탐색 | 기초 응용 | 힌트 후 통과97점 | 30분 | O(log N) · O(log N)(재귀) |
| P032 | [달팽이 숫자](<개인문제풀이/P032. 달팽이 숫자/README.md>) | [SWEA1954](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PobmqAPoDFAUq) · 공개 연습 | 격자·시뮬레이션 | D2 | 통과95점 | 미보고 | O(N²) · O(N²)(배열 포함) |
| P033 | [부분 수열의 합](<개인문제풀이/P033. 부분 수열의 합/README.md>) | [SWEA2817](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV7IzvG6EksDFAXB) · 공개 연습 | 완전탐색·재귀·백트래킹 | D3 | 통과93점 | 25분 | O(2^N) · O(N) |
| P035 | [안전한 룩 배치](<개인문제풀이/P035. 안전한 룩 배치/README.md>) | [SWEA2806 참고](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV7GKs06AU0DFAXB) · 공개 연습 기반 창작 | 백트래킹·열 중복 방지 | N-Queen 전 단계(공식등급없음) | 수정 통과94점 | 미보고 | O(N²·N!) 상한 · O(N²)(판 포함) |
| P037 | [창용 마을 무리의 개수](<개인문제풀이/P037. 창용 마을 무리의 개수/README.md>) | [SWEA7465](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWngfZVa9XwDFAQU) · 공개 연습 | 그래프·연결 관계 | D4 | 수정 통과91점 | 40분 | O(N+M) · O(N+M) |
| P038 | [격자판의 숫자 이어 붙이기](<개인문제풀이/P038. 격자판의 숫자 이어 붙이기/README.md>) | [SWEA2819](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV7I5fgqEogDFAXB) · 공개 연습 | 격자 탐색·재귀·중복 제거 | D4 | 수정 통과98점 | 50분 | O(16·4^6) 상한 · O(U+6) |
| P039 | [어디에 단어가 들어갈 수 있을까](<개인문제풀이/P039. 어디에 단어가 들어갈 수 있을까/README.md>) | [SWEA1979](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PuPq6AaQDFAUq) · 공개 연습 | 2차원 배열·연속 구간 | D2 | 통과97점 | 30분 | O(N²) · O(N²)(판 포함) |
| P040 | [파리 퇴치](<개인문제풀이/P040. 파리 퇴치/README.md>) | [SWEA2001](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PzOCKAigDFAUq) · 공개 연습 | 2차원 배열·부분 영역 합 | D2 | 통과98점 | 미보고 | O(N²+(N-M+1)²M²) · O(N²) |
| P041 | [상호의 배틀필드](<개인문제풀이/P041. 상호의 배틀필드/README.md>) | [SWEA1873](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LyE7KD2ADFAXc) · 공개 연습 | 격자 시뮬레이션·명령 처리 | D3 | 수정 통과95점 | 최초40분·추가미보고 | O(HW+N·max(H,W)) · O(HW+N) |
| P042 | [원재의 메모리 복구하기](<개인문제풀이/P042. 원재의 메모리 복구하기/README.md>) | [SWEA1289](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV19AcoKI9sCFAZN) · 공개 연습 | 문자열·그리디 | D3 | 통과94점 | 20분 | O(N²) · O(N) |
| P043 | [계단을 오르는 방법](<개인문제풀이/P043. 계단을 오르는 방법/README.md>) | [개념 참고](https://cp-algorithms.com/dynamic_programming/intro-to-dp.html) · 독립 창작 | DP·경우의 수 | 첫 입문 | 통과96점 | 10분 | O(N) · O(N) |
| P045 | [최소 비용으로 도착하기](<개인문제풀이/P045. 최소 비용으로 도착하기/README.md>) | [개념 참고](https://cp-algorithms.com/dynamic_programming/intro-to-dp.html) · 독립 창작 | 2차원 DP·최소 비용 | 기초 | 통과93점 | 20분 | O(NM) · O(NM) |
| P046 | [이웃하지 않게 보상 고르기](<개인문제풀이/P046. 이웃하지 않게 보상 고르기/README.md>) | [개념 참고](https://cp-algorithms.com/dynamic_programming/intro-to-dp.html) · 독립 창작 | 1차원 DP·최댓값 | 기초 | O(N) 개선·통과85점 | 미보고 | O(N) · O(N) |
| P048 | [마을 연결하기](<개인문제풀이/P048. 마을 연결하기/README.md>) | [개념 참고](https://cp-algorithms.com/graph/mst_kruskal_with_dsu.html) · 독립 창작 | MST·Prim | 입문 | 통과 93점 | 15분 | O(E log E) · O(V+E) |
| P049 | [통신망 설치](<개인문제풀이/P049. 통신망 설치/README.md>) | [개념 참고](https://cp-algorithms.com/graph/mst_prim.html) · 독립 창작 | MST·Prim·연결 판정 | 기초 | 통과 94점 | 15분 | O(V+E log(E+1)) · O(V+E) |
| P050 | [예산 안에서 학교 연결하기](<개인문제풀이/P050. 예산 안에서 학교 연결하기/README.md>) | [개념 참고](https://cp-algorithms.com/graph/mst_prim.html) · 독립 창작 | MST·예산 판정 | 기초 | 통과 95점 | 20분 | O(V+E log(E+1)) · O(V+E) |
| P051 | [긴급 보급 상자](<개인문제풀이/P051. 긴급 보급 상자/README.md>) | 독립 창작 · 문제 문서의 난이도 참고 링크 | 백트래킹·부분집합 | 학습용 D3 상당 | 수정 통과 91점 · 재도전 예정 | 미보고 | O(2^N) · O(N) |
| P052 | [목표 금액 만들기](<개인문제풀이/P052. 목표 금액 만들기/README.md>) | 독립 창작 · 문제 문서의 난이도 참고 링크 | 백트래킹·경우의 수 | 학습용 D3 상당 | 통과 96점 | 15분 | O(2^N) · O(N) |
| P053 | [가장 짧은 배송 구간](<개인문제풀이/P053. 가장 짧은 배송 구간/README.md>) | 독립 창작 · 문제 문서의 난이도 참고 링크 | 투포인터·가변 구간 | 학습용 D3 상당 | 수정 통과 93점 | 1시간 | O(N) · O(N) |
| P054 | [가장 많은 자원이 있는 구역](<개인문제풀이/P054. 가장 많은 자원이 있는 구역/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | DFS·구역 합산 | 학습용 D3 상당 | 수정 통과 95점 | 약13분(주석 기준) | O(HW) · O(HW) |
| P055 | [하루 행사 배정](<개인문제풀이/P055. 하루 행사 배정/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | 그리디·구간 선택 | 학습용 D3 상당 | 통과 92점 · 재도전 예정 | 20분 | O(N log N) · O(N) |
| P056 | [점검 로봇의 이동 비용](<개인문제풀이/P056. 점검 로봇의 이동 비용/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | DP·최소 비용 | 학습용 D3 상당 | 수정 통과 97점 | 16분 | O(N) · O(N) |
| P057 | [주문에 맞는 상자](<개인문제풀이/P057. 주문에 맞는 상자/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | 이진 탐색·경계 탐색 | 학습용 D3 상당 | 수정 통과 94점 | 약30분(주석 기준) | O(N log N+Q log N) · O(N+Q) |
| P058 | [도로 유지비 줄이기](<개인문제풀이/P058. 도로 유지비 줄이기/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | MST·Prim·절약액 | 학습용 D3 상당 | 통과 92점 | 약30분(주석 기준) | O(V+E log(E+1)) · O(V+E) |
| P059 | [공용 프린터 작업 순서](<개인문제풀이/P059. 공용 프린터 작업 순서/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | 그리디·정렬·누적 합 | 학습용 D2~D3 상당 | 통과 95점 | 약11분(주석 기준) | O(N log N) · O(N) |
| P060 | [출발지에서 각 마을까지](<개인문제풀이/P060. 출발지에서 각 마을까지/README.md>) | [개념 참고](https://cp-algorithms.com/graph/dijkstra_sparse.html) · 독립 창작 | 다익스트라 | 입문 | 통과 98점 | 25분 | O(N+M log(N+1)) · O(N+M) |
| P061 | [시간 안에 배달하기](<개인문제풀이/P061. 시간 안에 배달하기/README.md>) | [개념 참고](https://cp-algorithms.com/graph/dijkstra.html) · 독립 창작 | 다익스트라 | 기본 응용 | 수정 통과 97점 | 약15분(초기 주석 기준) | O(N+M log(N+1)) · O(N+M) |
| P062 | [연구 기지 통신망](<개인문제풀이/P062. 연구 기지 통신망/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | MST·Prim·기존 연결 활용 | 기초 응용 | 통과 94점 · 재도전 예정 | 50분 | O(N+(L+M) log(L+M+1)) · O(N+L+M) |
| P063 | [비상 연락 완료 시각](<개인문제풀이/P063. 비상 연락 완료 시각/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | 다익스트라·최대 도착 시각 | 기초 응용 | 수정 통과 94점 · 재도전 예정 | 10분(초기 풀이·수정시간 미보고) | O(N+M log(N+1)) · O(N+M) |
| P064 | [보급소를 거쳐 배송하기](<개인문제풀이/P064. 보급소를 거쳐 배송하기/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | 다익스트라·필수 경유 | 기초 응용 | 수정 통과 96점 | 30분(초기 풀이·수정시간 미보고) | O(N+M log(N+1)) · O(N+M) |
| P065 | [연구망 품질 높이기](<개인문제풀이/P065. 연구망 품질 높이기/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | 최대 신장 트리·Prim | 학습용 D3 상당 | 통과 97점 | 12분 | O(N+M log(M+1)) · O(N+M) |
| P066 | [탐사 차량의 통행료](<개인문제풀이/P066. 탐사 차량의 통행료/README.md>) | 독립 창작 · 문제 문서의 참고 링크 | 격자 다익스트라 | 학습용 D3~D4 상당 | 수정 통과 94점 | 31분(좌표 재수정 추가시간 미보고) | O(HW log(HW+1)) · O(HW) |
| P068 | [가랏! RC카!](<개인문제풀이/P068. 가랏! RC카!/README.md>) | [SWEA1940](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PjMgaALgDFAUq) · 공개 연습 | 시뮬레이션·상태 유지 | D2 | 수정 통과 98점 | 10분(초기 풀이·수정시간 미보고) | O(N) · 보조 O(1) |
| P069 | [모든 마을 사이의 이동 시간](<개인문제풀이/P069. 모든 마을 사이의 이동 시간/README.md>) | [개념 참고](https://cp-algorithms.com/graph/all-pair-shortest-path-floyd-warshall.html) · 독립 창작 | 플로이드–워셜 | 입문 | 통과 98점 | 17분 | O(N³) · O(N²) |

현재 60문제 통과했다. P046은 Java21에서10,140계산입력및실제main4케이스 검증을 통과했다. P045는 Java21에서792케이스 표준입출력 검증을 통과했다. P043은 Java21에서180케이스 표준입출력 검증을 통과했다. P042는 Java21에서2,246케이스 표준입출력 검증을 통과했다. P041은 Java21에서502케이스 표준입출력 검증을 통과했다. P040은 Java21에서1,072케이스 표준입출력 검증을 통과했다. P039는 Java21에서8,036입력과별도표준입출력4케이스 검증을 통과했다. P038은 Java21에서112테스트케이스 표준입출력 검증을 통과했다. P037은 Java21에서34,869그래프와별도표준입출력5케이스 검증을 통과했다. P035는 Java21에서1,531판과표준입출력3케이스 검증을 통과했다. P033은 Java21에서20,141입력과별도표준입출력3케이스 검증을 통과했다. P032는 Java21에서120개 테스트케이스 표준입출력 검증을 통과했다. P031은 Java21에서80,911개 입력 검증을 통과했다. P030은 Java21에서208,359개 입력 검증을 통과했다. P029는 Java21에서7,089개 입력 검증을 통과했다. P028은 Java21에서9,151개 입력 검증을 통과했다. P027은 Java21에서16,375개 입력 검증을 통과했다. P026은 Java21 전 입력10,000개 검증을 통과했다. P025는 Java21에서154,878개 입력 검증을 통과했다. P024는 Java21에서 40,173개 입력 검증을 통과했다. P023은Java21의26,494입력반복호출검증을통과했다. P021은최대입력포함4,563사례의반복호출검증을통과했다. P020은전체입력범위의반복호출검증을통과했다. P019는전입력범위반복호출검증을통과했다. P018은 전입력범위와반복호출검증을통과했다. P017은 해설 후 수정해 75,956개 지도 반복호출 검증을 통과했다. P016은 Java21에서 75,957개 지도의 반복호출 검증을 통과했다. P015는 Java21에서 34,870개 입력의 반복호출 검증을 통과했다. P014는 Java21 반복호출 검증을 통과했다. P013은 도움 후 수정안을 검증해 통과했으며 동일·새 인스턴스 재호출을 포함했다. P012는 Java21에서 2,860개 지도를 실제 검증해 통과했다. P011은 Java21에서 10,784개 시작점 사례를 실행해 통과했다. P010은 Java21에서 69,832개 시작·목표 조합을 실행해 통과했다. P009는 Java21에서 6,406개 테스트를 실행해 통과했다. P008은 Java 21에서 총 2,102개 테스트를 실행해 통과했다. P005는 Java 21에서 2,012개 테스트를 실제 실행해 통과했다. P004는 Java 21에서 2,008개 테스트를 실제 실행해 통과했다. P002는 Java 21에서 1,009개 테스트(길이 100만 2개, 고정 시드 무작위 1,000개 포함)를 실제 실행해 통과했다. P001은 Java 21에서 9개 테스트를 실제 실행해 통과했으며 외부 채점기는 실행하지 않았다. 기존 `src/main/java/Solution.java`는 출처·평가 미확인 사용자 작업으로 보존한다. 통과한 풀이와 문제 설명은 `개인문제풀이/P번호. 제목/`에 저장한다. 테스트는 실행 결과만 학습 로그에 기록하고 `Check.java`는 커밋하지 않는다. 기존 BaekjoonHub 기록은 보존한다.

- [학습 로그](LEARNING_LOG.md)
- 출처 확인일: 2026-10-15. P001의 특정 시험 출제 연도는 확인되지 않았다.
- Git: 로컬 master는 초기 커밋 없는 별도 작업 상태다. 원격 main의 기존 BaekjoonHub 이력을 보존하기 위해 `/tmp/algorithm-study-publish-20261015` 체크아웃에서 학습 기록을 반영한다. 원격: https://github.com/king-junho/algorithm-study.git . 푸시 결과는 채팅에서 보고한다.

## 제출과 평가

코드와 함께 풀이 설명, 시간·공간 복잡도, 실제 풀이 시간을 제출한다. 사용자 최신 요청에 따라 직접 테스트·예상값·실행 여부 제출은 요구하지 않는다. 채점 배점은 정확성 40 / 효율성 20 / 코드 품질 15 / 테스트·경계 조건 15 / 설명·면접 대응 10이다. 학습 통과 기준은 정확성 만점 및 총점 80점 이상이며 외부 채점기 결과와 구분한다.

5문제 통과마다 반복 실수와 개선 여부를 확인한다. P001에서 조건 해석과 상수 복잡도는 확인했다. 경계값 테스트와 실행 여부 보고를 다음 제출에서 보완한다. P002도 통과하여 다음에는 정렬과 인덱스 해석을 확인한다. 테스트 예상 결과·실행 여부와 복잡도 근거를 두 제출에서 반복 누락했다.

## 폴더와 대비 분류

- `백준/등급/문제/`: 기존 BaekjoonHub 기록 유지
- `프로그래머스/레벨/문제/`: 기존 BaekjoonHub 자동 업로드 기록 유지
- `개인문제풀이/P번호. 제목/`: 이 학습에서 다룬 문제 설명과 통과 Java 풀이. 출처·난이도·유형은 README에 기록하며 검증용 Java 파일은 제외
- P001~P003은 공통 기초 연습이며 P004는 카카오 채용 공개 기출이다. 카카오 채용 / 카카오테크 부트캠프 / SSAFY SW 역량 평가 / 삼성 SW 역량 테스트는 서로 별개로 출처 확인 후 태그를 붙인다.
- 플랫폼 레벨과 학습용 난이도는 별도 기준이다.

- P004 복잡도 표기: M=stages.length, N=스테이지 수. P003은 학습 보완 보류 상태다.

- P005 표기: M=도시 요청 수, C=캐시 크기. C=0이면 시간·공간 O(1). 다음 문제는 피드백을 마친 뒤 사용자 명시 요청 시에만 출제한다.

- 5문제 점검 완료: BFS 방문 표시 대상과 복잡도 설명 개선. 다음 목표는 BFS 처리 순서, 테스트 다양성·실행 여부 보고. P008은 사용자 직접 실행 여부 미보고.

- 2026-10-19부터 테스트·경계조건15점은 에이전트가 실행한 검증에서 확인한 제출 코드의 경계 처리 기준이다. 사용자 테스트 제출 누락은 감점하지 않으며 과거 점수에는 소급하지 않는다.

- 10문제 점검: BFS 기초·격자 안정화. DFS는 재귀 흐름, 상태 초기화, 간선수와 재귀스택 설명을 다음 학습에서 보완.

- 15문제점검: 선택복원독립구현성공. 재귀호출수·깊이·결과저장공간구분은계속보완. P018공간표기는결과포함,결과제외O(n+m).

- P018 재연습: path.clone()으로배열공유수정후매개변수버전으로갱신·전입력검증통과. 초기93점이력유지.

- P020은누적합매개변수버전으로개선·전입력재검증통과. 시간O(mK)는안전상한이며정밀식O(C(n+1,m)+mR). 기존97점유지.

- P023 복잡도 표기: W=단어수,L=최대단어길이. 참가자수n과구분,공간은입력제외.

- P023은HashSet버전으로개선·재검증통과. 현재평균시간O(WL),L상수시평균O(W). 기존List버전복잡도는과거이력.

- 20문제 점검: BFS·격자 경계와 선택·복원은 개선됐다. 초기 탐색 비용·재귀 깊이·결과 공간 구분과 반환형 재귀를 보완한다. P024: H행, W열, Q명령, D최대 이동 거리.

- 25문제 점검: 투 포인터 상태 갱신·종료·경계 처리가 개선됐다. 다음 보완은 포인터 이동 근거,정렬 보조 공간,주석 일치다. P029 공간은 Java21 정렬 포함 최악O(N),탐색만O(1).

- 30문제 점검: 재귀 반환·배치 복원은 개선. 입출력 검증과 재귀 호출 수·깊이·호출당 비용 구분을 보완한다. P034 보류 유지.

- 35문제 점검: 격자 상태 변경·연속 구간 구현은 개선. 출력 형식·테스트 초기화·입력 저장 공간 분석을 계속 점검한다.

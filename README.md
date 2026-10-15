# algorithm-study
This is an auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).


---

# 코딩테스트 학습 기록

Java로 카카오 채용 코딩테스트와 SSAFY SW 역량 평가를 준비한다. 카카오테크 부트캠프 선발 전형은 별도로 구분한다. 운영 규칙은 [AGENTS.md](AGENTS.md)를 따른다.

## 진행 현황

| 번호 | 제목 | 출처·구분 | 유형 | 난이도 | 결과 | 풀이 시간 | 시간·공간 복잡도 |
| --- | --- | --- | --- | --- | --- | --- | --- |
| P001 | [숫자 비교하기](problems/P001.md) | [프로그래머스 120807](https://school.programmers.co.kr/learn/courses/30/lessons/120807) · 일반 공개 연습 | 조건문 | 입문 | 로컬 검증 통과 · 92점 | 1분 | O(1) · O(1) |
| P002 | [같은 숫자는 싫어](problems/P002.md) | [프로그래머스 12906](https://school.programmers.co.kr/learn/courses/30/lessons/12906) · 일반 공개 연습 | 배열·반복문 | 기초 | 로컬 검증 통과 · 91점 | 10분 | O(n) · O(n) |

현재 2문제 통과했다. P002는 Java 21에서 1,009개 테스트(길이 100만 2개, 고정 시드 무작위 1,000개 포함)를 실제 실행해 통과했다. P001은 Java 21에서 9개 테스트를 실제 실행해 통과했으며 외부 채점기는 실행하지 않았다. 기존 `src/main/java/Solution.java`는 출처·평가 미확인 사용자 작업으로 보존한다. 통과한 코드는 해당 소스 폴더의 문제별 Java 파일에 저장한다.

- [학습 로그](LEARNING_LOG.md)
- 출처 확인일: 2026-10-15. P001의 특정 시험 출제 연도는 확인되지 않았다.
- Git: 로컬 master는 초기 커밋 없는 별도 작업 상태다. 원격 main의 기존 BaekjoonHub 이력을 보존하기 위해 `/tmp/algorithm-study-publish-20261015` 체크아웃에서 학습 기록을 반영한다. 원격: https://github.com/king-junho/algorithm-study.git . 푸시 결과는 채팅에서 보고한다.

## 제출과 평가

코드와 함께 풀이 설명, 시간·공간 복잡도, 직접 만든 테스트와 예상 결과, 실제 풀이 시간을 제출한다. 채점 배점은 정확성 40 / 효율성 20 / 코드 품질 15 / 테스트·경계 조건 15 / 설명·면접 대응 10이다. 학습 통과 기준은 정확성 만점 및 총점 80점 이상이며 외부 채점기 결과와 구분한다.

5문제 통과마다 반복 실수와 개선 여부를 확인한다. P001에서 조건 해석과 상수 복잡도는 확인했다. 경계값 테스트와 실행 여부 보고를 다음 제출에서 보완한다. P002도 통과하여 다음에는 정렬과 인덱스 해석을 확인한다. 테스트 예상 결과·실행 여부와 복잡도 근거를 두 제출에서 반복 누락했다.

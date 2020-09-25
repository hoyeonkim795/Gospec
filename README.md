# GoSpec

*배포주소*: http://tiroring.iptime.org:18080/

시연 가능 계정: id : test/ pw: test

UCC영상:https://www.youtube.com/watch?v=ff3WVptTH7U&feature=youtu.be  (0:53 부터 시연 시작)

## 팀원 정보 및 업무 분담 내역

팀원: 김현수,김호연,남동규,서지훈,정명주

| 이름   | 역할            | 담당 기능                                                    |
| ------ | --------------- | ------------------------------------------------------------ |
| 김현수 | 팀장 및 Backend | Restful API 설계, DB 설계 및 구축, Security 보안처리, JWT 토큰 구현, 팀 매칭 서비스 구현, Docker 구축, Jeknins CI/CD 구축, Swagger 문서 관리 |
| 김호연 | Frontend        | 아이디어 기획, Restful API 설계, DB 설계, 공모전 정보 달력 인터페이스로 제공 기능 구현, 유저별 달력 기능 구현, 분야별 인기 공모전 기능 구현, 회원별 인기 공모전 기능 구현, 회원가입 |
| 남동규 | Frontend        | Accounts                                                     |
| 서지훈 | Backend         | Restful API 설계, DB 설계 및 구축, File 처리, WebSocket 통신처리, Swagger 문서 관리, Message(Frontend) |
| 정명주 | Frontend        | Contest, Front-end 서버 배포                                 |



## 개발 일정
   - 일정관리.cell 참고

![19](\readme\19.JPG)

![20](\readme\20.JPG)

## 개발환경 

### 일정, 버전, 이슈관리

- JIRA
- GitLab
- Notion

### Back-end & Frontend

- Java 8
- Spring Boot 2.2.8.RELEASE
- Apache Maven 3.6.3
- Spring Security 5.2.5.RELEASE
- WebSocket 2.2.8.RELEASE
- Swagger 2.9.2
- Java JWT 3.8.3
- Weka 3.9.3
- Gson 2.8.5
- MyBatis 1.3.0
- MySql 8.0.21
- Ubuntu 18.04.5
- Docker Client 17.04.0-ce
- Docker Server 19.03.12
- Jenkins 2.251
- Vue.js
#### 기타
- MySql WorkBeanch 8.0
- Mobaxterm
- AWS EC2
- Spring Tool Suite 3
- Postman



## 배포 및 자동화 과정

1. AWS EC2
2. JENKINS

## 협업 방법

1. JIRA

   - 일정관리
   - 효율적/공평한 분업
   - 이슈관리
   - 이슈에 대한 작업 로그 등록

2. SWAGGER

   - REST API 문서화 및 관리
   - 테스트 환경 제공

3. GIT(GITLAB)

   - develop-back 과 develop-front로 branch를 나누어 작업
   - 각 branch 별로 기능당 feature/기능명 으로 branch를 생성하고 기능 완성 후 merge.

4. POSTMAN

   - Spring Security 사용으로 인한 로그인 api 설정 자동화. 따라서 로그인 토큰 발급을 위해 사용

     

## 프로젝트 배경

- 공모전 정보를 제공하는 기존의 웹사이트의 **불편한 UI/UX 개선** 과 공모전 참가에 팀을 찾는 어려움을 해소하고자 함

  ![1](.\readme\1.JPG)

- 달력 형식으로 공모전 정보를 제공함으로써 사용자 중심의 설계

  ![2](./readme/2.JPG)

- 회원을 대상으로 관심 공모전 **북마크 기능** 제공으로 유저의 편리성을 높임

  ![3](\readme\3.JPG)

- 단순 공모전 정보 제공이 아닌 공모전 참여를 원하는 회원들 간에 **팀매칭 서비스** 및 커뮤니티 개설

  ![4](\readme\4.jpg)

## 유저 스토리

1. 어학, 자격증 등 스펙이 전혀 없이 4학년에 진학한 천태평군은 취업에 대한 압박을 느끼고, 스펙을 쌓기 위해 여러가지 공모전 사이트를 활용해보지만 **불편하고 투박한 사이트 구성에 불편함**을 느낀다.

   => 사용자 중심으로 설계된 깔끔하고 세련된 UX/UI 설계

2. 현재 대학교 3학년 휴학 중인 건축학과 김아싸 군은 휴학 기간을 이용하여, 기술 협력 공모전에 나가고 싶지만 소심한 성격탓에 타 과에 지인이 없어 **마땅히 팀원을 구할 방법이 없다.**

   =>나와 관심사가 비슷한 팀, 팀원을 매칭해주는 시스템을 구현

3. 학과 동기 2명과 함께 기상 정보 공모전을 준비중인 전자공학과 이간단군은 팀의 부족한 미적 감각을 채워줄 디자인 전공을 구하기 위해 공모전 카페에서 **팀원을 찾는 도중** 연락이 오는 모든 **지원자들에 대한 정보 확인**에 번거로움을 느낀다.

   => 팀 매칭 시 팀원의 프로필 정보와 팀의 정보를 쉽게 확인 가능

4. 현재 기술 자격증 시험을 준비중인 김나나 양은 높은 난이도의 시험에 많은 두려움을 겪게 되고, 집 주변에서 **스터디를 구하지만 팀원의 정보를 확인하기 어려워** 스터디를 구하지 못하고 있다.

   => 구성원 프로필 확인 기능과 관심사, 지역별 구분을 통해 보다 쉽고 빠르고 안전하게 스터디 참여 가능

## 데이터베이스 모델링(ERD)

![image](img/GoSpec_Model.jpg)

## 주요 기능

1. 일정
   - 공모전 전체 정보를 달력 형식으로 한눈에 확인
   - 유저가 북마크한 공모전 전체 정보를 달력 형식으로 한눈에 확인
   - 관심있는 공모전 title 클릭시 공모전 개요와 북마크 기능 제공
   - 관심있는 공모전 field 별로 공모전 정보 확인 가능
2. 공모전
   - 공모전 field 별, 기간별(전체/신규/마감임박/접수중/접수예정/마감)로 정보제공
3. 팀 매칭
   - **weka** 라이브러리를 사용하여 팀매칭 서비스 제공
   - 팀원을 구하는 CRUD 커뮤니티 제공
   - 유저가 작성한 팀원을 구하는 게시글에 팀 참여를 신청한 다른 유저들을 **수락/거절** 하는 기능 제공
4. 쪽지기능 
   - **WebSocket**을 사용한 양방향 통신기능 제공
   - 실시간 알림 및 메세지 송,수신 가능
   - 보편화된 메일함 형식으로 CRUD 서비스를 이용

## 페이지 UI 및 기능

1. GoSpec 메인페이지

   ![6](\readme\6.JPG)

2. Home 화면

   ![7](\readme\7.JPG)

3. 전체일정 및 내일정(북마크)

   1) 전체 일정 및 내일정

   ![8](\readme\8.jpg)

   2) 상세 일정

   ![9](\readme\9.jpg)

4. 공모전

   1) 분야별 인기 공모전 및 기간 별 공모전

   ![10](\readme\10.JPG)

   2) 공모전 디테일

   ![11](\readme\11.JPG)

   3) 공모전 팀찾기 커뮤니티

   ![4](\readme\4.jpg)

   4) 공모전 팀원찾기 커뮤니티

   ![5](\readme\5.jpg)

5. 프로필

   1) 회원별 프로필 확인

   ![18](\readme\18.JPG)

   2) 프로필 수정

   ![15](\readme\15.JPG)

   3) 북마크한 공모전 목록

   ![21](\readme\21.JPG)

   4) 지원한 팀 관리

   ![12](\readme\12.JPG)

   5) 내가 쓴 팀 관리

   ![13](\readme\13.JPG)

   6) 내 프로필 확인

   ![14](\readme\14.JPG)

6. 쪽지기능

   1) 쪽지 전송

   ![17](\readme\17.JPG)

   2) 쪽지함 기능

   ![16](\readme\16.JPG)

   

   

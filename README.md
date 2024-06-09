프로젝트 내용
블로그 주소 : https://blog.naver.com/yhs5958_2/223433195659

⊙스프링 부트 게시글과 댓글 작성 애플리케이션 제작.

  ● 사용 프로그램 : Spring Tool Suite 4

  ● PC 개발 환경 : Windows10 / 개인 노트북.

  ● 프로젝트 기간 : 2024.03.18 ~ 05.01.

    ○ 프로젝트 설정

     - 빌드툴 : gradle-Groovy, Tthymeleaf

     - 언어 : JAVA 20

     - 스프링 부트 : version 3.2.4

     - 의존성 :Spring Web, Lombok, Spring Data JPA, 

     - 데이터 베이스(SQL) : H2Database 

     - Bootstrap v4.5.3

  ● 애플리케이션 구동 후 접속 주소 :  http://localhost:8080

 - 현재 회원가입 후 게시글과 댓글의 작성/수정/삭제가 가능하다.

 - 로그인을 하지 않으면 조회이외의 기능은 되지 않아서 로그인은 필수.

​

지난 번 제작처럼 maven이 아닌 gradle을 활용해보았고,

IDE를 Intelli_J가 아닌 STS4로는 처음 작성을 시도.​

이전에 만든 게시판과 크게 차이 나는 것은 아니기 때문에

부가적인 미흡분야를 연습 및 작성하면서 연습해보려고 하고 있다.

너무 기본형 디자인이기 때문에 생김새와 GUI 배치도 바꿔보려고 하고 있다.

​

⊙ 개선 사항

       - 페이징 수정. (=5/9완료. 0 페이지가 첫 페이지인데 1부터 시작하도록 개선 및 모양 수정.)

       - 조회수 기록. (= 5/7 완료.)
       
       - 목록에서 추천수 표시 및 레이아웃 수정(=5/12 완료.)

       - 게시글 카테고리 기능.(=5/12완료.)
       
       - 검색창에서 엔터키를 눌러도 동작하게 수정(=6/9 완료.)
       
       - 검색의 조건 설정 [제목,내용, 제목+내용 등] (수정 중.)
       
       - 게시글 고정이나 공지사항.

⊙ 도전해볼만한 기능.

       - 댓글의 대댓글 기능.

       - 댓글의 추천순↑↓/시간순↑↓ 정렬 기능. 

       - 추가적인 게시판과 메뉴.

       - ID, 비밀번호 찾기 및 변경 기능.

       - 회원의 프로필 화면.

       - 가입 후 ID의 관리자/회원 권한.

       - 글쓰기에 웹 에디터 적용해보기.

       - AWS서버 연동해보기

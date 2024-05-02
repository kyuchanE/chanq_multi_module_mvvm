# CleanArchitecture + Multi Module + MVVM + DI

---

<br/>
### 참고 자료

- Now in Android

<img src="https://miro.medium.com/v2/resize:fit:1100/format:webp/1*aIux1an8zPUXIhTLY7psfw.png">

https://developer.android.com/series/now-in-android?hl=ko
https://github.com/android/nowinandroid

<br/>

---

<br/>

### 구조

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FGknnD%2FbtsFM9u6vnv%2F9mABTFRXIlgvYPqdkfrrXk%2Fimg.jpg">


- App Layer
유저에게 데이터를 보여주고 상호작용 역할
UI에 해당되는 영역
App Layer는 Domain, Data Layer를 대상으로 의존성을 가지고 있다.

- Domain Layer
앱의 비지니스 로직이 위치한 곳이며 가장 중요한 핵심에 해당된다.
다른 Layer를 대상으로 의존성을 갖지 않는다.
즉 Android 플랫폼이 아닌 다른 어느곳에도 바로 적용 가능할 정도여야 한다.

- Data Layer
Data를 조회, 저장, 수정 역할
Domain Layer를 대상으로 의존성을 갖는다.



<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FtTbBP%2FbtsFLS8JrNO%2FP9r8ATx82STVaI75KrcoVk%2Fimg.png">

- Multi Module
프로젝트를 모듈 단위로 분리하여 개발 진행
Now in Android와 같이 추후 UI도 모듈단위로 분리하여 관리 진행 예정

<br/>

---

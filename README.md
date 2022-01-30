# Spring Cloud Gateway

API gateway 역할을 수행할 수 있는 spring cloud gateway 에 대해서 알아봅니다.


MSA 구성으로 다음 프로젝트들과 연관되어있습니다. 

| 서비스명                                                                            | 설명                   | 기타   |
|---------------------------------------------------------------------------------|----------------------|------|
| [cloud-api-first-service](https://github.com/irostub/cloud-api-first-service)   | first micro service  | ---- |
| [cloud-api-second-service](https://github.com/irostub/cloud-api-second-service) | second micro service | ---- |

### 두가지 라우팅 설정 방법
- application 설정 파일 (application.yml 참조)
- bean 등록 (FilterConfig.java 참조)


## 프로젝트 경과
1. gateway 서비스 포트설정 및 application name 설정
2. application.yml 작성 통한 route 설정
3. been 등록을 통한 route 설정 및 간단한 pre, post filter 설정
4. application.yml 작성을 통한 간단한 pre, post filter 설정
5. CustomFilter class 정의와 application.yml 등록




## 추가 학습목표
spring web flux 를 다음으로 공부해야함
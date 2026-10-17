# ☕ Java Learning - 단계별 Java 학습 공식 예제 코드

[jqdom.com](https://jqdom.com/blog?categoryId=9)의 **Java Learning** 시리즈(총 22개 챕터, 191개 레슨) 공식 예제 코드 및 실습 저장소입니다.

초보자를 위한 프로그래밍 기초부터 객체지향 프로그래밍(OOP), 모던 자바(Modern Java), IntelliJ/Git/Gradle 실무 도구, AI 페어 프로그래밍, 그리고 최종 텍스트 RPG 프로젝트(Java Adventure)까지 단계별로 직접 실행하며 학습할 수 있습니다.

---

## 🛠️ 요구 사항 (Prerequisites)

- **Java**: OpenJDK 21 이상 권장
- **Build Tool**: Gradle 8.5 (Gradle Wrapper 포함)

---

## 🚀 빠른 시작 (Quick Start)

### 1. 저장소 복제 (Clone)

```bash
git clone https://github.com/devguna81/java-learning.git
cd java-learning
```

### 2. 전체 프로젝트 컴파일

```bash
./gradlew compileJava
```

### 3. 특정 챕터/레슨 실행

IntelliJ IDEA 또는 Eclipse 등의 IDE에서 프로젝트를 열고 원하는 레슨의 `Main.java`를 열어 실행 버튼을 클릭하거나, 터미널에서 javac/java로 실행할 수 있습니다.

---

## 📖 전체 커리큘럼 및 챕터별 바로가기

| 챕터 | 모듈명 | 레슨 수 | 설명 | 링크 |
|:---|:---|:---:|:---|:---:|
| **Chapter 00. 개발자가 되어보자** | `chapter-00-intro` | 7편 | 실습 및 예제 소스 코드 | [이동](chapter-00-intro/README.md) |
| **Chapter 01. Java와 친해지기** | `chapter-01-basics` | 7편 | 실습 및 예제 소스 코드 | [이동](chapter-01-basics/README.md) |
| **Chapter 02. 변수** | `chapter-02-variables` | 10편 | 실습 및 예제 소스 코드 | [이동](chapter-02-variables/README.md) |
| **Chapter 03. 연산자** | `chapter-03-operators` | 9편 | 실습 및 예제 소스 코드 | [이동](chapter-03-operators/README.md) |
| **Chapter 04. 조건문** | `chapter-04-conditionals` | 9편 | 실습 및 예제 소스 코드 | [이동](chapter-04-conditionals/README.md) |
| **Chapter 05. 반복문** | `chapter-05-loops` | 10편 | 실습 및 예제 소스 코드 | [이동](chapter-05-loops/README.md) |
| **Chapter 06. 배열** | `chapter-06-arrays` | 9편 | 실습 및 예제 소스 코드 | [이동](chapter-06-arrays/README.md) |
| **Chapter 07. 메서드** | `chapter-07-methods` | 9편 | 실습 및 예제 소스 코드 | [이동](chapter-07-methods/README.md) |
| **Chapter 08. 클래스와 객체** | `chapter-08-classes-objects` | 10편 | 실습 및 예제 소스 코드 | [이동](chapter-08-classes-objects/README.md) |
| **Chapter 09. 객체지향 프로그래밍** | `chapter-09-oop` | 11편 | 실습 및 예제 소스 코드 | [이동](chapter-09-oop/README.md) |
| **Chapter 10. Collection** | `chapter-10-collections` | 10편 | 실습 및 예제 소스 코드 | [이동](chapter-10-collections/README.md) |
| **Chapter 11. 문자열** | `chapter-11-strings` | 9편 | 실습 및 예제 소스 코드 | [이동](chapter-11-strings/README.md) |
| **Chapter 12. 예외와 오류** | `chapter-12-exceptions` | 10편 | 실습 및 예제 소스 코드 | [이동](chapter-12-exceptions/README.md) |
| **Chapter 13. 파일 처리** | `chapter-13-file-io` | 8편 | 실습 및 예제 소스 코드 | [이동](chapter-13-file-io/README.md) |
| **Chapter 14. Modern Java** | `chapter-14-modern-java` | 8편 | 실습 및 예제 소스 코드 | [이동](chapter-14-modern-java/README.md) |
| **Chapter 15. IntelliJ IDEA** | `chapter-15-intellij` | 9편 | 실습 및 예제 소스 코드 | [이동](chapter-15-intellij/README.md) |
| **Chapter 16. Git / GitHub** | `chapter-16-git-github` | 9편 | 실습 및 예제 소스 코드 | [이동](chapter-16-git-github/README.md) |
| **Chapter 17. Gradle** | `chapter-17-gradle` | 8편 | 실습 및 예제 소스 코드 | [이동](chapter-17-gradle/README.md) |
| **Chapter 18. AI에게 질문하기** | `chapter-18-ai-prompts` | 6편 | 실습 및 예제 소스 코드 | [이동](chapter-18-ai-prompts/README.md) |
| **Chapter 19. AI 코드 검증** | `chapter-19-ai-verification` | 6편 | 실습 및 예제 소스 코드 | [이동](chapter-19-ai-verification/README.md) |
| **Chapter 20. AI Pair Programming** | `chapter-20-ai-pair-programming` | 7편 | 실습 및 예제 소스 코드 | [이동](chapter-20-ai-pair-programming/README.md) |
| **Final Project. Java Adventure** | `final-project-adventure` | 10편 | 실습 및 예제 소스 코드 | [이동](final-project-adventure/README.md) |

---

## 🎮 Final Project: Java Adventure

`final-project-adventure` 모듈은 본 커리큘럼의 총결산으로, 객체지향 5대 설계 원칙과 상속, 다형성, 컬렉션, 예외 처리를 망라하여 구현한 콘솔 텍스트 RPG 게임입니다.

- 캐릭터 생성 및 레벨업 시스템
- 몬스터(Zombie, Skeleton, Boss)와의 턴제 전투 시스템
- 인벤토리 및 포션 아이템 사용
- 클린 코드 리팩토링

---

## 🔗 관련 링크

- 🌐 [jqdom.com Java Learning 전체 커리큘럼](https://jqdom.com/blog?categoryId=9)
- 📝 블로그 게시글에서 각 레슨별 상세한 개념 설명과 그림, 퀴즈를 함께 확인하실 수 있습니다.

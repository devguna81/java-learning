# Java Learning - 단계별 Java 학습 예제 코드 저장소

jqdom.com의 **Java Learning** 시리즈(총 22개 챕터, 191개 레슨) 공식 예제 코드 및 실습 프로젝트 저장소입니다.

프로그래밍 기초 문법부터 객체지향 프로그래밍(OOP), 모던 자바(Modern Java), IntelliJ IDEA, Git, Gradle 실무 도구 활용법, AI 페어 프로그래밍, 그리고 최종 텍스트 RPG 프로젝트(Java Adventure)까지 단계별로 컴파일하고 실행할 수 있도록 구성되어 있습니다.

---

## 요구 사항 (Prerequisites)

- **Java**: OpenJDK 21 이상 권장 (Java 21 LTS)
  - 버전 확인: `java -version` 및 `javac -version`
  - 권장 배포판: Eclipse Temurin 21, Amazon Corretto 21, Oracle OpenJDK 21
- **빌드 도구**: Gradle 8.5 (프로젝트 내 Gradle Wrapper 포함)
- **운영체제**: Linux, macOS, Windows 지원

---

## 프로젝트 체크아웃 및 동기화 (Checkout & Sync)

### 1. 최초 저장소 복제 (Git Clone)

터미널 또는 콘솔 창에서 아래 명령어를 실행하여 로컬 환경에 저장소를 복제합니다:

```bash
# 저장소 복제
git clone https://github.com/devguna81/java-learning.git

# 프로젝트 디렉토리 이동
cd java-learning
```

### 2. 최신 코드 반영 (Git Pull)

원격 저장소의 최신 예제 코드 및 수정사항을 동기화하려면 아래 명령어를 사용합니다:

```bash
# main 브랜치 최신 커밋 가져오기
git pull origin main

# 로컬 작업 내용이 있어 충돌이 발생하는 경우
git stash
git pull origin main
git stash pop
```

---

## 프로젝트 빌드 및 실행 가이드 (Build & Run)

본 프로젝트는 22개의 하위 모듈로 이루어진 **Gradle 멀티 프로젝트(Multi-project)** 구조입니다.

### 1. Gradle Wrapper 실행 권한 부여 (Linux / macOS)

저장소를 처음 복제한 후 `gradlew` 스크립트에 실행 권한을 설정합니다:

```bash
chmod +x gradlew
```

> **Windows 사용자 참고:** Windows 환경에서는 `gradlew` 대신 `gradlew.bat`을 실행하거나 PowerShell에서 `.\gradlew`를 입력합니다.

---

### 2. 전체 프로젝트 컴파일 및 빌드 (Full Build)

루트 디렉토리에서 전체 22개 모듈(총 311개 Java 소스 파일)을 일괄 컴파일하고 테스트합니다:

```bash
# 전체 모듈 Java 소스 컴파일
./gradlew compileJava

# 전체 빌드 및 테스트 실행
./gradlew build

# 이전 빌드 캐시를 초기화하고 새로 빌드
./gradlew clean build
```

---

### 3. 특정 챕터 모듈별 빌드 (Targeted Build)

특정 챕터 모듈만 지정하여 빠르게 컴파일할 수 있습니다:

```bash
# Chapter 01 (자바 기초) 모듈 컴파일
./gradlew :chapter-01-basics:compileJava

# Chapter 08 (클래스와 객체) 모듈 컴파일
./gradlew :chapter-08-classes-objects:compileJava

# Chapter 14 (Modern Java) 모듈 컴파일
./gradlew :chapter-14-modern-java:compileJava
```

---

### 4. Final Project: Java Adventure 콘솔 게임 실행

커리큘럼의 종합 실습인 콘솔 텍스트 RPG 게임을 직접 실행하는 방법입니다.

#### 터미널에서 직접 컴파일 및 실행

```bash
# 1. Final Project 소스 디렉토리로 이동
cd final-project-adventure/src/main/java

# 2. 게임 패키지 전체 컴파일 (Java 21)
javac -encoding UTF-8 com/learning/adventure/game/*.java

# 3. 게임 실행
java com.learning.adventure.game.AdventureGame

# 4. 실습 완료 후 프로젝트 루트 디렉토리로 복귀
cd ../../../../
```

---

## IDE 환경 설정 (IDE Setup)

### IntelliJ IDEA
1. IntelliJ IDEA 실행 후 **[Open]** 메뉴 선택
2. `java-learning` 루트 디렉토리 선택
3. `Import Gradle Project` 대화상자에서 프로젝트 신뢰(Trust Project) 선택 및 동기화 진행
4. `File > Project Structure > Project SDK`가 **Java 21**로 지정되어 있는지 확인
5. 프로젝트 탐색기에서 실행하고자 하는 레슨(예: `com.learning.chapter08.lesson01.example.Main.java`)을 열고 `main` 메서드 라인의 실행 버튼 클릭

### Visual Studio Code
1. `Extension Pack for Java` 확장 설치
2. `File > Open Folder...` 메뉴로 `java-learning` 디렉토리 열기
3. Java Language Server 빌드 완료 후 각 `Main.java` 상단의 `Run | Debug` 링크를 통해 실행

---

## 전체 커리큘럼 및 모듈 구성 (Curriculum & Modules)

| 챕터 | 모듈명 | 레슨 수 | 주요 학습 내용 | 문서 링크 |
|:---|:---|:---:|:---|:---:|
| **Chapter 00. 개발자가 되어보자** | `chapter-00-intro` | 7편 | 컴퓨터 동작 원리, 컴파일과 실행, JDK와 JVM 구조 | [README](chapter-00-intro/README.md) |
| **Chapter 01. Java와 친해지기** | `chapter-01-basics` | 7편 | 클래스 구조, main 메서드, 표준 입출력, 주석 작성법 | [README](chapter-01-basics/README.md) |
| **Chapter 02. 변수** | `chapter-02-variables` | 10편 | 기본형과 참조형, 메모리 구조, 형변환, 상수(final) | [README](chapter-02-variables/README.md) |
| **Chapter 03. 연산자** | `chapter-03-operators` | 9편 | 산술, 비교, 논리, 삼항 연산자 및 연산 우선순위 | [README](chapter-03-operators/README.md) |
| **Chapter 04. 조건문** | `chapter-04-conditionals` | 9편 | if, else, 중첩 조건문, switch 문 및 switch 표현식 | [README](chapter-04-conditionals/README.md) |
| **Chapter 05. 반복문** | `chapter-05-loops` | 10편 | for, while, do-while, break, continue, 중첩 반복문 | [README](chapter-05-loops/README.md) |
| **Chapter 06. 배열** | `chapter-06-arrays` | 9편 | 1차원/2차원 배열, 향상된 for문, Arrays 유틸리티 | [README](chapter-06-arrays/README.md) |
| **Chapter 07. 메서드** | `chapter-07-methods` | 9편 | 메서드 선언과 호출, 매개변수, 반환값, 메서드 오버로딩 | [README](chapter-07-methods/README.md) |
| **Chapter 08. 클래스와 객체** | `chapter-08-classes-objects` | 10편 | 객체지향 개념, 생성자, this 키워드, 접근 제어자 | [README](chapter-08-classes-objects/README.md) |
| **Chapter 09. 객체지향 프로그래밍** | `chapter-09-oop` | 11편 | 상속, 메서드 재정의(Override), 다형성, 추상 클래스, 인터페이스 | [README](chapter-09-oop/README.md) |
| **Chapter 10. Collection** | `chapter-10-collections` | 10편 | List, ArrayList, Set, HashSet, Map, HashMap | [README](chapter-10-collections/README.md) |
| **Chapter 11. 문자열** | `chapter-11-strings` | 9편 | String 불변성, equals 비교, 주요 메서드, StringBuilder | [README](chapter-11-strings/README.md) |
| **Chapter 12. 예외와 오류** | `chapter-12-exceptions` | 10편 | 오류 유형, try-catch-finally, throw, Stack Trace 분석 | [README](chapter-12-exceptions/README.md) |
| **Chapter 13. 파일 처리** | `chapter-13-file-io` | 8편 | java.nio.file Path와 Files, 텍스트 입출력, CSV, JSON | [README](chapter-13-file-io/README.md) |
| **Chapter 14. Modern Java** | `chapter-14-modern-java` | 8편 | var, Record, 람다 표현식, Stream API, Optional | [README](chapter-14-modern-java/README.md) |
| **Chapter 15. IntelliJ IDEA** | `chapter-15-intellij` | 9편 | 프로젝트 생성, 단축키 활용, 디버깅(Breakpoint), 코드 리팩토링 | [README](chapter-15-intellij/README.md) |
| **Chapter 16. Git / GitHub** | `chapter-16-git-github` | 9편 | 버전 관리 시스템 원리, commit, push, pull, 브랜치 전략 | [README](chapter-16-git-github/README.md) |
| **Chapter 17. Gradle** | `chapter-17-gradle` | 8편 | 의존성 관리(Dependency), build.gradle 구성, 빌드 및 단위 테스트 | [README](chapter-17-gradle/README.md) |
| **Chapter 18. AI에게 질문하기** | `chapter-18-ai-prompts` | 6편 | 효과적인 프롬프트 작성 요령, 오류 메시지 기반 질의법 | [README](chapter-18-ai-prompts/README.md) |
| **Chapter 19. AI 코드 검증** | `chapter-19-ai-verification` | 6편 | AI 생성 코드 검증, 엣지 케이스 점검, 단위 테스트 작성 | [README](chapter-19-ai-verification/README.md) |
| **Chapter 20. AI Pair Programming** | `chapter-20-ai-pair-programming` | 7편 | AI 협업 프로그래밍, 단계별 구현 및 리팩토링 검증 | [README](chapter-20-ai-pair-programming/README.md) |
| **Final Project. Java Adventure** | `final-project-adventure` | 10편 | 객체지향 설계를 총망라한 콘솔 텍스트 RPG 완성형 프로젝트 | [README](final-project-adventure/README.md) |

---

## Final Project: Java Adventure

`final-project-adventure` 모듈은 본 학습 과정의 완결 프로젝트입니다. 객체지향 5대 설계 원칙, 상속, 다형성, 자료구조(Collection), 예외 처리를 적용하여 개발된 텍스트 RPG 게임입니다.

- 플레이어 캐릭터 생성, 전투 및 레벨업 시스템
- 몬스터(Zombie, Skeleton, Boss) 추상화 및 턴제 전투 로직
- 인벤토리 시스템 및 소모성 아이템(회복 포션) 사용
- 클린 코드 원칙에 입각한 클래스 분리 및 리팩토링

---

## 문제 해결 (Troubleshooting)

### Q. `./gradlew` 실행 시 권한 오류(Permission Denied)가 발생합니다.
실행 권한이 누락된 경우입니다. 터미널에서 아래 명령어로 실행 권한을 부여하십시오:
```bash
chmod +x gradlew
```

### Q. `UnsupportedClassVersionError` 오류가 발생합니다.
설치된 Java Runtime 버전이 프로젝트 요구 사양보다 낮을 때 발생합니다. `java -version`을 확인하고 OpenJDK 21 이상을 설치한 후 `JAVA_HOME` 환경변수를 설정하십시오.

### Q. Gradle Daemon 관련 연결/소켓 오류가 발생합니다.
백그라운드 데몬 프로세스 충돌일 수 있습니다. `--no-daemon` 플래그를 붙여 단독 프로세스로 실행하십시오:
```bash
./gradlew --no-daemon compileJava
```

---

## 관련 링크 (References)

- **공식 온라인 커리큘럼**: [jqdom.com Java Learning](https://jqdom.com/blog?categoryId=9)
- **저장소 이슈 등록**: [GitHub Issues](https://github.com/devguna81/java-learning/issues)

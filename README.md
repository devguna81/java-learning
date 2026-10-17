# ☕ Java Learning - 단계별 Java 학습 공식 예제 코드

[jqdom.com](https://jqdom.com/blog?categoryId=9)의 **Java Learning** 시리즈(총 22개 챕터, 191개 레슨) 공식 예제 코드 및 실습 프로젝트 저장소입니다.

초보자를 위한 프로그래밍 기초부터 객체지향 프로그래밍(OOP), 모던 자바(Modern Java), IntelliJ/Git/Gradle 실무 도구, AI 페어 프로그래밍, 그리고 최종 텍스트 RPG 프로젝트(Java Adventure)까지 단계별로 직접 실행하며 학습할 수 있도록 구성되어 있습니다.

---

## 🛠️ 요구 사항 (Prerequisites)

- **Java**: OpenJDK 21 이상 권장 (Java 21 LTS)
  - 버전 확인: `java -version` 및 `javac -version`
  - 권장 JDK: Eclipse Temurin 21, Amazon Corretto 21, 또는 Oracle OpenJDK 21
- **Build Tool**: Gradle 8.5 (저장소에 Gradle Wrapper가 포함되어 있어 별도 설치 불필요)
- **OS**: Linux, macOS, Windows 모두 완벽 지원

---

## 📥 프로젝트 체크아웃 및 최신 코드 동기화 (Checkout & Sync)

### 1. 최초 저장소 복제 (Git Clone)

터미널(또는 명령 프롬프트 / PowerShell)을 열고 아래 명령어를 입력하여 로컬 컴퓨터에 저장소를 복제합니다:

```bash
# HTTPS 방식 복제
git clone https://github.com/devguna81/java-learning.git

# 프로젝트 폴더로 이동
cd java-learning
```

### 2. 최신 변경사항 가져오기 (Git Pull)

블로그 게시글의 예제 코드나 실습 프로젝트에 새로운 업데이트가 반영되었을 때, 아래 명령어로 최신 코드를 내려받습니다:

```bash
# 원격 저장소의 main 브랜치 최신 커밋 반영
git pull origin main

# 로컬에 수정한 코드가 있어 충돌이 우려되는 경우 임시 저장 후 pull
git stash
git pull origin main
git stash pop
```

---

## 🚀 프로젝트 빌드 및 실행 가이드 (Build & Run)

본 프로젝트는 22개의 서브 프로젝트로 구성된 **Gradle 멀티 프로젝트(Multi-project)** 구조입니다.

### 1. Gradle Wrapper 실행 권한 부여 (Linux / macOS 전용)

처음 클론받은 후 `gradlew` 스크립트에 실행 권한을 부여합니다:

```bash
chmod +x gradlew
```

> **Windows 사용자 참고:** Windows 환경에서는 `gradlew` 대신 `gradlew.bat`을 실행하거나 PowerShell에서 `.\gradlew`를 입력하시면 됩니다.

---

### 2. 전체 프로젝트 빌드 및 컴파일 (Full Build)

저장소 루트 디렉토리에서 전체 22개 모듈(310개 이상의 예제 및 미션 소스 코드)을 한 번에 컴파일하고 테스트를 수행합니다:

```bash
# 전체 모듈 Java 컴파일 검증
./gradlew compileJava

# 전체 빌드 및 테스트 실행
./gradlew build

# 이전 빌드 산출물을 삭제하고 완전히 새로 빌드할 때
./gradlew clean build
```

---

### 3. 특정 챕터 모듈별 빌드 (Targeted Build)

관심 있는 특정 챕터만 선택하여 빠르게 컴파일할 수 있습니다:

```bash
# 예: Chapter 01 (자바 기초) 모듈만 컴파일
./gradlew :chapter-01-basics:compileJava

# 예: Chapter 08 (클래스와 객체) 모듈만 컴파일
./gradlew :chapter-08-classes-objects:compileJava

# 예: Chapter 14 (Modern Java) 모듈만 컴파일
./gradlew :chapter-14-modern-java:compileJava
```

---

### 4. 🎮 Final Project: Java Adventure 텍스트 RPG 실행

본 커리큘럼의 총결산인 콘솔 텍스트 RPG 게임을 직접 실행해볼 수 있습니다!

#### 방법 A. 터미널에서 javac / java 명령어로 직접 실행

```bash
# 1. Final Project 디렉토리로 이동
cd final-project-adventure/src/main/java

# 2. 게임 패키지 전체 컴파일
javac -encoding UTF-8 com/learning/adventure/game/*.java

# 3. 게임 실행!
java com.learning.adventure.game.AdventureGame

# 4. 실습 완료 후 프로젝트 루트로 복귀
cd ../../../../
```

---

## 💻 IDE(통합 개발 환경)에서 열기 및 디버깅

### IntelliJ IDEA
1. IntelliJ IDEA 실행 후 **[Open]** 클릭
2. `java-learning` 폴더를 선택하고 열기
3. 화면 우측 하단에서 `Import Gradle Project`가 나타나면 **[Trust Project]** 및 동기화 진행
4. `File > Project Structure > Project SDK`가 **Java 21**로 설정되어 있는지 확인
5. 탐색기에서 원하는 레슨(예: `com.learning.chapter08.lesson01.example.Main.java`)을 열고 `main` 메서드 옆의 초록색 **[▶ Run]** 버튼을 클릭하면 즉시 실행됩니다.

### Visual Studio Code
1. VS Code에서 `Extension Pack for Java` 확장 설치
2. `File > Open Folder...`로 `java-learning` 폴더 열기
3. Java Language Server가 프로젝트를 감지하고 빌드를 완료하면, 각 `Main.java` 상단에 표시되는 `Run | Debug` 링크를 클릭하여 실행

---

## 📖 전체 커리큘럼 및 챕터별 바로가기

| 챕터 | 모듈명 | 레슨 수 | 주제 요약 | 바로가기 |
|:---|:---|:---:|:---|:---:|
| **Chapter 00. 개발자가 되어보자** | `chapter-00-intro` | 7편 | 컴퓨터 동작 원리, 컴파일과 실행, JDK/JVM 구조 | [README](chapter-00-intro/README.md) |
| **Chapter 01. Java와 친해지기** | `chapter-01-basics` | 7편 | 클래스 구조, main 메서드, 콘솔 출력, 주석 | [README](chapter-01-basics/README.md) |
| **Chapter 02. 변수** | `chapter-02-variables` | 10편 | 기본형과 참조형, 메모리 구조, 형변환, 상수(final) | [README](chapter-02-variables/README.md) |
| **Chapter 03. 연산자** | `chapter-03-operators` | 9편 | 산술, 비교, 논리 연산자, 삼항 연산자, 우선순위 | [README](chapter-03-operators/README.md) |
| **Chapter 04. 조건문** | `chapter-04-conditionals` | 9편 | if, else, 중첩 조건문, switch-case | [README](chapter-04-conditionals/README.md) |
| **Chapter 05. 반복문** | `chapter-05-loops` | 10편 | for, while, do-while, break, continue, 중첩 반복문 | [README](chapter-05-loops/README.md) |
| **Chapter 06. 배열** | `chapter-06-arrays` | 9편 | 1차원/2차원 배열, 향상된 for문, 동적 배열의 기초 | [README](chapter-06-arrays/README.md) |
| **Chapter 07. 메서드** | `chapter-07-methods` | 9편 | 메서드 정의와 호출, 매개변수와 반환값, 오버로딩 | [README](chapter-07-methods/README.md) |
| **Chapter 08. 클래스와 객체** | `chapter-08-classes-objects` | 10편 | 객체지향 개념, 생성자, this 키워드, 접근 제어자 | [README](chapter-08-classes-objects/README.md) |
| **Chapter 09. 객체지향 프로그래밍** | `chapter-09-oop` | 11편 | 상속(Inheritance), 다형성(Polymorphism), 추상 클래스, 인터페이스 | [README](chapter-09-oop/README.md) |
| **Chapter 10. Collection** | `chapter-10-collections` | 10편 | List, ArrayList, Set, HashSet, Map, HashMap | [README](chapter-10-collections/README.md) |
| **Chapter 11. 문자열** | `chapter-11-strings` | 9편 | String 불변성, equals 비교, 문자열 메서드, StringBuilder | [README](chapter-11-strings/README.md) |
| **Chapter 12. 예외와 오류** | `chapter-12-exceptions` | 10편 | 컴파일/런타임 오류, try-catch-finally, throw/throws, StackTrace | [README](chapter-12-exceptions/README.md) |
| **Chapter 13. 파일 처리** | `chapter-13-file-io` | 8편 | java.nio.file Path/Files, 파일 읽기/쓰기, CSV, JSON | [README](chapter-13-file-io/README.md) |
| **Chapter 14. Modern Java** | `chapter-14-modern-java` | 8편 | var, Record, 람다식(Lambda), 스트림(Stream), Optional | [README](chapter-14-modern-java/README.md) |
| **Chapter 15. IntelliJ IDEA** | `chapter-15-intellij` | 9편 | 프로젝트 생성, 단축키, 디버깅(Breakpoint), 리팩토링 | [README](chapter-15-intellij/README.md) |
| **Chapter 16. Git / GitHub** | `chapter-16-git-github` | 9편 | 버전 관리 원리, commit/push/pull, branch와 머지 | [README](chapter-16-git-github/README.md) |
| **Chapter 17. Gradle** | `chapter-17-gradle` | 8편 | 의존성 관리(Dependency), build.gradle 구성, JUnit 테스트 | [README](chapter-17-gradle/README.md) |
| **Chapter 18. AI에게 질문하기** | `chapter-18-ai-prompts` | 6편 | 효과적인 프롬프트 작성법, 에러 메시지 질문 요령 | [README](chapter-18-ai-prompts/README.md) |
| **Chapter 19. AI 코드 검증** | `chapter-19-ai-verification` | 6편 | AI 생성 코드 검증, 엣지 케이스 점검, 단위 테스트 작성 | [README](chapter-19-ai-verification/README.md) |
| **Chapter 20. AI Pair Programming** | `chapter-20-ai-pair-programming` | 7편 | AI와 함께하는 페어 프로그래밍, 점진적 구현 및 리팩토링 | [README](chapter-20-ai-pair-programming/README.md) |
| **Final Project. Java Adventure** | `final-project-adventure` | 10편 | 객체지향 5대 원칙을 적용한 콘솔 텍스트 RPG 완성형 프로젝트 | [README](final-project-adventure/README.md) |

---

## ❓ 자주 묻는 질문 및 문제 해결 (FAQ & Troubleshooting)

### Q. `./gradlew` 실행 시 Permission Denied 오류가 발생합니다.
> 실행 권한이 누락된 경우입니다. 터미널에서 `chmod +x gradlew` 명령을 실행해 권한을 부여하세요.

### Q. `UnsupportedClassVersionError`가 발생합니다.
> 현재 컴퓨터에 설정된 Java Runtime 버전이 낮기 때문입니다. `java -version`을 확인하고 OpenJDK 21 이상을 설치한 후 `JAVA_HOME` 경로를 업데이트해주세요.

### Q. Gradle Daemon 관련 소켓/연결 오류가 발생합니다.
> 백그라운드 데몬 프로세스 충돌일 수 있습니다. `./gradlew --no-daemon compileJava` 옵션으로 실행하면 단독 프로세스로 안정적으로 빌드됩니다.

---

## 🔗 관련 링크 및 커뮤니티

- 🌐 **공식 온라인 강좌 커리큘럼**: [jqdom.com Java Learning 전체 보기](https://jqdom.com/blog?categoryId=9)
- 📝 블로그 본문에서 각 레슨별 인터랙티브 퀴즈, 시각화 다이어그램, 상세 해설을 함께 확인하실 수 있습니다.
- 💡 **저장소 문제 보고**: [GitHub Issues](https://github.com/devguna81/java-learning/issues)

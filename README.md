# Lion 클래스 과제

작성자: 김민수 (su)

## 미션 소개

아기사자 한 명의 이름, 전공, 기수를 `Lion` 객체로 표현하는 Java 콘솔 프로그램입니다.
이번 과제는 객체가 데이터를 직접 책임지는 구조와 `main` 메서드가 실행 흐름만 담당하는 구조를 비교하기 위해 작성했습니다.

## 프로젝트 구조

```text
src
└─ class2
   ├─ package1
   │  ├─ Lion.java
   │  ├─ Step1.java
   │  ├─ Step2.java
   │  └─ Step3SamePackage.java
   └─ package2
      └─ Step3OtherPackage.java
```

## 컴파일

```bash
javac -d out src/class2/package1/*.java src/class2/package2/*.java
```

## 실행 방법

```bash
java -cp out class2.package1.Step1
java -cp out class2.package1.Step2
java -cp out class2.package1.Step3SamePackage
java -cp out class2.package2.Step3OtherPackage
```

## Step 1: main에서 유효성 검증

`Step1`은 사용자 입력을 모두 받은 뒤 `main` 메서드에서 이름, 전공, 기수를 검증합니다.
검증에 실패하면 `Lion` 객체를 생성하지 않고 오류 메시지를 출력합니다.
검증에 성공한 경우에만 `Lion` 객체를 생성하고 정보를 출력합니다.

## Step 2: Lion 클래스에서 유효성 검증

`Step2`는 입력값과 관계없이 먼저 `Lion` 객체를 생성합니다.
그 후 `Lion` 클래스의 `validateState()` 메서드가 객체 내부 상태를 검증합니다.
이 단계에서는 유효성 검증 책임이 `main`에서 `Lion` 클래스로 이동합니다.

## Step 3: 접근 제어자 확인

`Lion` 클래스의 필드는 서로 다른 접근 제어자를 사용합니다.

| 필드 | 접근 제어자 | 같은 패키지 | 다른 패키지 |
| --- | --- | --- | --- |
| `name` | `public` | 접근 가능 | 접근 가능 |
| `major` | default | 접근 가능 | 접근 불가 |
| `generation` | `private` | 접근 불가 | 접근 불가 |

전체 프로젝트가 정상 컴파일되도록 접근 불가 코드는 주석으로 남겼습니다.
주석을 해제하면 다음과 같은 컴파일 오류를 확인할 수 있습니다.

```text
major is not public in class2.package1.Lion; cannot be accessed from outside package
generation has private access in class2.package1.Lion
```

## 역할 분리

`main` 메서드는 사용자 입력, 프로그램 흐름 제어, 객체 생성과 메서드 호출을 담당합니다.
`Lion` 클래스는 아기사자 정보 관리와 객체 상태 유효성 판단을 담당합니다.

# Java

## 자바란?

자바는 표준 스펙과 구현으로 나눌 수 있다.

### 자바 표준 스펙
- 자바는 이렇게 만들어야 한다는 설계도이며, 문서이다.
- 이 표준 스펙을 기반으로 여러 회사에서 실제 작동하는 자바를 만든다.
- 자바 표준 스펙은 자바 커뮤니티 프로세스(JCP)를 통해 관리된다.
- 자바 구현들은 모두 표준 스펙에 맞도록 개발되어 있다. 따라서 오라클 Open JDK를 사용하다가 Amazon Corretto 자바로 변경해도 대부분 문제 없이 동작한다.

### 컴파일과 실행
- 자바 프로그램은 컴파일과 실행 단계를 거친다.
- Hello.java 와 같은 자바 소스 코드를 개발자가 작성한다.
    - 자바 컴파일러를 사용해서 소스 코드를 컴파일 한다.
    - 자바가 제공하는 `javac` 라는 프로그램을 사용한다.
    - `.java` `.class` 파일이 생성된다.
    - 자바 소스 코드를 바이트코드로 변환하며 자바 가상 머신에서 더 빠르게 실행될 수 있게 최적화하고 문법 오류도 검출한다.
- 자바 프로그램을 실행한다.
    - 자바가 제공하는 `java` 라는 프로그램을 사용한다.
    - 자바 가상 머신(JVM)이 실행되면서 프로그램이 작동한다.

## 메서드(method)

자바에서는 함수를 메서드(Method)라 한다. 메서드도 함수의 한 종류다.

### 메서드 정의
메서드는 크게 메서드 선언, 메서드 본문으로 구성된다.

- 메서드 선언: `public static int add(int a, int b)` / 메서드의 선언 부분으로 메서드 이름, 반환 타입, 매개변수 목록을 포함
    - `public static`
        - `public`: 다른 클래스에서 호출할 수 있는 메서드라는 뜻이다. 접근 제어에서 학습한다.
        - `static`: 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻이다. 자세한 내용은 뒤에서 다룬다.
    - `int add(int a, int b)`
        - `int`: 반환 타입을 정의한다. 메서드의 실행 결과를 반환할 때 사용할 반환 타입을 지정한다.
        - `add`: 메서드에 이름을 부여한다. 이 이름으로 메서드를 호출할 수 있다.
    - `(int a, int b)`: 메서드를 호출할 때 전달하는 입력 값을 정의한다. 이 변수들은 해당 메서드 안에서만 사용된다. 이렇게 메서드 선언에 사용되는 변수를 영어로 파라미터(parameter), 한글로 매개변수라 한다.
- 메서드 본문: 메서드가 수행하는 본문
- 메서드 호출 && 용어정리
    - 인수(Argument): “인” “수” ‘들어가는 수’ 의미를 가진다. 메서드 내부로 들어가는 값을 의미
    - 매개변수 (Parameter): “매개”와 “변수”의 합성어 ‘중간에서 전달하는 변수’

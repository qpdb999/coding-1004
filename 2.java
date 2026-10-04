/*
# Java void, static, this., charAt() 활용 복습

오늘 배운 내용

오늘은 이전에 학습했던 Java의
void, static, this., charAt()을
실제 코드에서 어떻게 활용하는지 복습했다.

각 문법을 따로 사용하는 것이 아니라
하나의 프로그램 안에서 여러 문법을
함께 사용하며 활용 방법을 확인했다.

void 활용

void는 값을 반환하지 않는 메서드를 만들 때 사용한다.

객체의 정보를 출력하거나 특정 동작을
실행시키는 기능을 만들 때 활용할 수 있다.

예시:

class Student {
    String name;

    void showName() {
        System.out.println("이름: " + name);
    }
}

static 활용

static은 객체를 생성하지 않고
클래스 이름을 통해 바로 사용할 수 있는
메서드나 변수를 만들 때 활용한다.

모든 객체에서 공통적으로 사용하는 기능을
만들 때 사용할 수 있다.

예시:

class Student {
    static void schoolInfo() {
        System.out.println("소프트웨어 개발과");
    }
}

Student.schoolInfo();

this. 활용

this.는 현재 객체의 필드나 메서드를
가리킬 때 활용한다.

특히 필드 이름과 매개변수 이름이 같을 때
현재 객체의 필드를 구분하기 위해 사용한다.

예시:

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

여기서 this.name은 현재 객체의 필드이고,
오른쪽 name은 생성자의 매개변수이다.

charAt() 활용

charAt()은 문자열에서 원하는 위치의
문자 하나를 가져올 때 활용한다.

인덱스는 0부터 시작한다.

예시:

String name = "Java";

System.out.println(name.charAt(0)); // J
System.out.println(name.charAt(2)); // v

문자열의 특정 위치에 있는 문자를
확인해야 할 때 사용할 수 있다.

여러 문법 함께 활용하기

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("첫 번째 문자: " + this.name.charAt(0));
    }

    static void schoolInfo() {
        System.out.println("소프트웨어 개발과");
    }
}

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Java");

        student.showInfo();

        Student.schoolInfo();
    }
}

이 코드에서는

this. → 현재 객체의 name 사용
void → 학생 정보를 출력하는 메서드
charAt() → 이름의 첫 번째 문자 확인
static → 객체 없이 학교 정보를 출력

처럼 각각의 문법을 실제 기능에 활용했다.

복습하면서 알게 된 점

이번 복습을 통해 각각의 문법을
따로 외우는 것보다 실제 코드에서
어떤 상황에 사용하는지를 이해하는 것이
중요하다는 것을 알게 되었다.

특히 this.는 객체의 필드를 명확하게
구분할 때 사용할 수 있었고,
void와 static은 메서드의 사용 방식에
따라 다르게 활용할 수 있다는 것을
다시 확인했다.

📌 AI 활용 복습 문제

1. void 메서드의 특징은?

1. 값을 반환한다
2. 객체를 생성한다
3. 값을 반환하지 않는다
4. 문자열만 반환한다

정답: 3


2. static 메서드를 호출하는 방법으로 알맞은 것은?

1. new.Student()
2. Student.schoolInfo()
3. student.static()
4. static.Student()

정답: 2


3. this.name에서 this.가 의미하는 것은?

1. 새로운 객체
2. 현재 객체
3. 부모 클래스
4. 클래스 이름

정답: 2


4. 다음 코드의 출력 결과는?

String text = "Java";
System.out.println(text.charAt(1));

1. J
2. a
3. v
4. Java

정답: 2


5. charAt()의 인덱스는 몇부터 시작하는가?

1. 0
2. 1
3. -1
4. 2

정답: 1


6. 다음 코드에서 this.name의 역할은?

Student(String name) {
    this.name = name;
}

1. 새로운 객체 생성
2. 현재 객체의 name 필드 지정
3. name 메서드 호출
4. 문자열 출력

정답: 2


7. 다음 중 static 메서드의 올바른 호출 방법은?

class Test {
    static void hello() {
        System.out.println("Hello");
    }
}

1. Test.hello()
2. new.hello()
3. Test->hello()
4. static.hello()

정답: 1


8. 다음 코드에서 charAt(2)의 결과는?

String text = "Hello";

System.out.println(text.charAt(2));

1. H
2. e
3. l
4. o

정답: 3
*/
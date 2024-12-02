# Java Intermidiate 1

## Java.lang 패키지
- 자바를 이루는 가장 기본이 되는 클래스 패키지
- Obejct, String, Integer/Long/Double, Class(클래스의 메타 정보), System(시스템과 관련된 기본 기능들, 그 유명한 System.out.println)
- import 생략

## Obejct
- 모든 객체의 최상위 부모 
- 내가 아무 것도 상속받지 않는다면 묵시적으로 Object 클래스를 상속받는다 <-> 하지만 명시적으로 상속을 받으면 Obejct를 상속받지 않음
- toString() : Obejct 클래스의 메소드, 객체의 정보 제공
- 왜 Object가 최상위 부모일까?
  - 공통 기능 제공 : Object가 최상위 부모라 모든 객체가 공통 기능(클래스 정보, 객체 정보, 같음 등을 비교하는 메소드들)을 제공함 -> 단순화, 일관성
- 다형성 측면
  - if(obj instanceof Dog dog) => 현재 obj는 Object타입으로 Dog의 인스턴스를 참조중이다. 따라서 참이므로 obj는 원래 Object형으로 인스턴스를 참조했기 때문에 자식인 Dog 타입으로 인스턴스를 바라볼 수 있도록 다운 캐스팅을 해줘서 dog 변수에 넣어준다
 
## toString()
- Object 클래스의 메소드, 객체의 정보를 문자열 형태로 제공 
- 형태 : 인스턴스를 만들어낸 클래스 정보 @ 객체의 참조값
- 오버라이딩 가능
- System.out.println 내부에 Object를 파라미터 값으로 설정해 다형적 참조 + 내부에서 toString()을 사용함
  - 객체 이름만으로 println을 하면, toString()이 호출된다 

## equals()
- 동등성? 동일성?
  - 동일성(Identity) : 같은 객체를 가르키고 있는지(100% 똑같음) = 참조값이 같은지 
  - 동등성(Equality) : 두 객체가 논리적으로 동등한지(완전히 같지는 않지만 비슷할지도..?)
- 동등성은 클래스마다 개념이 다르다 -> equals()를 오버라이딩 해야함. 하지 않으면 동일성을 기본으로 함


## 불변 객체(Immutable Object) 
- 객체의 상태(내부 필드값)이 변하지 않는 객체
- 생성자를 통해 초기화된 값이 바뀌지 않는 것


## String
- 참조형
- 동일성(같은 객체를 참조하고 있는가?)이 아닌 동등성(두 객체가 논리적으로 같은지) => equals가 이미 오버라이딩 되어 있어서 문자열 자체가 같은지 비교
- 문자열 인스턴스, 리터럴 방식, 총 2가지로 문자열을 만들 수 있음
  - 리터럴 방식의 경우, 문자열 풀을 만들어서 클래스 로딩 때 문자열을 넣음. 같은 것이 나오면 더 이상 풀에 넣지 않는다
  - 프로그램 실행 시점에서 문자열 풀에서 참조값을 찾아서 넣어줌
- 문자열에 대한 비교는 항상 equals로 해줘야 한다(문자열 인스턴스 -> == 비교할 때 false, 리터럴 방식 -> == 비교 true)
- 불변객체 -> 생성 이후 절대로 내부의 값을 변경할 수 없음 (스트링 풀에서 값이 바뀌면 참조하는 다른 문자열 객체도 값이 바뀌어 버리는 사이드 이펙트가 발생함)
- 주요 메소드
  - isBlank() : 공백이거나 비워져있거나
  - equalsIgnoreCase() : 대소문자 상관없이 같은지 비교하기
  - compareTo : 사전순으로 얼마나 떨어져 있는가?
  - trim : 단순 띄어쓰기만 제거
  - strip: 띄어쓰기 + 유니코드 공백 제거

## StringBuilder
- 가변 String
- toString() : StringBuilder -> String으로 바꿀 수 있음

## Method chaining
- 메서드가 **자기 자신의 참조값(this)를 반환**해서 가능함
- 메서드가 끝나는 시점에 바로 .을 찍어서 변수명을 생략할 수 있다
- StringBuilder의 대부분의 메서드들이 자기 자신을 반환함 -> 메서드 체이닝 기법 사용 가능


## Wrapper 클래스
- 정의 : 특정 기본형을 감싸서 만든 클래스 -> 기본형의 객체 버전 
- 기본형의 한계
  - 객체의 장점을 살릴 수 없음 : 유용한 메서드 제공 불가 
  - **null을 넣을 수 없음** : 데이터가 '없음' 상태 제공 불가
    - null : 참조하는 값이 없을 때
- 자바는 기본형에 대응하는 래퍼 클래스를 제공함
  - int -> Integer, long -> Long 등...
- 래퍼 클래스의 특징
  - 불변
  - equals로 비교해야 함 : 객체이기 때문에, == 하면 참조값이 같은지를 본다
- 래퍼 클래스 사용방법
  - new 래퍼클래스 -> deprecated 예정
  - 값 생성 : xxx.valueOf()를 사용 권장
    - 하지만 내부에 new 래퍼클래스를 사용
    - valueOf는 미리 Java에서 자주 사용하는 숫자 값 객체를 만들어서 재사용함 -> 캐싱으로 성능 최적화
      - == 비교시, 동일한 값이면 참조값도 같음 
  - 값 읽기 : xxxValue() (ex: integerObj.intValue()) -> **기본형을 꺼내준다** 
- Boxing& Unboxing
  - Boxing(박싱) : 기본형 -> 래퍼 클래스로 변경
    - ex) new Integer, Integer.valueOf() 
  - Unboxing(언박싱) : 래퍼 클래스 내의 기본형 value를 꺼내는 것
    - ex) intValue(), longValue()
- auto boxing & Auto unboxing
  - 컴파일러가 개발자 대신에 valueOf, xxxValue() 코드를 추가해주는 기능
- 그럼 기본형을 왜 계속 사용하는 거지?
  - 래퍼 클래스는 기본형보다 메모리를 더 많이 소모함(래퍼는 클래스라 안에 메서드, 필드 등등이 존재)

## Class 클래스
- 클래스의 메타 데이터(클래스의 정보)를 다루는 클래스 

## enum(enumeration)
- 사용이유
  - String을 사용하면 타입 안정성 부족 문제 -> 컴파일로 오류 감지 불가
  - final String(문자열 상수) : 그래도 메소드의 파라미터에 String으로 받을 수 있게 해놓았으므로 소용 없음
- 정의 : 타입 안전 열거형. 일련의 명명된 상수들의 집합 
- 특징
  - 외부에서 enum 클래스의 인스턴스 생성 불가능
  - 상수들로만 구성 -> 오타 오류 불가능 -> 타입 안정성 향상
    - **나열된 상수들만이 enum 타입의 인스턴스들의 참조값을 갖고 있음**
    - 그리고 그 상수들은 static final 타입들이다  
  - 새로운 상수 추가 간편
  - static final 이라서 import static 가능
  - enum도 당연히 클래스 -> 메소드, 생성자, 변수 선언등 다 가능함
- 주요 메서드
  - values() : 열거형의 모든 상수를 배열로 꺼내줌
  - name() : 상수 이름을 문자열로 

## 시간과 날짜 -> 다음에 다시 해야 함 
- 모든 날짜 클래스는 불변이다(String, Wrapper 등) -> 새로운 객체를 반환하므로 반환값을 받아야 함
1. 특정 시점의 시간(시각)
- LocalDateTime
  - Local이 붙는 이유 : 1) 국내에서만 제공되는 서비스를 고려할 떄 2) 생일
  - now() : 현재 날짜, 시간 등을 출력 / of() : 날짜, 시간 등을 지정함 / plusXXXX : 날짜 더하기
  - isEqual() : 타임존이 달라도 시간적으로 같으면 true <-> equals() : 타임존 등 모든 구성요소가 같아야 함
- ZonedDateTime
  - 일광 절약 시간제(ZoneId) + UTC로부터 차이
- OffsetDateTime
  - UTC차이만 존재
- Instant
  - 조금 특별한 시간, 기계 중
  - 에포크 시간(1970.01.01.0초부터)으로부터 흐른 시간을 초 단위로 저
  - 전 세계의 모든 서버 시간을 똑같이 맞출 수 있음
2. 시간의 간격(기간)
- Period
  - 시간의 간격을 '년, 월, 일' 단위로 나타냄
- Duration
  - 시간의 간격을 '시, 분, 초' 단위로 나타냄


## 중첩 클래스
- 정의 : 클래스 안에 클래스가 있는 것
- 종류 : non-static VS static
  - 내부 클래스 종류(non-static) : 내부 클래스, 지역 클래스, 익명 클래스(지역 클래스와 비슷한 것) 
  - 정적 중첩 클래스(static) : 정적 중첩 클래스 
- 선언 위치
  - 정적 중첩 클래스 : 정적 변수와 같은 위치
  - 내부 클래스 : 인스턴스 변수와 같은 위치
  - 지역 클래스 : 지역 변수와 같은 위치
- 중첩 VS 내부
  - 중첩 : 내부에 어떤 **다른 것**이 포함된 구조(나의 안에 있지만 내 것이 아니다)
  - 내부 : 나의 내부에서 **나를 구성**하는 요소임(나의 내부에서 나를 구성하는 요소) 
  => 따라서, 정적 중첩 클래스는 바깥 클래스와 관계 없는 다른 클래스, 내부 클래스는 바깥 클래스와 긴밀히 연결되어 있는 바깥 클래스의 요소임

## 정적 중첩 클래스 
- 그냥 서로 다른 클래스를 중첩해 둔 것일 뿐! 바깥 클래스와 중첩 클래스는 아무런 관계가 없다 = 그저 다른 클래스 2개일 뿐
- 하지만, 유일한 특징은 바깥 클래스의 private static 변수에 접근할 수 있다
  - 바깥 클래스의 인스턴스 변수에 접근할 수 없는 이유 : 인스턴스가 생성이 되지 않아서 참조값을 모르는데 어떡해
- 언제 사용되는지?
  - 패키지의 번거로운 클래스들(한번만 사용되는 클래스들), 하나의 클래스 안에서만 사용되는 클래스들을 정리할 수 있음
  - 정적 중첩 클래스는 자신이 소속된 바깥 클래스 안에서만 사용되는 것
  - 만약 정적 중첩 클래스가 바깥 클래스 이외에도 다른 클래스에서도 사용된다면 이는 중첩 클래스가 아니라 밖으로 빼내야 한다


## 내부 클래스
- 바깥 클래스의 인스턴스를 이루는 요소가 된다 = **내부 클래스는 바깥 클래스의 인스턴스 소속이자 멤버임(마치 인스턴스 변수처럼)**
- 따라서 바깥 클래스의 인스턴스 변수, 클래스 변수 모두 접근 가능하다
- 생성할 때 type은 바깥 클래스.내부 클래스명 = new 바깥 클래스의 인스턴스.new 내부 클래스(); -> 마치 인스턴스 변수처럼 접근하는 모양새 
  - 내부 클래스는 바깥 클래스의 인스턴스에 소속되기 때문에 **바깥 클래스의 인스턴스 정보**를 알아야 생성할 수 있다(마치 인스턴스 변수처럼) 
- 개념 상 바깥 클래스의 인스턴스 내부에 내부 클래스의 인스턴스가 생성된다
  - 실제로는 따로 생성이 되지만 내부 클래스의 인스턴스가 바깥 클래스의 인스턴스의 참조값을 보관하고 있음
  - 바깥 클래스 내부에 내부 클래스의 인스턴스를 생성하면 바깥 클래스의 이름을 생략할 수 있음 + 내부 클래스가 바깥 클래스의 인스턴스를 자동으로 참조하게 됨
- 중첩 클래스를 사용하는 이유
  - 논리적 그룹화 : 다른 곳에서 사용될 필요가 없이 하나의 클래스 안에서만 사용되는 클래스의 경우에는 중첩 클래스를 굳이 노출할 필요가 없는 장점이자 구조적으로 맞음
  - 캡슐화 : 바깥 클래스의 private 멤버에 접근할 수 있어서 불필요한 public 메서드(getter)를 제거할 수 있다.


## 지역 클래스
- 바깥 클래스의 메서드 안에 클래스를 만든 것
  - 지역 클래스는 내부 클래스의 특성도 가지고 지역변수에서도 접근이 가능하다
  - 접근 제어자를 사용할 수 없음
  - 인터페이스 구현이나 부모 클래스의 상속도 받을 수 있음 -> 모든 중첩, 내부 클래스가 가능하다 
- 지역클래스도 내부 클래스 -> 바깥 클래스의 인스턴스에 소속된다
<갑자기 헷갈리는... 메서드 호출 방법>
인스턴스 메서드의 경우, 힙 영역에 인스턴스 객체가 생성이 되면서 참조값이 생김 -> 참조값을 통해 메서드가 호출되지만 사실 상 메서드 영역에 메서드 코드가 실행이 되는 것 -> 그리고 스택 영역에서 스택 프레임이 생성됨

### 지역 변수 캡처
- 지역 클래스의 인스턴스가 지역 변수에 접근하려고 할 때 -> 인스턴스와 지역 변수의 생명주기는 다르다
- 따라서 지역 변수 캡처라는 개념이 등장
  - 필요한 지역 변수를 미리 지역 클래스의 인스턴스 안에 캡쳐해서 보관해 놓는 것(지역 클래스의 인스턴스를 생성할 때 캡처를 함)
  - 중간에 값이 절대로 변경되서는 안된다 -> **final이거나 사실상 final**
- 왜 사실상 final 이어야 할까? -> 지역 클래스의 인스턴스를 생성하고 값을 바꾼다고 치면은?
  - 캡처를 하는 시점 : 지역 클래스의 인스턴스를 생성하는 시점에 캡처를 함
  - 캡처를 한 값 != 지역 변수의 값
  - 동기화를 진행해야 하는데 그것을 구현하는 것은 매우 까다로운 작업임 -> 거기에 멀티 쓰레드까지 겹치면...? 노답
-> 정리 : 지역 클래스가 접근하는 지역 변수의 값은 변경하면 안된다.

 ## 익명 클래스 
- 지역 클래스이지만 클래스 이름이 없는 클래스이다
- 지역 클래스와의 차이
  - 지역 클래스는 선언과 생성이 따로
  - 하지만 익명 클래스는 **클래스 선언과 생성을 한번에 처리**
  - new 인터페이스명/부모클래스명() {body}
    
- **익명 클래스는 부모 클래스를 상속 받거나 인터페이스를 구현해야 한다**
  - 익명 클래스를 사용할 때는 상위 클래스나 인터페이스가 필요하다
- 인스턴스를 단 한번만 생성할 수 있다
  
- 왜 사용하는가?
  - 별도로 클래스를 정의할 필요 X -> 즉석에서 구현할 수 있어 간결함
  - 특히, **코드 조각(메서드)를 함수의 인자로 넘기고 싶을 때**
    - 자바에서는 코드 조각을 파라미터로 넘길 방법이 없음 -> 그래서 정적 중첩 클래스를 이용해 인터페이스를 상속받아 인스턴스 참조값을 넘겨서 인스턴스의 메서드를 실행하게 하는 것(다형적 참조 이용)
    - 하지만 지저분함 이슈로 지역 클래스로 만들어 사용하지만 이 마저도 지저분함
    - 따라서 익명 클래스로 인터페이스를 구현함 -> 일회성으로 사용되는데 굳이 구현체의 참조 변수를 만들 필요가 없어서 파라미터에 직접 익명 클래스 사용


## 람다
- 자바 8 이전에 파라미터값 : 기본형 & 참조형
  - 인스턴스(참조형)를 만들어서 넘기는 것은 너무 장황하고 복잡해... 메서드만 넘길 수는 없을까?
- 자바 8을 기준으로 메서드를 인수로 전달할 수 있게 됨 -> 람다 등장!

## 예외처리
- 왜 사용하는가?
  - 정상흐름과 예외흐름을 분리하기 위해서!
  - 정상흐름의 반환값을 가지고 예외처리를 하면은 섞여버림 
- 특징
  - 예외도 객체이다 -> Object가 최상위 부모
  - Throwable : 최상위 예외. 하위에 Exception과 Error가 있음
  - Error : 애플리케이션에서 복구가 불가능한 시스템 예외(메모리 부족, 심각한 시스템 오류). 개발자는 이걸 잡으려고 하면 안됨
  - Exception : 체크 예외(컴파일러가 체크하는, Exception을 상속받는 하위 예외들도 모두 체크 예외). 실질적인 최상위 예외.
    - RuntimException : 언체크 예외(= 런타임 예외, 컴파일러가 체크하지 않음). 그 자식 예외도 모두 언체크예외
   
- 예외의 2가지 기본 규칙
  - **!!!!!!!!!!!!!!!!!!!!예외는 잡아서 처리하거나 밖으로 던져야 한다(나를 호출한 곳으로 던지기)!!!!!!!!!!!!!!!!!!!!!**
  - 예외를 잡거나 던질 때 지정한 예외뿐만 아니라 그 예외의 자식들도 함께 처리할 수 있다
    - ex) Exception을 catch(내가 잡아서 처리하겠다) 하면은, 하위 예외들도 잡을 수 있음
    - ex) Exception을 throws(밖으로 던지겠다) 하면은, 하위 예외들도 던질 수 있다.
   
- 만약 계속 밖으로 예외를 던지면 어떻게 되는가?
  - main밖으로 예외를 던지면서 예외 로그를 출력하고 시스템이 종료
 
### 체크 예외
- Exception과 그 하위 예외는 모두 컴파일러가 체크하는 체크 예외임
- **체크 예외는 직접 잡아서 처리하거나(try catch), 밖으로 던져버리기(throws) 둘 중 하나를 택해야 한다**
- 키워드
  - throw new 예외 : 예외 객체 인스턴스를 생성해서 예외를 발생시킴
  - throws 예외 : 이 예외가 발생하면 나 해결 못하니까 **밖으로 던질거야**
- 예외 잡을 거야 VS 예외 밖으로 던질거야
  - 잡을 거야 : try에서 발생한 오류를 catch에서 잡는다
    - catch에 예외를 지정하면 그 예외의 하위 예외도 다 잡는다(다형성의 원리 적용)
  - 밖으로 던질거야 : 메소드 옆에 throws로 오류를 던진다
    - 밖으로 던지면 거기서 프로그램이 종료된다

### 언체크 예외
- RuntimeException과 그 하위 예외는 언체크 예외로 분류됨
- 말 그대로 컴파일러가 예외를 체크하지 않는다. **!!!!!!!!!!! catch 안할거면 자동으로 밖으로 던질거야 !!!!!!!!!!**
- 언체크와 체크의 차이는, **언체크는 throws를 생략할 수 있으며** 생략해도 자동으로 예외를 던진다
  - 체크 예외 : 예외가 발생하면 잡던가 밖으로 던지던가!!
  - 언체크 예외 : 예외가 발생해도 throws 명시 안해도 돼.
    => 그냥 하나로 정리하면, 둘 다 똑같은데 차이점이 딱 하나. 예외를 처리할 수 없을 때 **예외를 밖으로 던지는 부분**에 있다! Throws를 생략할 수 있냐 없냐? 

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

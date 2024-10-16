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

## equals()
- 동등성? 동일성?
  - 동일성(Identity) : 같은 객체를 가르키고 있는지(100% 똑같음)
  - 동등성(Equality) : 두 객체가 논리적으로 동등한지(완전히 같지는 않지만 비슷할지도..?)
- 동등성은 클래스마다 개념이 다르다 -> equals()를 오버라이딩 해야함. 하지 않으면 동일성을 기본으로 함


## 불변 객체(Immutable Object) 
- 객체의 상태(내부 필드값)이 변하지 않는 객체
- 생성자를 통해 초기화된 값이 바뀌지 않는 것
- 

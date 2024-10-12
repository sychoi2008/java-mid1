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
- Object 클래스의 메소드
- 클래스 정보@참조값
- 

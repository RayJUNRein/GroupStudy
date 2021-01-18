package JAVA_2021_01_14_Twelveth;

//인터페이스 작성법
//1. public 을 적고 interface를 적는다.
//2. 인터페이스로 만들 이름을 적는다.
//3. 내부에 다형성을 가질 수 있게 만들 매서드 프로토타입을 작성한다.

// 다형성?
// 누가 이것을 구현하냐에 따라 결과가 달라진다.
public interface Comparable {
    // 현재 이부분은 단순히 프로토타이핑만 한 것이다.
    // 프로토타이핑이 무엇이냐 ?
    // 매서드의 리턴타입(1), 매서드 이름(2), 매서드 인자(3)의 입력만 정의한 형태

  //(1)    (2)         (3)
    int compareTo (Object other, int order);
}

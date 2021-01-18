package Sixth;

public class FirstArrayTest {
    public static void main(String[] args) {
        /*
         배열을 왜 사용하는가?
         계좌 금액을 관리하는 프로그램을 만든다고 할때
         한국사람만 4000만개의 int형 변수를 만들어야 하면 힘드니
         배열을 사 용
        아래 예의 경우 만약 배열이 없었다면
        int arr1, arr2, arr3, arr4, arr5;
        int arr6, arr7, arr8, arr9, arr10;
        위와같이 만들어야 해씅ㄹ 것이다
        그러나 배열을 사용해 아래로 끝이난다.

        ###배열을 만드는 방법###
        1. 데이터타입을 적는다.
        2. 대괄호를 열고 닫는다.
        3. 변수 이름을 지정하듯이 배열의 이름을 지정ㅎㄴ다.
        4. 필요하다면 값을 할당한다.
           값을 할당하는 방법
           4-1. new를 적는다.
           4-2. 데이터타입을 적고 대괄호를 열고 닫는다.
           4-3. 몇 개를 만들 것인지 대괄호 내부에 숫자를 적는다.
           *변칙수;
            중괄호를 열고 닫은 이후
            아래와 같이 미리 값을 할당할 수도 있다.
            {1, 2, 4, 5, 2342, 25335, 30}
        */
        int[] arr = new int [10];
        //int형 다발을 이름 arr로 만들겠다 = int형의 공간을 10개 만들겠다;
        //위의 두 문장이 결합되어
        //int형 배열 arr 은 int 형 공간 10개를 가진다.

        for(int i = 0; i < 10; i++){
            arr [i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        /*
          배열의 시작 인덱스는 무조건 0부터 시작한다.
          -----------------------------------------
          | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |  for문이 끝났을때
          -----------------------------------------
           [0] [1] [2] [3] [4] [5] [6] [7] [8]  [9]

           -----------------------------------------
          |   |   |   |   |   |   |   |   |   |  |   for문 이전
          -----------------------------------------
           [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
         */


        }
    }
}

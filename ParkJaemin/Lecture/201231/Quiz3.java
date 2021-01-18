public class Quiz3 {
    public static void main(String[] args) {
        // 2 ~ 19 사이의 숫자중 짝수만 찾아보자!
        int num = 2;

        while (num < 20) {
            // if문 내부에 num++이 들어있을 경우
            // 조건을 만족하는 경우에만 +1이 되므로
            // 무한 반복을 하며 같은 숫자만 출력하게 된다.
            if (num % 2 == 0) {
                System.out.println("num = " + num);
            }

            // 조건에 관계없이 지속적으로 값을 상승시키기 위함
            num++;
        }
    }
}
package programmersLv0;

/**
 * 두수의 차
 *
 */

public class ex02 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println(solution(num1,num2));

    }

    private static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }
}

package programmersLv0;


/**
 *
 * 두 수의 나눗셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 *
 */

public class ex05 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        System.out.println(solution(num1,num2)); //1500

    }

    private static int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;
        return (int) answer;
    }
}

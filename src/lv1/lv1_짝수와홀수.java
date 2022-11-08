package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12937

public class lv1_짝수와홀수 {
    public String solution(int num) {
        String answer = isEvenOdd(num);
        return answer;
    }

    String isEvenOdd(int num) {

        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}
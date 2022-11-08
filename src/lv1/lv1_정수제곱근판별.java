package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12934

public class lv1_정수제곱근판별 {
    public long solution(long n) {
        long findedSqrt = findSqrt(n);
        long answer = powNum(findedSqrt);
        return answer;
    }

    long findSqrt(long n) {
        long sqrt = (long) Math.sqrt(n);
        if (Math.pow(sqrt, 2) == n) {
            return sqrt;
        }
        return -1;
    }

    long powNum(long sqrt) {
        if (sqrt != -1) {
            return (long) Math.pow(sqrt + 1, 2);
        }
        return sqrt;
    }
}
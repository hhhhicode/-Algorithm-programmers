package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12928

public class lv1_약수의합 {
    public int solution(int n) {
        int answer = findSum(n);
        return answer;
    }

    int findSum(int n) {

        int sum = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }

        return sum + n;
    }
}
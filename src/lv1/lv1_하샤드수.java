package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12947

public class lv1_하샤드수 {
    public boolean solution(int x) {

        int sum = eachSum(x);
        boolean answer = true;
        if (x % sum != 0) {
            answer = false;
        }
        return answer;
    }

    int eachSum(int x) {
        int result = 0;

        while (x != 0) {
            result += x % 10;
            x /= 10;
        }

        return result;
    }
}
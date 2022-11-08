package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12931

public class lv1_자릿수더하기 {
    public int solution(int n) {

        int answer = run(n);

        return answer;
    }

    int run(int n) {
        Integer num = n;
        String numString = num.toString();

        int result = 0;
        for(int i = 0; i < numString.length(); i++) {
            result += Integer.parseInt("" + numString.charAt(i));
        }

        return result;
    }
}
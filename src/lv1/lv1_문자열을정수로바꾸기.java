package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12925

public class lv1_문자열을정수로바꾸기 {
    public int solution(String s) {
        int answer = stringToInt(s);
        return answer;
    }

    int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12916

public class lv1_문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        int pNum = findCharNum(s, 'P');
        int yNum = findCharNum(s, 'Y');

        if (pNum != yNum) {
            answer = false;
        }

        return answer;
    }

    int findCharNum(String s, char c) {
        String str = s.toUpperCase();
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                num += 1;
            }
        }

        return num;
    }
}
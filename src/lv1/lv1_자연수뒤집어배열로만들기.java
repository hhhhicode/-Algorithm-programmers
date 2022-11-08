package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12932

public class lv1_자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int[] answer = numToReversedArr(n);
        return answer;
    }

    int[] numToReversedArr(long n) {
        Long num = n;
        String numString = num.toString();
        String s = reversedNumString(numString);

        return stringToIntArr(s);
    }

    String reversedNumString(String numString) {
        String result = "";

        for (int i = numString.length() - 1; i >= 0; --i) {
            result += numString.charAt(i);
        }
        return result;
    }

    int[] stringToIntArr(String s) {
        int[] numArr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt("" + s.charAt(i));
            numArr[i] = num;
        }

        return numArr;
    }
}
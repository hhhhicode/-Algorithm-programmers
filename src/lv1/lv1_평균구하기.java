package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12944

import java.util.Arrays;

public class lv1_평균구하기 {
    public double solution(int[] arr) {
        double answer = Arrays.stream(arr).average().getAsDouble();
        return answer;
    }
}
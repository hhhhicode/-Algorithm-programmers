package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;

public class lv1_제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int[] answer;
        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            answer = removeMinValueArr(arr);
        }
        return answer;
    }

    int[] removeMinValueArr(int[] arr) {

        int minValue = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr)
                .boxed()
                .filter(a -> a > minValue)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
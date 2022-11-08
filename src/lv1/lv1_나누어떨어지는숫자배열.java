package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv1_나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = dividedArray(arr, divisor);
        for (Integer i : answer) {
            System.out.println("i = " + i);
        }
        if (answer.length == 0) {
            answer = new int[] {-1};
        }
        return answer;
    }

    int[] dividedArray(int[] arr, int divisor) {
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return collect.stream()
                .filter(integer -> integer % divisor == 0)
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
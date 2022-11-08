package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/86051

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv1_없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = newArr(numbers);
        return answer;
    }

    int newArr(int[] numbers) {

        List<Integer> collect = Arrays.stream(numbers)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        int result = 0;
        int num = 0;
        for (Integer i : collect) {
            while (num < i) {
                result += num;
                num++;
            }
            if (num == i) {
                num++;
            }
        }

        while (num < 10) {
            result += num;
            num++;
        }

        return result;
    }
}
package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class lv1_정수내림차순으로배치하기 {
    public long solution(long n) {
        List<Long> integers = longToList(n);
        integers.sort(Comparator.reverseOrder());
        long answer = listToLong(integers);
        return answer;
    }

    List<Long> longToList(long n) {
        List<Long> longToList = new ArrayList<>();

        while (n != 0) {
            longToList.add(n % 10);
            n = n / 10;
        }

        return longToList;
    }

    long listToLong(List<Long> list) {
        long result = 0;
        for (Long num : list) {
            result = result * 10 + num;
        }

        return result;
    }
}
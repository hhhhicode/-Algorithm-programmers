package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12954

import java.util.ArrayList;

public class lv1_x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = run(x, n);
        return answer;
    }

    long[] run(int x, int n) {
        ArrayList<Long> integers = new ArrayList<>();
        long num = 0;

        while (n-- != 0) {
            num += x;
            integers.add(num);
        }
        return integers.stream().mapToLong(Long::longValue).toArray();
    }
}
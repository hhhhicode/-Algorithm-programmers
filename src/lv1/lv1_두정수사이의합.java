package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12912


import java.util.ArrayList;
import java.util.Comparator;

public class lv1_두정수사이의합 {
    public long solution(int a, int b) {
        long answer = run(a, b);
        return answer;
    }

    long run(int a, int b) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(a);
        integers.add(b);
        integers.sort(Comparator.naturalOrder());
        long sum = 0;

        for (int i = integers.get(0); i <= integers.get(1); i++) {
            sum += i;
        }

        return sum;
    }
}
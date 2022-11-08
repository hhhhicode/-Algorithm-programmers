package lv2;
//https://school.programmers.co.kr/learn/courses/30/lessons/42586

import java.util.*;
import java.util.stream.Collectors;

public class lv2_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] addArr = new int[speeds.length];

        Queue<Integer> progressQueue = new ArrayDeque<>();
        setQueue(progressQueue, progresses);

        List<Integer> integerList = new ArrayList<>();
        int j = 0;
        while (!progressQueue.isEmpty()) {
            int count = 0;

            //얼마나 했냐?
            for (int i = 0; i < speeds.length; i++) {
                addArr[i] += speeds[i];
            }

            //오늘 몇 개 배포하냐?
            while (!progressQueue.isEmpty() && progressQueue.peek() + addArr[j] >= 100) {
                count++;
                j++;
                progressQueue.poll();
            }

            if (count != 0) {
                integerList.add(count);
            }
        }
        System.out.println("integerList = " + integerList);

        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }

    private void setQueue(Queue<Integer> queue, int[] arr) {
        for (int value : arr) {
            queue.add(value);
        }
    }
}
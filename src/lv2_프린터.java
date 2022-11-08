
//https://school.programmers.co.kr/learn/courses/30/lessons/42587

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class lv2_프린터 {
    public int solution(int[] priorities, int location) {

        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> myIndex = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            priorityQueue.add(priorities[i]);
            queue.add(priorities[i]);
            if (location == i) {
                myIndex.add(location);
            } else {
                myIndex.add(-1);
            }
        }

        int count = 0;

        while (!queue.isEmpty()) {
            if (queue.peek().equals(priorityQueue.peek())) {
                count++;
                queue.poll();
                priorityQueue.poll();
                Integer poll = myIndex.poll();
                if (poll == location) {
                    break;
                }
            } else if (!queue.peek().equals(priorityQueue.peek())) {
                queue.add(queue.poll());
                myIndex.add(myIndex.poll());
            }
        }

        return count;
    }
}
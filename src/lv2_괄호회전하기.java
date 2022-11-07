import java.util.*;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/76502
public class lv2_괄호회전하기 {
    public int solution(String s) {

        Queue<Character> queue = getQueue(s);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            leftShift(queue, queue.poll());
            List<Character> collect = queue.stream().collect(Collectors.toList());

            boolean isGood = isGoodStack(collect);
            if (isGood) count++;
        }

        return count;
    }

    private boolean isGoodStack(List<Character> collect) {
        boolean isGood = false;
        Stack<Character> stack = new Stack<>();
        for (Character character : collect) {
            if (character.equals('(') || character.equals('[') || character.equals('{')) {
                stack.push(character);
            } else if (!stack.empty() && isGood(stack.peek(), character)) {
                stack.pop();
            } else {
                stack.push(character);
                break;
            }
        }
        if (stack.empty()) isGood = true;
        return isGood;
    }

    private static void leftShift(Queue<Character> queue, Character character) {
        queue.add(character);
    }

    private static Queue<Character> getQueue(String s) {
        Queue<Character> queue = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            leftShift(queue, aChar);
        }
        return queue;
    }

    private boolean isGood(Character prevChar, Character thisChar) {
        boolean isGood = false;
        switch (thisChar) {
            case ')':
                if (prevChar.equals('(')) isGood = true;
                break;
            case ']':
                if (prevChar.equals('[')) isGood = true;
                break;
            case '}':
                if (prevChar.equals('{')) isGood = true;
                break;
        }

        return isGood;
    }
}
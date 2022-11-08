package lv2;
//https://school.programmers.co.kr/learn/courses/30/lessons/43165

import java.util.Arrays;

public class lv2_타겟넘버 {
    private int target;

    public int solution(int[] numbers, int target) {
        init(target);

        int[] arr = new int[numbers.length];

        return dfs(0, numbers, arr);
    }

    private void init(int target) {
        this.target = target;
    }

    private int dfs(int n, int[] numbers, int[] arr) {
        int count = 0;

        if (n > numbers.length - 1) {
            int arrSum = Arrays.stream(arr).reduce(0, Integer::sum);
            if (arrSum == this.target) {
                return 1;
            }
            return 0;
        }
        
        arr[n] = -1 * numbers[n];
        count += dfs(n + 1, numbers, arr);
        arr[n] = numbers[n];
        count += dfs(n + 1, numbers, arr);

        return count;
    }
}

//메모이제이션을 사용할 수 있으면 사용하자.
//경우의 수를 구하는 문제.

package lv2;

import java.util.*;

public class lv2_N개의최소공배수 {
    public int solution(int[] arr) {
        int answer = 1;
        Map<Integer, Integer> totalSosuMul = new HashMap<>();
        for (int num : arr) {
            Map<Integer, Integer> sosuMul = getSosuMul(num);
            for (Integer sosu : sosuMul.keySet()) {
                if (!totalSosuMul.containsKey(sosu)) totalSosuMul.put(sosu, 0);
                if (totalSosuMul.get(sosu) >= sosuMul.get(sosu)) continue;
                totalSosuMul.put(sosu, sosuMul.get(sosu));
            }
        }

        for (Integer sosu : totalSosuMul.keySet()) {
            answer *= Math.pow(sosu, totalSosuMul.get(sosu));
        }
        return answer;
    }

    private Map<Integer, Integer> getSosuMul(int num) {

        Map<Integer, Integer> sosuMul = new HashMap<>();
        for (int n = 2; n <= num; n++) {
            while (num % n == 0 && num != 1) {
                num /= n;
                if (!sosuMul.containsKey(n)) sosuMul.put(n, 0);
                sosuMul.put(n, sosuMul.get(n) + 1);
            }
        }

        return sosuMul;
    }
}
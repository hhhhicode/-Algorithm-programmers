package lv2;

import java.util.ArrayList;
import java.util.List;

public class lv2_예상대진표 {
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        List<Integer> aRoute = getRoute(n, a);
        List<Integer> bRoute = getRoute(n, b);
        for (int i = 0; i < aRoute.size(); i++) {
            if (aRoute.get(i).equals(bRoute.get(i))) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    private List<Integer> getRoute(int mans, int num) {
        List<Integer> routeList = new ArrayList<>();
        while (mans != 1) {
            if (num % 2 != 0) {
                num += 1;
            }
            routeList.add(num);
            num /= 2;
            mans /= 2;
        }

        return routeList;
    }
}
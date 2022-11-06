import java.util.ArrayDeque;
import java.util.Queue;

//https://school.programmers.co.kr/learn/courses/30/lessons/12914
public class lv2_1차_캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        Queue<String> cache = new ArrayDeque<>();
        for (String city : cities) {
            String lowerCaseCity = city.toLowerCase();
            if (cache.contains(lowerCaseCity)) {
                cache.remove(lowerCaseCity);
                cache.add(lowerCaseCity);
                answer++;
            } else {
                cache.add(lowerCaseCity);
                if (cacheSize < cache.size()) {
                    cache.poll();
                }
                answer += 5;
            }
        }

        return answer;
    }
}

//2, "Jeju", "Pangyo", "NewYork", "newyork" => 16
//j, p -> 10
//p, n -> 15
//p, n -> 16
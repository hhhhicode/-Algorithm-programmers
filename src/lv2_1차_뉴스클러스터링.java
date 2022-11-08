
//https://school.programmers.co.kr/learn/courses/30/lessons/17677

import java.util.*;

public class lv2_1차_뉴스클러스터링 {
    public int solution(String str1, String str2) {

        //소문자로 바꾸기
        String lowerString1 = lowerString(str1);
        String lowerString2 = lowerString(str2);

        //두 글자씩 나누어 담기, 영문자 제외 쌍 버림 (value, 개수 를 담아야 하므로 Map 을 사용)
        Map<String, Integer> splitStringMap1 = splitString(lowerString1);
        Map<String, Integer> splitStringMap2 = splitString(lowerString2);

        //교집합 구하기
        Map<String, Integer> intersection = getIntersection(splitStringMap1, splitStringMap2);
        //합집합 구하기
        Map<String, Integer> union = getUnion(splitStringMap1, splitStringMap2);

        //다중집합 자카드 유사도 구하기
        //stream()의 reduce()는 stream 을 하나의 데이터로 만드는 작업이다.
        Integer intersectionSum = intersection.values().stream().reduce(0, Integer::sum);
        Integer unionSum = union.values().stream().reduce(0, Integer::sum);

        double answer = 1;
        if (!unionSum.equals(0)) {
            answer = (double) intersectionSum / unionSum;
        }

        return (int) (answer * 65536);
    }

    private Map<String, Integer> getUnion(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> unionMap = new LinkedHashMap<>();
        for (String key : map1.keySet()) {
            if (!unionMap.containsKey(key)) {
                unionMap.put(key, map1.get(key));
            }
        }
        for (String key : map2.keySet()) {
            if (!unionMap.containsKey(key)) {
                unionMap.put(key, map2.get(key));
            } else {
                unionMap.replace(
                        key,
                        Math.max(
                                unionMap.get(key),
                                map2.get(key)
                        )
                );
            }
        }

        return unionMap;
    }

    private Map<String, Integer> getIntersection(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> intersectionMap = new LinkedHashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                intersectionMap.put(key, Math.min(map1.get(key), map2.get(key)));
            }
        }

        return intersectionMap;
    }

    private Map<String, Integer> splitString(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) < 'a' || 'z' < str.charAt(i - 1) ) continue;
            if (str.charAt(i) < 'a' || 'z' < str.charAt(i)) continue;

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder
                    .append(str.charAt(i - 1))
                    .append(str.charAt(i));
            if (map.containsKey(stringBuilder.toString())) {
                map.replace(
                        stringBuilder.toString(),
                        map.get(stringBuilder.toString()) + 1
                );
            } else {
                map.put(
                        stringBuilder.toString(),
                        1
                );
            }
        }
        return map;
    }

    private String lowerString(String str) {

        return str.toLowerCase();
    }
}

//stream()의 reduce()는 stream 을 하나의 데이터로 만드는 작업이다.
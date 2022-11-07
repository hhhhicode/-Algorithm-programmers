import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class lv2_위장 {
    public int solution(String[][] clothes) {
        Map<String, List<String>> listMap = getListMap(clothes);

        return getCount(listMap);
    }

    private static Map<String, List<String>> getListMap(String[][] clothes) {
        Map<String, List<String>> listMap = new HashMap<>();
        for (String[] clothe : clothes) {
            if (!listMap.containsKey(clothe[1])) listMap.put(clothe[1], new ArrayList<>());
            listMap.get(clothe[1]).add(clothe[0]);
        }
        return listMap;
    }

    private static int getCount(Map<String, List<String>> listMap) {
        int count = 1;
        for (String key : listMap.keySet()) {
            count *= (listMap.get(key).size() + 1);
        }
        count -= 1;
        return count;
    }
}

//각 부위에서 0개 혹은 1개를 뽑아야 한다.
//결과에서 모두 0개를 뽑은 경우는 제거한다. (전체 경우의 수 -1)

//각 부위별로 나누어 List 에 추가한다.
//경우의 수를 구하기 위해 모두 곱한다.
//아무것도 입지 않은 경우를 뺀다.(-1)
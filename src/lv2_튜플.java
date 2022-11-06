import java.util.*;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/64065
public class lv2_튜플 {
    public int[] solution(String s) {
        int[] answer = getTuple(s);

        return answer;
    }

    private int[] getTuple(String s) {

        String replace = getReplaceString(s);
        String[] split = replace.split("},\\{");

        List<List<Integer>> lists = getLists(split);
        List<List<Integer>> sortedList = getSortedList(lists);
        Set<Integer> set = getIntegers(sortedList);

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    private static String getReplaceString(String s) {
        String replace = s.replace("{{", "");
        String replace1 = replace.replace("}}", "");
        return replace1;
    }

    private static Set<Integer> getIntegers(List<List<Integer>> sortedList) {
        Set<Integer> set = new LinkedHashSet<>();
        for (List<Integer> list : sortedList) {
            for (Integer integer : list) {
                set.add(integer);
            }
        }
        return set;
    }

    private static List<List<Integer>> getSortedList(List<List<Integer>> lists) {
        return lists.stream()
                .sorted(Comparator.comparingInt(o -> o.size()))
                .collect(Collectors.toList());
    }

    private static List<List<Integer>> getLists(String[] split) {
        List<List<Integer>> lists = new ArrayList<>();
        for (String s1 : split) {
            List<Integer> list = new ArrayList<>();
            String[] split1 = s1.split(",");
            for (String s2 : split1) {
                int num = Integer.parseInt(s2);
                list.add(num);
            }
            lists.add(list);
        }
        return lists;
    }
}

//s에서 주어지는 집합의 길이가 적은 것이 앞쪽이다.
//주어지는 집합의 길이가 짧은것 부터 튜플 요소의 순서가 특정된다.

//일정한 규칙의 String 이 주어진다면,
//String -> replace -> split -> List

//길이가 짧은 것이 앞쪽이고, 짧은것 부터 튜플 요소의 순서가 특정되므로,
//List -> SortedList

//짧은 집합 순서로, 중복되는 것을 빼고 위에서 정렬된 순서대로 넣으면 튜플 완성
//SortedList -> LinkedHashSet -> int[]
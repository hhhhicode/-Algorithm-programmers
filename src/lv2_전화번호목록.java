
//https://school.programmers.co.kr/learn/courses/30/lessons/42577

import java.util.*;

public class lv2_전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        //짧은 길이순으로 정렬한다.
        //List 로 만들어 정렬하는 것 보다, 형변환 없이 그대로 정렬하는 것이 빠르다.
//        Arrays.parallelSort(phone_book, Comparator.comparing(s -> s.length()));
        Arrays.parallelSort(phone_book);


        //자신과 같거나 긴 문자열에 대해서만 prefix 인지 체크한다.
        answer = isPrefix2(phone_book);

        return answer;
    }

    private boolean isPrefix2(String[] arr) {
        boolean answer = true;

        for (int i = 1; i < arr.length; i++) {
            if (!answer) break;

            if (arr[i - 1].length() >= arr[i].length()) continue;

            if (arr[i - 1].equals(arr[i].subSequence(0, arr[i - 1].length()))) {
                answer = false;
            }
        }

        return answer;
    }

    private boolean isPrefix(String[] arr) {
        boolean answer = true;

        for (int i = 0; i < arr.length; i++) {
            if (!answer) break;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() == arr[j].length()) continue;

                if (arr[i].equals(arr[j].subSequence(0, arr[i].length()))) {
                    answer = false;
                }
            }
        }

        return answer;
    }
}

//s.startWith(prefix)로 String 의 prefix 여부를 알 수 있다.
//형변환 없이 int 그대로 정렬하는 것이 빠르다.
//sort 는 int 로 하는게 가장 빠르지만, 20자리는 숫자로 바꾸기엔 너무 크다.
//subSequence()로 떼어내서 비교해도, startWith()와 시간은 비슷하게 나왔다.
//Arrays.sort()는 사전 편찬 상 정렬인 naturing ordering 을 따른다. => i-1과 i를 비교하면 된다.

//hash 로 풀기
//모두 hashMap 에 등록, key 중요.
//모두 0부터 길이만큼 subString 해서 하나하나 containsKey 로 확인.
package lv2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class lv2_HIndex {
    public int solution(int[] citations) {
        int answer = getHIndex(citations);
        return answer;
    }

    private int getHIndex(int[] citations) {

        int hIndex = 0;
        Arrays.sort(citations);
        for (int i = 1; i <= citations.length; i++) {
            if (citations[citations.length - i] < i){
                break;
            }

            hIndex = i;
        }

        return hIndex;
    }
}

// n개 중, h 이상이 i개 이상이면, h-index 는 i 이상이다

//arr={1,2,3,4,5} - 정렬, indexLength = 4, size = 5
//0 이상 : 0은 무조건 통과, 0
//  => h-index 는 0 이상
//1 이상 : arr[size - 1] == 5, 1개 이상 무조건 1 이상이다. hIndex = 1
//2 이상 : arr[size - 2] == 4, 2개 이상 무조건 2 이상이다. hIndex = 2
//3 이상 : arr[size - 3] == 3, 3개 이상 무조건 3 이상이다. hIndex = 3
//4 이상 : arr[size - 4] == 2, 4 이상 값이 4개 이상이 아니다. break
//5 이상 : arr[size - 5] == 1, 5 이상 값이 5개 이상이 아니다. break
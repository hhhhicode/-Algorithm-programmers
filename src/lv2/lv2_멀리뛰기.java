package lv2;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/12914
public class lv2_멀리뛰기 {
    public long solution(int n) {
        int[] lengthTable = new int[2001];
        long answer = dp(n, lengthTable);
        return answer;
    }

    private long dp(int n, int[] lengthTable) {

        initLengthTable(lengthTable);
        for (int i = 2; i < lengthTable.length; i++) {
            lengthTable[i] = (lengthTable[i - 1] % 1234567 + lengthTable[i - 2] % 1234567) % 1234567;
        }

        return lengthTable[n];
    }

    private void initLengthTable(int[] lengthTable) {
        lengthTable[0] = 1;
        lengthTable[1] = 1;
    }
}

//다음 단계로 갈 수 있는 방법이 정해져있다.
// n-1에서 n으로 가는 방법이 정해져 있으면 DP를 사용하면 된다.
// n-1에서 n에 가는 방법은, 1과 2 둘 뿐이다.

//////////////////////////////////////////////////////////////////

//num == 5
//0번 1+1+1+1+1 (5개)
//  2 위치, 5개 중 0개 선택
//1번 2+1+1+1, 1+2+1+1, 1+1+2+1, 1+1+1+2 (4개)
//  2 위치, 4개 중 1개 선택
//2번 2+2+1, 2+1+2, 1+2+2 (3개)
//  2 위치, 3개 중 2개 선택

//2의 개수(r), 0 ~ n/2개
//2의 자리(n), (1 개수 : num-2*r) + (2 개수 : r)

// 조합
// nCr == nPr/r!

    /*
    public long solution(int n) {
        long answer = calc(n);
        return answer;
    }

    private long calc(int num) {
        long count = 0;
        int maxR = num / 2;
        //maxR개 까지 2선택 가능
        for (int r = 0; r < maxR + 1; r++) {
            int n = (num - 2 * r) + r;
            long nPr = getNPr(r, n) % 1234567;
            long rFac = getFactorial(r) % 1234567;
            long nCr = (nPr % 1234567 / rFac % 1234567) % 1234567;

            count = ((count % 1234567) + (nCr % 1234567)) % 1234567;
        }

        return count;
    }

    private long getNPr(int r, int n) {
        long nPr = 1;
        //선택할 수 있는 자리의 수는 점점 줄어든다.
        //n*(n-1)*(n-2)*...*(n-(r-1))
        for (int i = 0; i < r; i++) {
            nPr = ((nPr % 1234567) * ((n - i) % 1234567)) % 1234567;
        }

        return nPr;
    }

    private long getFactorial(int r) {
        long rFac = 1;
        for (int i = r; i > 0; --i) {
            rFac = ((rFac % 1234567) * (i % 1234567)) % 1234567;
        }

        return rFac;
    }
    */
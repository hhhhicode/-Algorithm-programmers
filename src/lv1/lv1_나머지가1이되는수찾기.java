package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/87389


public class lv1_나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = find(n);
        return answer;
    }

    int find(int n) {
        int i = 2;
        for (; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return n - 1;
    }
}
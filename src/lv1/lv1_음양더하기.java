package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/76501

public class lv1_음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = realSum(absolutes,signs);
        return answer;
    }

    int realSum(int[] absolutes, boolean[] signs) {

        int result = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                result += absolutes[i];
            } else {
                result -= absolutes[i];
            }
        }

        return result;
    }
}
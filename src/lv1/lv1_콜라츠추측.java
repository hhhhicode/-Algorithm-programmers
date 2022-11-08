package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12943


public class lv1_콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        double dNumber = num;

        while (dNumber != 1) {
            if (answer > 500) {
                answer = -1;
                break;
            } else if (dNumber % 2 == 0) {
                dNumber = divideTwo(dNumber);
            } else {
                dNumber = mulThreePlusOne(dNumber);
            }
            answer++;
        }

        return answer;
    }

    double divideTwo(double num) {
        return num / 2;
    }

    double mulThreePlusOne(double num) {
        return num * 3 + 1;
    }
}
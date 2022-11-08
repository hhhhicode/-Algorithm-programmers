package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12919

public class lv1_서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = findKim(seoul);
        return answer;
    }

    String findKim(String[] seoul) {

        int findedIndex = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                findedIndex = i;
            }
        }
        return String.format("김서방은 %s에 있다", findedIndex);
    }
}
package lv1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12948

public class lv1_핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = blindPhoneNumber(phone_number);
        return answer;
    }

    String blindPhoneNumber(String phone_number) {

        String substring = phone_number.substring(phone_number.length() - 4, phone_number.length());

        String result = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            result += "*";
        }

        return result + substring;
    }
}
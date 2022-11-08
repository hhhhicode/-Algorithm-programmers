package lv2;

import java.util.ArrayList;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/87390
public class lv2_n의2제곱배열자르기 {
    public int[] solution(int n, long left, long right) {

        List<Integer> list = new ArrayList<>();
        for (long num = left; num <= right; num++) {
            list.add((int) (Math.max(num / n, num % n) + 1));
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

//1 row 에 n개
//0 1 2
//3 4 5
//6 7 8

//left == (left/n, left%n)
// => i*n + j == num

//i행의 i까지는 i이다. i+1부터는 j를 따른다.

//3 = (1,4) 4
//4 = (2,1) 2
//5 = (2,2) 2
//6 = (2,3) 3
//7 = (2,4) 4
//8 = (3,1) 3
//9 = (3,2) 3
//10= (3,3) 3
//11= (3,4) 4
//12= (4,1) 4
//13= (4,2) 4
//14= (4,3) 4
package lv2;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class lv2_행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = matrixMul(arr1, arr2);

        return answer;
    }

    private int[][] matrixMul(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return arr3;
    }
}

//MxN * NxO => MxO
//MxO에 대해 표현한다고 생각하면 된다.
//  for(M)
//      for(N)
//          for(N) -> N이 변하며 계산하는 부분


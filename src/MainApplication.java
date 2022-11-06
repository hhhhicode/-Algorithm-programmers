public class MainApplication {

    public static void main(String[] args) {

        lv2_행렬의곱셈 sol = new lv2_행렬의곱셈();

        int[][] answer = sol.solution(new int[][]{{2,3,2}, {4,2,4}, {3,1,4}}, new int[][]{{5,4,3}, {2,4,1}, {3,1,1}});

        System.out.println("answer = " + answer);
    }
}

package lv2;
//https://school.programmers.co.kr/learn/courses/30/lessons/17677

public class lv2_k진수에서소수개수구하기 {
    public int solution(int n, int k) {

        //k 진수로 변경
        String kNumber = getKNumber(n, k);

        //조건에 맞도록 숫자를 구분
        String[] split = kNumber.split("0+");

        //조건에 맞는 숫자 중, 소수의 개수
        int count = getSosuCount(split);

        return count;
    }

    private int getSosuCount(String[] split) {
        int count = 0;
        for (String s : split) {
            if (isSosu(s)) {
                count++;
            }
        }

        return count;
    }

    private boolean isSosu(String s) {

        if (s.equals("1")) return false;
        double num = Double.parseDouble(s);
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private String getKNumber(int n, int k) {

        if (n / k == 0) {
            return "" + n % k;
        }

        return "" + getKNumber(n / k, k) + n % k;
    }
}

//k 진수를 구한다.
//조건에 맞게 수를 분리한다.
//소수인지 확인하고 개수를 샌다.

//소수 체크 시 제곱근을 사용하자. 소수를 구할때는 에라토스테레스의 체를 사용하자.
// 𝑝 × 𝑞 = 𝐍 일 때,  𝑝 와 𝑞 중 하나는 √N 보다 작거나 같다.
// 𝑝 가 증가한다면 자연스레 𝑞 가 감소하고, 반대로 𝑝 가 감소한다면 자연스레 𝑞 가 증가하기 때문이다.
//에라토스테네스의 체는 2부터 √N까지 k의 곱을 구해가며 체크하는 것이다.
//체크되어 있지 않은 것이 소수들이다.
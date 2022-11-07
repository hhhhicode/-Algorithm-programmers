//https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class lv2_점프와순간이동 {
    public int solution(int n) {
        int ans = getCount(n);

        return ans;
    }

    private int  getCount(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
                count++;
            }
        }

        return count;
    }
}
// 5000 -> 2500 -> 1250 -> 625 -> 624++ ->
// 312 -> 156 -> 78 -> 39 -> 38++ ->
// 19 -> 18++ ->
// 9 -> 8++ ->
// 4 -> 2 -> 1 -> 0++
//=> 5
class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a' + 1;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }

        for (int i = 1; i < k; i++) {
            sum = summation(sum);
        }

        return sum;
    }

    static int summation(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
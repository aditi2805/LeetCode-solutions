class Solution {
    public int gcdOfOddEvenSums(int n) {
        int SumEven = 0, SumOdd = 0;
        for (int i = 1; i <= n; i++) {
            SumEven += 2 * i;
            SumOdd += 2 * i - 1;
        }
        return gcd(SumEven, SumOdd);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
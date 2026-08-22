class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int prod = 1, sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            prod *= temp % 10;
            temp /= 10;

        }
        int summation = prod + sum;
        if (n % summation == 0) {
            return true;
        }
        return false;
    }
}
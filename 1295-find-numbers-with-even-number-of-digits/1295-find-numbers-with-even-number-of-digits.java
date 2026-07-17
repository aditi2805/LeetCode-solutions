class Solution {
    public int findNumbers(int[] nums) {
        int len = nums.length;
        int count = 0;
        for(int num:nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }
        static boolean isEven(int n){
            int number = digits(n);
            if(number%2==0){
                return true;
            }
            return false;
        }

        static int digits(int n){
            int c = 0, r = 0;
            while(n!=0){
                r = n%10;
                c++;
                n = n/10;
            }
            return c;
        }
}
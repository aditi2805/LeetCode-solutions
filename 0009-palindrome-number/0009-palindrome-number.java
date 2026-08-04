class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=x;
        int temp=0;
        int d=0, rem=0;
        while(y!=0){
            rem = y%10;
            temp = 10*temp + rem;
            y=y/10;
        }
        if(temp!=x){
            return false;
        }
        return true;
    }
}
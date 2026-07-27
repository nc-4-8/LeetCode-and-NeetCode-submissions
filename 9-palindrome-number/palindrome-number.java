class Solution {
    public boolean isPalindrome(int x) {
       int a = 0;
       int y = x;
        if(x<0){
            return false;
        }
        while(y!=0){
            int b = (int)(y%10);
            a = a*10+b;
            y/=10;
        }

        return(x==a);
    }
}
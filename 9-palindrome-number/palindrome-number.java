class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        if(x<0)
        return false;
        else
        {
            int d=0, sum=0;
            while(n!=0)
            {
                d=n%10;
                sum=(sum*10)+d;
                n=n/10;
            }
            if(sum==x)
            return true;
            else
            return false;
        }
    }
}
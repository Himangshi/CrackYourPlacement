class Solution {
    public boolean isPalindrome(int n) {
        if(n<0)
        return false;
        int t=n;        
        int s=0;
        while(t!=0)
        {
            int r=(t%10);
            s=(s*10)+r;
            t=t/10;
        }        
        if(n==s)
        return true;
        else
        return false;
    }
}

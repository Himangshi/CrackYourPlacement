class Solution {
    public boolean isHappy(int n) {
        int s=n;
        while(s>=10){
            s=digitsq(n);
            n=s;
        }
        if(s==1||s==7){
            return true;
        }
        else {
            return false;
        }       
    }
    public int digitsq(int n)
    {
        int s=0;
        while(n>0)
        {
            int a=n%10;
            s+=a*a;
            n=n/10;
        }                
        return s;
    }
}

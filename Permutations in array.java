class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        int j=n-1;
        for(int i=0;i<n;i++)
        {
            if((a[i]+b[j--])<k)
            return false;
        }
        return true;
    }
}

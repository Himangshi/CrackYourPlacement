class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> l=new ArrayList<Integer>();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            l.add(i);
        }
        l.add(n);
        if(k>l.size())
        return -1;
        else{
            return l.get(k-1);
        }
    }
}

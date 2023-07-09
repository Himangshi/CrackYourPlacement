class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(i<size&&j<size)
        {
            if(i!=j &&arr[j]-arr[i]==n)
            {
                return true;
            }
            else if(arr[j]-arr[i]<n)
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}

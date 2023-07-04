class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length,c=0;
        int[] arr=new int[l];
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=0)
            {
                arr[c]=nums[i];c++;
            }            
        }
        for(int i=0;i<l;i++)
        {           
            nums[i]=arr[i];
            
        }
    }
}

class Solution {
    public int minMoves(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            c+=nums[i]-nums[0];
        }  
        return c;      
    }
}

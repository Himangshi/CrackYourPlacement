class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max)
            max=candies[i];
        }
        List<Boolean> res=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int s=extraCandies+candies[i];
            if(s>=max)
            res.add(true);
            else
            res.add(false);
        }
        return res;
    }
}

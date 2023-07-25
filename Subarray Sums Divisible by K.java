class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
         int remainder=0;
         int count=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);

        for(int i:nums){
            sum += i;
            remainder=sum % k;

            if(remainder<0){
                remainder +=k;
            }

            if(map.containsKey(remainder)){
                count +=map.get(remainder);
                map.put(remainder,map.get(remainder)+1);
            }
            else{
                map.put(remainder,1);
            }
        }
        return count;       
    }
}

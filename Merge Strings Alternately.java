class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i,j,l1,l2;
        l1=word1.length();
        l2=word2.length();
        String s="";
        for(i=0,j=0;i<l1&&j<l2;i++,j++){
            s=s+word1.charAt(i)+word2.charAt(j);
        }
        if(l1>l2){
            s=s+word1.substring(l2,l1);            
        }
        if(l1<l2){
            s=s+word2.substring(l1,l2);            
        }
        return s;
    }
}

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans="";
        String ans1="";
        
        for(int i=0;i<word1.length;i++){
            ans=ans.concat(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            ans1=ans1.concat(word2[i]);
        }
        return ans.equals(ans1);
    }
       
}
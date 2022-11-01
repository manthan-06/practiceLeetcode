class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] ans=new int[2*n];
      int i=0;
      int j=n;
      int idx=0;
      for(int k=0;k<n;k++){
          ans[idx++]=nums[k];
          ans[idx++]=nums[j++];
      }
        return ans;
    }
}
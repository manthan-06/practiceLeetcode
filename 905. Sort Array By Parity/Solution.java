class Solution {
    public int[] sortArrayByParity(int[] nums) {
         int left = 0; 
         int right = nums.length - 1; 
         while(left < right ) 
        { 
            if(nums[left] % 2 != 0) 
            { 
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            } 
            else 
            { 
                left++; 
            } 
        }
        return nums;
        // final int N = nums.length;
        // int[] B = new int[N];
        // int left=0, right=N-1;
        // for(int i=0; i<N; i++) {
        //     if ((nums[i]&1)==0) {
        //         B[left++]=nums[i];
        //     }
        //     else {
        //         B[right--]=nums[i];
        //     }
        // }
        // return B;
    }
}
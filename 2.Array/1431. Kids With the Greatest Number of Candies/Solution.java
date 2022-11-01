import java.lang.Math.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        List<Boolean> result=new ArrayList<Boolean>(candies.length);
        for(int j=0;j<candies.length;j++){
            if((candies[j]+extraCandies)>=max){
                result.add(j,true);
            }
            else{
                result.add(j,false);
            }
        }
         return result;   
    }
}
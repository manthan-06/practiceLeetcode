class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count=0;
        int index=0;
        Iterator itr = items.iterator();
        switch (ruleKey) {
            case "type" : 
                index=0;
            break;
            case "color" :
                index=1;
            break;
            case "name" :
                index=2;
            break;
        }
        while(itr.hasNext()){
            List<String> temp = (List)itr.next();
           if( ruleValue.equals(temp.get(index))) count++;
        }
         return count;
    }
   
}
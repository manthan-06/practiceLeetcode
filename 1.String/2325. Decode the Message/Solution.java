class Solution {
    public String decodeMessage(String key, String message) {
        
        HashMap<Character,Character> map = new HashMap<>();
        char c ='a';
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' ' && !map.containsKey(key.charAt(i))){  
            map.put(key.charAt(i),c); 
                c++;
            }
             
        }
        StringBuilder ans =  new StringBuilder();
        for(char m: message.toCharArray()){
            if(m == ' ')  ans.append(' ');
            else ans.append(map.get(m));
        }
        return ans.toString();
    }
    
}
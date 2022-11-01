class Solution {
    public String restoreString(String s, int[] indices) {
        Character[] ch = new Character[indices.length];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++){
            ch[indices[i]] = s.charAt(i);
        }
        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);
        }
        return sb.toString();
    }
    
}
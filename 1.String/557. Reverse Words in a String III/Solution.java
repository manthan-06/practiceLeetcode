class Solution {
    public String reverseWords(String s) {
      
        String[] sa= s.split(" ");
        for(int i =0;i<sa.length;i++){
            StringBuilder re= new StringBuilder(sa[i]);
            sa[i] = re.reverse().toString(); 
        }
        System.out.println(Arrays.toString(sa));
        return String.join(" ",sa);
    }
}
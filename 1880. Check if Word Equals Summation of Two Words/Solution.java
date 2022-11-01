class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstV = findValue(firstWord);
        int secondV = findValue(secondWord);
        int targetV = findValue(targetWord);
        return (firstV + secondV) == targetV;
    }
    
    int findValue(String str) {
        int res = 0;
        for (int i=0; i<str.length(); i++) {
            int temp = str.charAt(i) - 'a';
            res = res * 10 + temp;
        }
        return res;
    }
}
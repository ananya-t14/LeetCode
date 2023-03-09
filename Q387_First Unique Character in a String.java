class Solution {
    public int firstUniqChar(String s) {
        int index=-1;
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String s1 = s.substring(0, i);
            String s2 = s.substring(i+1, s.length());
            if (s1.indexOf(ch)==-1 && s2.indexOf(ch)==-1){
                index = i;
                break;
            }
        }
        return index;
    }
}
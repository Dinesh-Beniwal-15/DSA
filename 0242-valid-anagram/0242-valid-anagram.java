class Solution {
    public boolean isAnagram(String s, String t) {
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        String str1=new String(char1);
        String str2=new String(char2);

        boolean ans=str1.equals(str2);

        return ans;
    }
    
}
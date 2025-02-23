class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        while(n>2){
            String str = "";
            for(int i=0;i<s.length()-1;i++){
                str += (s.charAt(i)+s.charAt(i+1))%10;
            }
            n--;
            s = str;
        }
    return s.charAt(0)==s.charAt(1);
    }
}
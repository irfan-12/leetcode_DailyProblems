class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int []diff = new int[2];
        int cnt = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(cnt<2){
                    diff[cnt] = i;
                }
                cnt++;
            }
        }
            if(cnt!=2){
                return false;
            }

            return s1.charAt(diff[0]) == s2.charAt(diff[1]) && s1.charAt(diff[1]) == s2.charAt(diff[0]);

            
        
    }
}
class Solution {
    public static void happy(int n,String cur ,List<String> res){
        if(cur.length() == n){
            res.add(cur);
            return;
        }
        for(char ch = 'a';ch<='c';ch++){
            if(!cur.isEmpty() && cur.charAt(cur.length()-1) == ch)
            continue;

            cur += ch;

            happy(n,cur,res);
            cur= cur.substring(0,cur.length()-1);
        }

    }
    public String getHappyString(int n, int k) {
        String cur = "";
        List<String> li = new ArrayList<>();
        happy(n,cur,li);
        if(li.size()<k){
            return "";
        }
    return li.get(k-1);
    }
}
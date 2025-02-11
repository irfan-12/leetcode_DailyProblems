class Solution {
    public String clearDigits(String s) {
        Stack<Character> str = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                str.push(s.charAt(i));
            }
            else if(!str.isEmpty()){
                str.pop();
            }
        }
        StringBuilder stack = new StringBuilder();
        for(Character ch: str){
            stack.append(ch);
        }
        return stack.toString();
    }
}
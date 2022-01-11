class Solution {
   public int leftBrackets=0, maxDepth=0;
    public int maxDepth(String s) {
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(') leftBrackets++;
            else if(c==')') leftBrackets--;  
            maxDepth = Math.max(leftBrackets, maxDepth);
        }
        System.out.println(maxDepth);
        return maxDepth;
    }
}

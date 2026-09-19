class Solution {
    public int maxDepth(String s) {

        int cd=0;
        int md=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        
        if(c =='(') cd++;
        if(cd>md) md=cd;
        else if(c==')') cd--;
        }
        return md;
        
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue <TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            ArrayList<Integer> al = new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                int val=curr.val;
                if(level % 2 == 0) {
                    if (val%2==0) {
                        return false;
                    }
                    }else {
                    if(val%2 !=0) {
                        return false;
                    }
                }

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            al.add(val);
            }
            if(level %2==0){
            for(int i=0;i<al.size()-1;i++){
                if(al.get(i)>=al.get(i+1)) return false;
            }}
            else{
                for(int i=0;i<al.size()-1;i++){
                if(al.get(i)<=al.get(i+1)) return false;
                } 
            }
            level++;
        }return true;
        
    }
}
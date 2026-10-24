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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return null;
        int level=0;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<TreeNode> al=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                al.add(curr);
            }
            if(level%2==1){
                int i=0;
                int j=al.size()-1;
                while(i<j){
                int temp=al.get(i).val;
                al.get(i).val=al.get(j).val;
                al.get(j).val=temp;
                i++;
                j--;

            }}level++;
        }return root;
        
    }
}
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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Deque<TreeNode> dq =  new LinkedList<>();
        dq.add(root);
        int max =1;
        while(!dq.isEmpty()){
            while(!dq.isEmpty()&&dq.getFirst()==null){
                dq.removeFirst();       
            }
            while(!dq.isEmpty()&&dq.getLast()==null){
                dq.removeLast();       
            }
            int size = dq.size();
            max = Math.max(max,size);
            for(int i=0;i<size;i++){
                TreeNode temp = dq.poll();
                if(temp==null){
                    dq.add(null);
                    dq.add(null);
                }else{
                    dq.add(temp.left);
                    dq.add(temp.right);
                }
            }
        }
        return max;
    }
}

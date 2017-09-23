public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null){
            return result;
        }
        queue.offer(root);
        while(queue.size() != 0){
            int length = queue.size();
            List<Integer> temp = new LinkedList<Integer>();
            for(int i = 0 ; i < length ; i++){
                TreeNode cur = queue.poll();
                temp.add(cur.val);
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
            result.add(temp);
        }
        return result;
    }
}
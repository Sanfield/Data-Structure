import java.util.ArrayList;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>  res=new ArrayList<Integer>();
        if(root==null)return res;
        order(root,res);
        return res;
    }
    private static void order(TreeNode root, ArrayList<Integer> list){
        if(root != null){
            list.add(root.val);
            order(root.left,list);
            order(root.right,list);
        }
    }
}
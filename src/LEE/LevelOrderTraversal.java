package LEE;

import LEE.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LevelOrderTraversal {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)return res;
        Stack<TreeNode> q=new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> tmpList=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode node=q.pop();
                tmpList.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            res.add(0, tmpList);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}

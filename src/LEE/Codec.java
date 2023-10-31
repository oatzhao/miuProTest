package LEE;

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return null;
        String treeStr="";
        treeStr+=root.val;
        if(root.left!=null) treeStr=treeStr+","+serialize(root.left);
        if(root.right!=null) treeStr=treeStr+","+serialize(root.right);
        return treeStr;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.equals("")) return null;
        String[] strs=data.split(",");
        return dfs(0, strs.length-1, strs);
    }
    public TreeNode dfs(int l, int r, String[] strs){
        if (l > r) return null;
        int left=l+1, num=Integer.valueOf(strs[l]);
        TreeNode root=new TreeNode(num);
        while(left<=r && Integer.valueOf(strs[left])<=num) left++;
        root.left=dfs(l+1, left-1, strs) ;
        root.right=dfs(left, r, strs);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        Codec ser = new Codec();
        Codec deser = new Codec();
        String tree = ser.serialize(root);
        TreeNode ans = deser.deserialize(tree);
        System.out.println(ans);
    }
}

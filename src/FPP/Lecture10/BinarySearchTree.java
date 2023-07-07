package FPP.Lecture10;

public class BinarySearchTree {
    TreeNode root;
    BinarySearchTree(){root = null;}
    BinarySearchTree(int val){root = new TreeNode(val);}

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode rigt;
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode rigt){
            this.val = val;
            this.left = left;
            this.rigt = rigt;
        }

        @Override
        public String toString(){return val + "";}
    }

    public TreeNode search(TreeNode root, int target){
        if(root == null){
            return null;
        }else if(root.val == target){
            return root;
        }
        if(target < root.val){
            return search(root.left, target);
        }
        return search(root.rigt, target);
    }

    public void insert(int val){
        if(root == null){
            this.root = insertRec(null, val);
        }else {
            insertRec(root, val);
        }
    }

    public TreeNode insertRec(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val< val){
            root.rigt = insertRec(root.rigt, val);
        }else {
            root.left = insertRec(root.left, val);
        }
        return root;
    }

    private TreeNode findSuccessor(TreeNode root){
        TreeNode cur = root.rigt;
        while (cur!= null && cur.left!=null){
            cur = cur.left;
        }
        return cur;
    }

    public TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(root.val == key){
            if(root.left == null){
                return root.rigt;
            }
            if(root.rigt == null){
                return root.left;
            }
            TreeNode p = findSuccessor(root);
            root.val = p.val;
            root.rigt = deleteNode(root.rigt, p.val);
            return root;
        }
        if(root.val < key){
            root.rigt = deleteNode(root.rigt, key);
        }else {
            root.left = deleteNode(root.left, key);
        }
        return root;
    }

    public void inOrderTraverse(TreeNode root){
        if(root != null){
            inOrderTraverse(root.left);
            System.out.println(root.val + " ");
            inOrderTraverse(root.rigt);
        }
    }

    public void preOrderTraverse(TreeNode root){
        if(root != null){
            System.out.println(root.val + " ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.rigt);
        }
    }

    public void postOrderTraverse(TreeNode root){
        if(root != null){
            postOrderTraverse(root.left);
            postOrderTraverse(root.rigt);
            System.out.println(root.val + " ");
        }
    }

    @Override
    public String toString(){
        return "BinarySearchTree{root = "+root.val+"}";
    }

}

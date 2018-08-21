package SwordToOffer;
/**
 * 
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 * @author hdfs
 *
 */

public class colina017 {
	class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	    
	public boolean l = false;
	public boolean r = false;
	public boolean h = false;
	
	public boolean flag = true;
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if((root1 == null && root2 != null)||((root2 == null && root1 != null)&&flag)||((root1==null && root2 == null)&&flag)) {
        	return false;
        }else if((root1 == null && root2 == null) || (root1 != null&& root2 == null)) {
        	return true;
        }else if(root1.val == root2.val) {
        	flag = false;
        	l = HasSubtree(root1.left, root2.left);
        	if(l) {
        		r = HasSubtree(root1.right, root2.right);
        	}
        	if(r) {
        		return true;
        	}
        }else if(root1.val != root2.val) {
        	return false;
        }
        if(root1 != null && root2 != null) {
        	flag = false;
        	h = HasSubtree(root1.left, root2);
        	if(!h) {
        		h = HasSubtree(root1.right, root2);
        	}
        }
        return h;
    } 

}

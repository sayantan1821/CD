package Main;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class q938 {
    /**
 * Definition for a binary tree node.
 *
 */
// class Solution {
//     public int sum = 0;
//     public int rangeSumBST(TreeNode root, int low, int high) {
//         if(root == null) return -1;
//         treeTraversal(root, low, high);
//         return sum;
//     }
//     public void treeTraversal(TreeNode node, int low, int high)
//     {
//         if (node == null)
//             return;

//         if(node.val >= low) treeTraversal(node.left, low, high);

//         if(node.val >= low && node.val <= high) {
//             sum = sum + node.val;
//         }

//         if(node.val <= high) treeTraversal(node.right, low, high);
//     }
// }

    public int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return -1;
        if(root.val >= low && root.val <= high) sum = sum + root.val;
        if(root.val >= low) rangeSumBST(root.left, low, high);
        if(root.val <= high) rangeSumBST(root.right, low, high);
        return sum;
    }
}

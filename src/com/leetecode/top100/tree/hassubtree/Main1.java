package com.leetecode.top100.tree.hassubtree;

/**
 * 第18题
 * 判断二叉树A中是否包含子树B
 *
 * @Author: dongjie
 * @Date: 2021/6/9 19:38
 */
public class Main1 {
    /**
     * 定义二叉树结构
     */
    static class TreeNode {
        Integer value;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer value) {
            this.value = value;
        }
    }

    /**
     * 递归遍历两棵树
     *
     * @param A
     * @param B
     * @return
     */
    public static boolean treverseTree(TreeNode A, TreeNode B) {
        //设置递归结束条件
        if (A == null && B == null) {
            return true;
        } else if (A == null || B == null) {
            return false;
        } else if (A.value.equals(B.value)) {
            return false;
        }

        return treverseTree(A.left, B.left) && treverseTree(A.right, B.right);
    }

    /**
     * 判断是否包含子树
     *
     * @param A
     * @param B
     * @return
     */
    public static boolean hasSubTree(TreeNode A, TreeNode B) {
        if (A == null) {
            return false;
        } else if (B == null) {
            return true;
        } else if (treverseTree(A, B)) {
            return true;
        }

        return hasSubTree(A.left, B) || hasSubTree(A.right, B);
    }


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(0);
        root1.left = node1;
        root1.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;
        node4.right = node6;

        TreeNode root2 = new TreeNode(4);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        root2.left = a;
        root2.right = b;

        System.out.println("A树是否包含B树：" + Main1.hasSubTree(root1, root2));
    }


}

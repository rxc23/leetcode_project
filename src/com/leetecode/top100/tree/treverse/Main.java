package com.leetecode.top100.tree.treverse;

/**
 * 二叉树的3种遍历
 *
 * @Author: dongjie
 * @Date: 2021/6/9 20:33
 */
public class Main {
    static class TreeNode {
        Integer value;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer value) {
            this.value = value;
        }
    }

    public static void preTreverse(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        preTreverse(root.left);
        preTreverse(root.right);
    }

    public static void inTreverse(TreeNode root) {
        if (root == null) {
            return;
        }
        inTreverse(root.left);
        System.out.println(root.value);
        inTreverse(root.right);
    }

    public static void postTreverse(TreeNode root) {
        if (root == null) {
            return;
        }
        postTreverse(root.left);
        postTreverse(root.right);
        System.out.println(root.value);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        System.out.println("先序遍历：");
        Main.preTreverse(root);
        System.out.println("中序遍历：");
        Main.inTreverse(root);
        System.out.println("后序遍历：");
        Main.postTreverse(root);

    }

}

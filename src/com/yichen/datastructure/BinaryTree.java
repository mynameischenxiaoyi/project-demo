package com.yichen.datastructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {
    private  static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode createTreeNode(LinkedList<Integer> inputList){
        TreeNode node=null;
        if(inputList == null || inputList.isEmpty()) return null;
        Integer data = inputList.removeFirst();
        if(data != null){
            node=new TreeNode(data);
            node.left=createTreeNode(inputList);
            node.right=createTreeNode(inputList);
        }
        return  node;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(new Integer[]{
                3,2,9,null,null,10,null,null,8,null,4
        }));
        TreeNode treeNode = createTreeNode(list);
        System.out.println("前序遍历结果：");
        preOrder(treeNode);
        System.out.println("--");
        preWithStack(treeNode);
//        System.out.println("zhong序遍历结果：");
//        inOrder(treeNode);
//        System.out.println("hou序遍历结果：");
//        afterOrder(treeNode);
    }

    public static void preWithStack(TreeNode treeNode){
        //先亘，在左树，再右边树
        Stack<TreeNode> stack = new Stack<>();
        if(treeNode == null)  return;
        System.out.println(treeNode.data);
        stack.push(treeNode.right);
        stack.push(treeNode.left);
        while (!stack.empty()){
            TreeNode pop = stack.pop();
            preWithStack(pop);
        }
    }

    private static void preOrder(TreeNode treeNode) {
        if(treeNode== null) return;
        System.out.print(treeNode.data);
        preOrder(treeNode.left);
        preOrder(treeNode.right);
    }

    private static void inOrder(TreeNode treeNode) {
        if(treeNode== null) return;
        inOrder(treeNode.left);
        System.out.print(treeNode.data);
        inOrder(treeNode.right);
    }

    private static void afterOrder(TreeNode treeNode) {
        if(treeNode== null) return;
        afterOrder(treeNode.left);
        afterOrder(treeNode.right);
        System.out.print(treeNode.data);
    }

}

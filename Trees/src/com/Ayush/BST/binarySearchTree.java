package com.Ayush.BST;

import com.Ayush.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class binarySearchTree {
    binaryNode root;
    public binarySearchTree() {
        this.root = null;
    }

    private binaryNode insertNode(binaryNode currentNode , int value){
        if(currentNode == null){
            binaryNode node = new binaryNode();
            node.value = value;
            System.out.println("Inserted successfully");
            return node;
        }
        else if(value <= currentNode.value){
            currentNode.left = insertNode(currentNode.left , value);
            return currentNode;
        }
        else{
            currentNode.right = insertNode(currentNode.right , value);
            return currentNode;
        }
    }
    void insert(int value){
        root = insertNode(root, value);
    }

    void preorder(binaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    void inOrder(binaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
    void postOrder(binaryNode node){
        if (node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
    void levelOrder(){
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            binaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }
}

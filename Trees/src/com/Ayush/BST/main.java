package com.Ayush.BST;

public class main {
    public static void main(String[] args) {
        binarySearchTree BST  = new binarySearchTree();
        BST.insert(70);
        BST.insert(60);
        BST.insert(50);
        BST.insert(40);
        BST.insert(30);
        BST.insert(20);
        BST.insert(10);
        BST.insert(80);
        BST.insert(90);
        BST.preorder(BST.root);
        System.out.println();
        BST.inOrder(BST.root);
        System.out.println();
        BST.postOrder(BST.root);
        System.out.println();
        BST.levelOrder();
    }
}

package com.Ayush.BinaryTree;

import com.sun.source.tree.BinaryTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");
        binaryTree.insert("N10");

//        binaryTree.preOrder();
//        System.out.println();
//        binaryTree.inOrder();
//        System.out.println();
//        binaryTree.postOrder();
//        System.out.println();
//        binaryTree.levelOrder();

        binaryTree.levelOrder();
        binaryTree.delete("N7");
        System.out.println();
        binaryTree.levelOrder();
        List<String> list = binaryTree.preOrderIterative();
        System.out.println(list);


    }
}

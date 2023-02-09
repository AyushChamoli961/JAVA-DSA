package com.Ayush.BinaryTree;

import com.Ayush.TreeNode;

import java.util.*;

public class BinaryTreeLL {
    BinaryTreeNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    //Preorder Traversal

    //Recursive
    void preOrder(BinaryTreeNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Iterative

    List <String> preOrderIterative() {
        List<String> preOrder = new ArrayList<String>();
        if (root == null)
            return preOrder;
        Stack<BinaryTreeNode> st = new Stack<BinaryTreeNode>();
        st.push(root);
        while (!st.isEmpty()) {
            root = st.pop();
            preOrder.add(root.value);
            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }

        }
        return preOrder;
    }
    //Inorder Traversal
    void inOrder(BinaryTreeNode node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    //Post Order Traversal
    void postOrder(BinaryTreeNode node) {
        if (node == null)
            return;
        postOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");
    }

    //Level Order Traversal
    void levelOrder() {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    //Search an item in Tree
    BinaryTreeNode search(String item) {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode presentNode = queue.remove();
            if (presentNode.value == item) {
                return presentNode;
            } else {
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
            }
        }
        return null;
    }

    //Insert a value in tree
    void insert(String value) {
        BinaryTreeNode node = new BinaryTreeNode();
        node.value = value;
        if (root == null) {
            root = node;
            System.out.println("inserted successfully");
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = node;
                System.out.println("inserted successfully");
                return;
            } else if (presentNode.right == null) {
                presentNode.right = node;
                System.out.println("inserted successfully");
                return;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    BinaryTreeNode getDeepest() {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        BinaryTreeNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    void deleteDeepestNode() {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        BinaryTreeNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();

            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            }
            else if (presentNode.right == null) {
                queue.add(presentNode.left = null);
                return;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }

        }
    }

    void delete(String value) {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTreeNode presentNode = queue.remove();
            if(presentNode.value == value){
                presentNode.value = getDeepest().value;
                deleteDeepestNode();
                System.out.println("ELement deleted successfully");
                return;
            }
            else{
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("No such Element present");
    }

}

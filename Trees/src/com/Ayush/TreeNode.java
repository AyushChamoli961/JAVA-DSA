package com.Ayush;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }
    public void add(TreeNode node){
        this.children.add(node);
    }
    public String print (int level){
        String ans;
        ans = " ".repeat(level) + data + "\n";
        for(TreeNode node : this.children){
            ans += node.print(level + 1);
        }
        return ans;
    }
}

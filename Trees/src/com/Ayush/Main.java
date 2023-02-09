package com.Ayush;

public class Main {

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");

        TreeNode hot  = new TreeNode("Hot");
        TreeNode cold  = new TreeNode("Cold");

        TreeNode tea  = new TreeNode("Tee");
        TreeNode coffee  = new TreeNode("Coffee");
        TreeNode alcohol  = new TreeNode("Alcoholic");
        TreeNode nonAlcohol  = new TreeNode("Non-Alcoholic");

        drinks.add(hot);
        drinks.add(cold);

        hot.add(tea);
        hot.add(coffee);

        cold.add(alcohol);
        cold.add(nonAlcohol);


        System.out.println(drinks.print(0));



    }
}

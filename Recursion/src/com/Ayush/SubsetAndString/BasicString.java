package com.Ayush.SubsetAndString;

public class BasicString {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("baccappd"));
    }
//    Q1 str=baccad , ans=bccd that is you have to reamove a from string.
    static void Q1(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            Q1(p,up.substring(1));
        }
        else{
            Q1(p+ch,up.substring(1));
        }
    }
    static String q1(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return(q1(up.substring(1)));
        }
        else{
            return(ch+q1(up.substring(1)));
        }
    }
//    Q2 Remove a string eg-up="bcfappleien",p="bcfien"
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}

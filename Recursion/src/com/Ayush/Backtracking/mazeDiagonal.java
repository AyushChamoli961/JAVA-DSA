package com.Ayush.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class mazeDiagonal {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true,true},
                {true,false,true,false},
                {true,true,true,true}
        };
        List<String> ans = new ArrayList<>();
        pathWithObstacles("",0,maze,0);
        System.out.println(ans);
        path("",3,3);
    }
    static void path(String p, int r , int c){
        if (r == 1 && c==1) {
            System.out.println(p);
            return;
        }
        if(c>1 && r>1){
            path(p+"X",r-1,c-1);// X Stands for diagonal
        }
        if(r > 1){
            path(p+"D",r-1,c);
        }
        if(c > 1){
            path(p+"R",r , c-1);
        }

    }
    static List<String> pathList(String p , int r , int c){

        if (r == 1 && c==1) {
            List<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if(c>1 && r>1){
            ans.addAll(pathList(p+ "X" , r-1 , c-1));
        }
        if(r>1) {
            ans.addAll(pathList(p + "D", r-1, c));
        }
        if(c>1) {
            ans.addAll(pathList(p + "R", r , c-1));
        }

        return ans;
    }
    static void pathWithObstacles(String p, int r ,boolean[][] maze, int c){
        if(maze[r][c] == false){
            return;
        }
        if (r == maze.length -1 && c== maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(r < maze.length-1){
            pathWithObstacles(p+"D",r+1,maze,c);
        }
        if(c < maze[0].length-1){
            pathWithObstacles(p+"R",r , maze , c+1);
        }
        if(c<maze[0].length-1 && r<maze.length-1){
            pathWithObstacles(p+"X",r+1,maze,c+1);
        }
    }
}

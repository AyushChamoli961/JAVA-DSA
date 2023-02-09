package com.Ayush.Backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] arr = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        pathArray("",maze,0,0,arr,1);
    }
    static void pathBacktrack(String p, boolean[][] maze, int r , int c){
        if (r == maze.length -1 && c== maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        // mark every cell visited as false so that you can not go in reverse manner
        maze[r][c] =  false;

        if(r < maze.length-1 ){
            pathBacktrack(p+"D", maze , r+1 , c);
        }
        if(c < maze[0].length-1){
            pathBacktrack(p+"R", maze, r , c+1);
        }
        if(r>0){
            pathBacktrack(p+"U" , maze ,  r-1 , c);
        }
        if(c>0){
            pathBacktrack(p+"L", maze, r , c-1);
        }
        //at this point the function stack is getting emptied that is function calls are closing
        //at this point we mark all visited cells back to its original form
        //so that maze matrix is not modified for future function calls
        maze[r][c] =  true;

    }

    static void pathArray(String p, boolean[][] maze, int r , int c ,int[][] arr , int step){
        if (r == maze.length -1 && c== maze[0].length-1) {
            arr[r][c] = step;
            System.out.println(p);
            for (int[]nums:arr) {
                System.out.println(Arrays.toString(nums));
            }
            System.out.println();
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        // mark every cell visited as false so that you can not go in reverse manner
        maze[r][c] =  false;
        arr[r][c] = step;
        if(r < maze.length-1 ){
            pathArray(p+"D", maze , r+1 , c, arr , step+1);
        }
        if(c < maze[0].length-1){
            pathArray(p+"R", maze, r , c+1, arr , step+1);
        }
        if(r>0){
            pathArray(p+"U" , maze ,  r-1 , c, arr , step+1);
        }
        if(c>0){
            pathArray(p+"L", maze, r , c-1 , arr ,  step+1);
        }
        //at this point the function stack is getting emptied that is function calls are closing
        //at this point we mark all visited cells back to its original form
        //so that maze matrix is not modified for future function calls

        maze[r][c] =  true;
        arr[r][c] = 0;
    }
}

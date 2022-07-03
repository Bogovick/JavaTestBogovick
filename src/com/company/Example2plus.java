package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Example2plus {




//    public class Main {

        private static int IMAX = 10000; // Maximum value
        public static int[][] adjMat ={//Initializing an array of messages between cities with their cost
                {IMAX,1,3,IMAX},
                {1,IMAX,1,4},
                {3,1,IMAX,1},
                {IMAX,4,1,IMAX}
        };

       // public static void main(String[] args) {
       public static void Ex2() {
           System.out.println("Start = 1 ---- Finish = 4 ==== Shortest path = ");
           Dijkstra(adjMat, 0, 3);//The first city is counted from 0, the last n-1
           System.out.println("Start = 2 ---- Finish = 4 ==== Shortest path = ");
           Dijkstra(adjMat, 1, 3);

       }
        //}


        public static void Dijkstra(int[][] martix,int start,int terminal){
            boolean []isVisted = new boolean[martix.length];
            int []d = new int[martix.length];
            for (int i = 0;i<martix.length;i++){
                isVisted [i] = false; // Point visited
                d [i] = IMAX; // The shortest path from the starting point to this point among the paths that the current set can connect
            }
            isVisted[start] = true;//Visiting the starting point
            d[start] = 0;
            int unVisitNode = martix.length ;
            int index = start;
            while (unVisitNode > 0 && !isVisted[terminal] ){//Until the last point visited
                int min = IMAX;
                // Choose a point with the shortest path from a point in set A to set B
                for (int i = 0;i<d.length;i++){
                    if (min > d[i] && !isVisted[i]){//If you hit a point that has a connection and it has not yet been visited
                        index = i;
                        min = d[i];//Finding the cheapest route
                    }
                }


                for (int i = 0;i<martix.length;i++){
                    if (d [index] + martix [index] [i] <d [i]) // Update current shortest path
                        d[i] = d[index] + martix[index][i];
                }

                unVisitNode -- ;//Each pass we decrease the variable from the length of the array
                isVisted[index] = true;//Mark visited place
            }

            System.out.println(d[terminal]);
        }



//    }



//    public static void Ex2(int start, int end) {
//
//        int array[][] = {
//                {1, 2, 1, 0},
//                {1, 3, 3, 0},
//                {2, 1, 1, 0},
//                {2, 3, 1, 0},
//                {2, 4, 4, 0},
//                {3, 1, 3, 0},
//                {3, 2, 1, 0},
//                {3, 4, 1, 0},
//                {4, 2, 4, 0},
//                {4, 3, 1, 0}};
//
//        ArrayList find =new ArrayList();
//        boolean[] map = new boolean[5];
//        rec(array,1,start,end, find, map );
//    }
//
//    public static int rec(int [][] array, int next, int start, int end, ArrayList find, boolean[] map ){
//
//        for (int [] ar : array) {
//            if (next == ar[0]) {
//                if (ar[0] == start) {
//                    if (ar[3] == 0) {
//                        res ex = new res();
//                        ex.setN(String.valueOf(ar[0]));
//                        find.add(ex);
//                        System.out.println("-----s------");
//                        System.out.println(ar[0]);
//                        //map[ar[0]] = true;
//                        ar[3] = 1;
//                        rec(array, ar[1], start, end, find, map);
//                    }
//                } else if (ar[1] == end) {
//                    if (ar[3] == 0) {
//                        System.out.println(ar[1]);
//                        ar[3] = 1;
//                        //map[ar[1]] = true;
//                        find.add(map);
//                        //for (int i = 0; i < map.length; i++) {
//                            //map[i] = false;
//                        //}
////                    map[ar[0]] = true;
//                        System.out.println("-----f------");
//                        rec(array, 1, start, end, find, map);
//                        return next;
//                    }
//                } else {
//                    if (ar[1] != start & ar[1] != end & ar[1] != next ) {
//                        //if (map[ar[1]] == false) {
//                            if (ar[3] == 0) {
//                                System.out.println(ar[0]);
//                                ar[3] = 1;
//                               // map[ar[0]] = true;
//                                rec(array, ar[1], start, end, find, map);
//                            }
//                       // }
//                    }
//                }
//            }
//        }
//        return next;
//    }

}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Example2plus {




//    public class Main {

        private static int IMAX = 10000; // отключенное состояние
        public static int[][] adjMat ={
                {IMAX,1,3,IMAX},
                {1,IMAX,1,4},
                {3,1,IMAX,1},
                {IMAX,4,1,IMAX}
        };

       // public static void main(String[] args) {
       public static void Ex2() {
           Dijkstra(adjMat, 0, 3);
           Dijkstra(adjMat, 1, 3);
       }
        //}


        public static void Dijkstra(int[][] martix,int start,int terminal){
            boolean []isVisted = new boolean[martix.length];
            int []d = new int[martix.length];
            for (int i = 0;i<martix.length;i++){
                isVisted [i] = false; // Считается ли точка, можно понимать как оценку того, была ли точка добавлена ​​в набор B
                d [i] = IMAX; // Кратчайший путь от начальной точки до этой точки среди путей, которые текущий набор B может соединить
            }
            isVisted[start] = true;
            d[start] = 0;
            int unVisitNode = martix.length ;
            int index = start;
            while (unVisitNode > 0 && !isVisted[terminal] ){
                int min = IMAX;
                // Выбираем точку с кратчайшим путем от точки в множестве A до множества B
                for (int i = 0;i<d.length;i++){
                    if (min > d[i] && !isVisted[i]){
                        index = i;
                        min = d[i];
                    }
                }


                for (int i = 0;i<martix.length;i++){
                    if (d [index] + martix [index] [i] <d [i]) // Обновляем текущий кратчайший путь
                        d[i] = d[index] + martix[index][i];
                }

                unVisitNode -- ;
                isVisted[index] = true;
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

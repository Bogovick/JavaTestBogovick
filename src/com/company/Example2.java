package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {

//    protected static void Ex2(int start, int end) {
//
//        int array [][] = {
//                {1,2,1},
//                {1,3,3},
//                {2,1,1},
//                {2,3,1},
//                {2,4,4},
//                {3,1,3},
//                {3,2,1},
//                {3,4,1},
//                {4,2,4},
//                {4,3,1}};
//
//        for (int [] an : array) {
//            int next = 0;
//            int summa = 0;
//            boolean first = true;
//            boolean last [][]  = new boolean [5][5];
//            for (int[] ar : array) {
//                if (ar[0] == start & first == true) {
//                    if (ar[1] == end) {
//                        System.out.println("Way summ = " + ar[2] + " " + ar[0] + "-" + ar[1]);
//                        first = true;
//                        continue;
//                    } else {
//                        next = ar[1];
//                        for (int i = 0; i < 4; i++) {
//                            last[start][i] = true;
//                            last[i][start] = true;
//                        }
////                    last[start][next] = true;
////                    last[next][start] = true;
//
//                        summa = summa + ar[2];
//                        first = false;
//                        System.out.println("Start");
//                        System.out.println(ar[0]);
//                        continue;
//                    }
//                }
//                if (ar[0] == next) {
//                    if (ar[1] == end) {
//                        System.out.println(end);
//                        first = true;
//                        for (int i = 0; i < 4; i++) {
//                            last[end][i] = true;
//                            last[i][end] = true;
//                        }
////                    last[next][end] = true;
////                    last[end][next] = true;
//                        System.out.println("End");
//                        System.out.println("---------------------------------------");
//                        continue;
//                    }
//                    if (last[next][ar[1]] == true) {
//                        continue;
//                    }
//                    if (last[ar[1]][next] == true) {
//                        continue;
//                    }
//                    for (int i = 0; i < 4; i++) {
//                        last[ar[1]][i] = true;
//                        last[i][ar[1]] = true;
//                    }
////                last[ar[1]][next] = true;
////                last[next][ar[1]] = true;
//                    next = ar[1];
//                    summa = summa + ar[2];
//                    first = false;
//                    System.out.println(ar[0]);
//                    continue;
//                }
//            }
//        }
//    }
//
//}

//    private static int[][] results;
//    private static int memo [];
//    protected static void Ex2(){
//
//        int array [][] = {
//                {1,2,1},
//                {1,3,3},
//                {2,1,1},
//                {2,3,1},
//                {2,4,4},
//                {3,1,3},
//                {3,2,1},
//                {3,4,1},
//                {4,2,4},
//                {4,3,1}};
//
//        int Sstart = 1;
//        int Ffinish = 4;
//        boolean StartTrue = false;
//        boolean wayon[][] =new boolean[10][3];
//        ArrayList lastWay  = new ArrayList();
//        int way = 1;
//        int t = 0;
//        int count = 0;
//        for (int k = 0; k < 10 ; k++) {
//            lastWay.clear();
//            StartTrue = false;
//            for (int i = 0; i < 10; i++) {
//
//    //            for (int j = 0; j < 3; j++) {
//                if(Ffinish != array[i][0]) {
//                    if (array[i][0] == t || StartTrue == false) {
//                        if (!lastWay.contains(array[i][0])) {
//                            if (array[i][0] == Sstart) {
//                                wayon[i][0] = true;
//                                StartTrue = true;
//                            } else if (StartTrue = false) {
//                                break;
//                            }
//                            if (wayon[i][0] == false || array[i][0] == Sstart) {
//                                count = count + array[i][2];
//                                //                    i = array[i][1] - 1;
//                                //                    break;
//                                t = array[i][1];
//                                wayon[i][0] = true;
//                                lastWay.add(array[i][0]);
//                            }
//                        }
//                    }
//                }
//    //            }
//            }
//        System.out.println("Way " + way + " = " + count);
//            count = 0;
//            way = way + 1;
//        }


    //////////////////////////////////////////////////////////////////////////////////////////

    protected static void Ex2() {
//         ????
// ?????? ???????? ????????????, ?????? ?????? ??????????, ??????????

//        dsfsdf(1, 4);
        fdgdfg(1, 4);

    }

    private static void fdgdfg(int d, int z) {
        int one[][] = {
                {1, 2, 1},
                {1, 3, 3},
                {2, 1, 1},
                {2, 3, 1},
                {2, 4, 4},
                {3, 1, 3},
                {3, 2, 1},
                {3, 4, 1},
                {4, 2, 4},
                {4, 3, 1}};
        int summa = 0;
//        int f [];
        ArrayList f =new ArrayList();
        summa = 0;
//    # ?????????? ?? ?????????????? ????????
        for (int[] i : one) {

            if (i[0] == d) {
                summa = i[2];
                f.add("new");
                f.add(i[0]);
                f.add(i[1]);
                summa = i[2];
            }
            if (i[1] == z){
                continue;
            }
//            System.out.println("?????? ????????????: "+ " ?????????? "+ i[2]+ " ??????????: "+ i[0]+ " ??????????: "+ i[1]);
            for (int dsf [] : one) {

                if (dsf[0] == i[1] & dsf[1] !=d & dsf[1] != z){
//                    System.out.println("?????? ????????????: "+ " ?????????? "+ summa+ " ??????????: "+ i[0]+ " ??????????: "+ i[1]+ " ??????????: "+ dsf[1]);
                    f.add(dsf[1]);
                    summa = summa + dsf[2];

                }
                boolean x = false;
                for (int [] dfgdf : one){
//                    if (f.findAny(dfgdf[1]))
                    if (dfgdf[0] == dsf[1] & dfgdf[1] ==z & dfgdf[1] != d & x == false) {
                        f.add(dfgdf[1]);
                        summa += dfgdf[2];
                        System.out.println(f);
                        System.out.println(summa);

    //                    System.out.println("???????????? ????????????: "+ " ?????????? "+ summa + " ??????????: "+ f.get(0)+ " ??????????: "+ f.get(1) + " ??????????: "+ f.get(2)+ " ??????????: "+ f.get(3));
                        System.out.println("----------------------------------------------------------------");
                        x = true;
                    }else if (dfgdf[0] == dsf[1] & dfgdf[1] ==z & dfgdf[1] != d & x == true){
                        f.add("new");
                        f.add(i[0]);
                        f.add(i[1]);
                        summa = i[2];

                        f.add(dsf[1]);

                        f.add(dfgdf[1]);
                        summa += dfgdf[2];
                        System.out.println(f);
                        System.out.println(summa);

                        //                    System.out.println("???????????? ????????????: "+ " ?????????? "+ summa + " ??????????: "+ f.get(0)+ " ??????????: "+ f.get(1) + " ??????????: "+ f.get(2)+ " ??????????: "+ f.get(3));
                        System.out.println("----------------------------------------------------------------");
                    }
                }
            }
        }

    }

    //        def dsfsdf (d,z):
    protected static void dsfsdf(int d,int z) {
        int one[][] = {
                {1, 2, 1},
                {1, 3, 3},
                {2, 1, 1},
                {2, 3, 1},
                {2, 4, 4},
                {3, 1, 3},
                {3, 2, 1},
                {3, 4, 1},
                {4, 2, 4},
                {4, 3, 1}};
        int summa = 0;
        int f[];
    //    # ?????????? ?? ?????????????? ????????
    //    for i in one:
        for (int[] i : one) {
            if (i[0] == d) {
                if (i[1] == z) {
                    String a = String.valueOf(i[2]);
                    String b = String.valueOf(i[0]);
                    String c = String.valueOf(i[1]);
                    System.out.println("?????? ????????????: " + " ?????????? " + a + " ??????????: " + b + " ??????????: " + c);
                    System.out.println("----------------------------------------------------------------");
                    continue;
                } else {
    //                #?????????? ???? ?????????????? ????????
                    for (int[] vtor : one) {
                        if (vtor[0] == i[1]) {
                            summa = i[2];
                        }
                        if (vtor[1] == z) {
                            summa += vtor[2];
    //                                        f.add("new");
    //                                        f.add(summa);
    //                                        f.add(i[0]);
    //                                        f.add(i[1]);
    //                                        f.add(vtor[1]);
                            System.out.println("?????? ????????????: " + " ?????????? " + summa + " ??????????: " + i[0] + " ??????????: " + i[1] + " ??????????:" + vtor[1]);
    //                                        System.out.println(f);
                            System.out.println("----------------------------------------------------------------");
                        }
                    }
                }
            }
        }
    }
}
//    def fdgdfg (d, z):
//    protected static void fdgdfg(int d, int z){
//        summa = 0
//        f =[]
//        summa = 0
////    # ?????????? ?? ?????????????? ????????
//        for i in one:
//        if i[0] == d:
//        summa = i[2]
//        f.append("new")
//        f.append(i[0])
//        f.append(i[1])
//        summa = i[2]
//        if i[1] == z:continue
//                #print("?????? ????????????:", "??????????", i[2], "??????????:", i[0], "??????????:", i[1])
//        for dsf in one:
//        if dsf[0] == i[1] and dsf[ 1] !=d and dsf[1] != z:
//                        #print("?????? ????????????:", "??????????", summa, "??????????:", i[0], "??????????:", i[1], "??????????:", vtor[1])
//        f.append(dsf[1])
//        summa += dsf[2]
//        for dfgdf in one:
//        if dfgdf[0] == dsf[1] and dfgdf[ 1] ==z and dfgdf[1] != d:
//        f.append(dfgdf[1])
//        summa += dfgdf[2]
//        print(f)
//        print(summa)
////                                #
//        print("???????????? ????????????:", "??????????", summa, "??????????:", f[0], "??????????:", f[1], "??????????:", f[2], "??????????:", f[3])
//        print("---" * 10)
//
//    }
//
//
//
//        }
//#dsfsdf(1, 4)
//    fdgdfg(1, 4)





///         ????
//    // ?????? ???????? ????????????, ?????? ?????? ??????????, ??????????
//    int one [][] = {
//            {1,2,1},
//            {1,3,3},
//            {2,1,1},
//            {2,3,1},
//            {2,4,4},
//            {3,1,3},
//            {3,2,1},
//            {3,4,1},
//            {4,2,4},
//            {4,3,1}};
//
//
//
//    def dsfsdf (d,z):
//    summa = 0
//    f=[]
//            # ?????????? ?? ?????????????? ????????
//        for i in one:
//            if i[0] == d:
//            if i[1] == z:
//    print("?????? ????????????:","??????????", i[2], "??????????:", i[0], "??????????:",i[1])
//    print("---"*10)
//        continue
//                else:
//                # ?????????? ???? ?????????????? ????????
//        for vtor in one:
//            if vtor[0] == i[1]:
//    summa = i[2]
//            if vtor[1] == z:
//    summa += vtor[2]
//            # f.append("new")
//            # f.append(summa)
//            # f.append(i[0])
//            # f.append(i[1])
//            # f.append(vtor[1])
//    print("?????? ????????????:","??????????", summa, "??????????:", i[0], "??????????:",i[1], "??????????:",vtor[1])
//                                # print(f)
//    print("---"*10)
//
//    def fdgdfg (d,z):
//    summa = 0
//    f=[]
//    summa = 0
//            # ?????????? ?? ?????????????? ????????
//        for i in one:
//            if i[0] == d:
//    summa = i[2]
//            f.append("new")
//            f.append(i[0])
//            f.append(i[1])
//    summa = i[2]
//            if i[1] == z: continue
//            # print("?????? ????????????:","??????????", i[2], "??????????:", i[0], "??????????:",i[1])
//        for dsf in one:
//            if dsf[0] == i[1] and dsf[1] != d and dsf[1] != z:
//            # print("?????? ????????????:","??????????", summa, "??????????:", i[0], "??????????:",i[1], "??????????:",vtor[1])
//        f.append(dsf[1])
//    summa += dsf[2]
//            for dfgdf in one:
//            if dfgdf[0] == dsf[1] and dfgdf[1] == z and dfgdf[1] !=d:
//            f.append(dfgdf[1])
//    summa += dfgdf[2]
//    print(f)
//    print(summa)
//                                # print("???????????? ????????????:","??????????", summa, "??????????:", f[0], "??????????:",f[1], "??????????:",f[2], "??????????:",f[3])
//    print("---" * 10)
//
//
//
//
//
//
//# dsfsdf(1,4)
//    fdgdfg(1,4)
//
//




////////////////////////////////////////////////////////////////////////////////////////////
//        int array [][] = {
//                {0,1,3,0},
//                {1,0,1,4},
//                {3,1,0,1},
//                {0,4,1,0}};
//
//        boolean wayon[][] =new boolean[4][4];
//        int temp = 0;
//        int tempk = 0;
//        int counti = 0;
//        for (int i = 0; i < 4; i++) {
////            if (counti<= i) {
////                int count = 0;
//            temp = 0;
//            tempk = 0;
//                for (int j = 0; j < 4; ) {
////                    temp = 0;
//                    if (j >=4){
//                        j = 0;
//                        break;
//                    }
//                    for (int k = tempk; k < 4;k = tempk) {
//                        //if (count <= k) {
//                            if (array[j][k] != 0) {
//
//                                if (j == i){
//                                    counti = counti + 1;
//                                }
////                                count = count + 1;
//                                if (wayon[j][k] == false){
//
//                                    System.out.println(array[j][k]);
//
//                                    wayon[j][k] = true;
//
////                                    if ( k > j) {
//                                        temp = 0;
//                                        temp = j;
//                                        j = k;
////                                        k = 0;
//                                        tempk = temp+1;
//
////                                    }
//
//
////                                    j = j+1;
//                                    break;
//                                }
////                                System.out.println(array[j][k]);
////                                j = k;
////                                break;
//                            }else {
//                                tempk = k + 1;
//                                if (tempk > 4){
//                                    tempk = 0;
//                                    j = j + 1;
//                                    break;
//                                }
//                            }
//
//                        //}
//                    }
//
//                }
////            }
//            System.out.println("-------------------------------------------------");
//        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        // ?????????????? ?? ???????????????????????? ?????????? ????????????????
//        int towns [][] =  {
//                {0,1,3,0},
//                {1,0,1,4},
//                {3,1,0,1},
//                {0,4,1,0}};
//// ???????????????????? ?????????? ???????????????? ????????????????
//        int counter = 0;
//
//// ?????????? ???????????????? ???????? ??? ?????????? ???????????? ???????????????? ??????????????, ?????????? ?????????????????? ?????? ???? ???????? ???????????? ??????????????????
//        int minPath = 10000;
//
//// ?????????? ???????????? ?????????????????? ????????????????
//        int minCounter = 0;
//
//        // ???????????? ?????? ?????????????????????? ????????????????????????
//        //int results [][];
//// ???????????? ??????????????
//        int cities [] = {1,2,3,4};
//// ?????????? ???????????????? ????????
//        int path;
//// ?????????????????????????????? ????????????????????
//        int p1, p2;
//
//// ???????????????? ?????? ???????????????????????? ??????????????
//// ???????????????????? ?????????? ?????????????????? ?? ?????????????? results
//
//
//
//       results = permute(cities);
//        // ???????????????????? ?????? ???????????????? ????????????????????????
//        for (int i =0; i < results.length; i++) {
//            // ???????????????? ?????????? ???????????????? ????????????????
//            path = 0;
//            // ???????????????? ???? ?????????????? ???????????? ?? ?????????????? ???????????????? ????????
//            for (int j = 1; j < cities.length; j++) {
//                // ?????????????? ?????????????????? ???????? ??????????????
//                // ???????????????? ??????????????, ???????????? ?????? ?? ?????????????? towns ?????????????????? ?????????? ???????????????????? ?? ????????, ?? ???? ?? ??????????????
//                p1 = results[i][j-1] - 1;
//                p2 = results[i][j] - 1;
//
//                // ???????????????????? ?????? ?? ?????????? ?????????? ???????????????? ????????????????
//                path = path + towns[p1][p2];
//            }
//
//            // ???????? ???? ?????????? ?????????????? ????????????, ?????? ?????? ???? ??????????
//            if (path < minPath) {
//                // ????????????????????, ?????????? ?????? ?????????? ?? ??????????????????????????
//                minCounter = i;
//                // ?????????????????? ?????????????????????? ?????????? ????????????????
//                minPath = path;
//            }
//        }
//
//// ?????????????? ?????????? ???????????????? ??????????????
//        System.out.println(results[minCounter]);
//    }
//    // ?????????????????????? ??????????????
//// ???? ???????? ???????????????? ?????????????? ???????????? ?? ???????????? ?? ?????????????? ???????????????????? ????????????????????
//    public static int [][] permute(int [] arr, int memo []) {
//        // ???????????????????? ?????? ???????????????? ?????????????????? ??????????????
//        int cur;
//
//        // ???????????? ???????????????????? ?????? ???????????????? ?????????????????????????? ??????????????????????
//        // ?? ???????????????????????????????? ?????? ???????????????????? ????????????????????????
////        int memo []= memo;
//        memo = memo;
//        // ?????????? ???????????? ???????????????? ?????????????? ??? ?????????? ?????????? ?? ???????????? ????????, ?????????? ?????????????????? ?????? ????????????????
//        for (int i = 0; i < arr.length; i++) {
//
//            // ???????????????? ?????????? ???????????? cur, ???????????? ???? ???????????????? ?????????????? ???????? ??????????????, ?????????????? ?? ?????????????? ??????????????
//            // ?????? ???????? ???? ???????????????? ?????????????? ???????? ?????????????? ???????? ????????????????
//            cur = arr.splice(i, 1);
//
//            // ???????? ???? ???????????????? ?????????????? ???????????? ???? ????????????????
//            if (arr.length === 0) {
//                // ???? ?????????????????????? ?????????????? ???????????????? ?????????????? ?? ????????????????, ?????????????? ?????????? ?? ????????????,
//                // ?? ?????????????????? ???????????????????????? ?????????????????? ?? ???????????????? ????????????
//                results.push(memo.concat(cur));
//            }
//
//            // ???????????????? ?????????? ?????????? ????????????????
//            // ?? ???????????????? ???????????????????? ???????????????? ?????????? ?????????????????? ?????????????? ?? ?????????????????? ?? ???????? ???????????? ????, ?????? ???????????????????? ?????????? ???????????????? ???????????? ?????????????? ???? ?????????????????? ??????????????
//            permute(arr.slice(), memo.concat(cur));
//
//            // ???????????????????? ?? ???????????????? ???????????? ???????????? ?????????????? ???? ???????????? ??????????????, ???? ?????? ???? ???????????? ??????????????
//            arr.splice(i, 0, cur[0]);
//        }
//
//        // ???????????????????? ?????????????? ???????????? ?? ???????????????????????? ????????????????????????
//        return results;
//    }
//}

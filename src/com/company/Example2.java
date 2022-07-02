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
//         БД
// Ном перв города, ном кон город, сумма

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
//    # Поиск с первого раза
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
//            System.out.println("Два города: "+ " Сумма "+ i[2]+ " Город: "+ i[0]+ " Город: "+ i[1]);
            for (int dsf [] : one) {

                if (dsf[0] == i[1] & dsf[1] !=d & dsf[1] != z){
//                    System.out.println("Три города: "+ " Сумма "+ summa+ " Город: "+ i[0]+ " Город: "+ i[1]+ " Город: "+ dsf[1]);
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

    //                    System.out.println("Четыре города: "+ " Сумма "+ summa + " Город: "+ f.get(0)+ " Город: "+ f.get(1) + " Город: "+ f.get(2)+ " Город: "+ f.get(3));
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

                        //                    System.out.println("Четыре города: "+ " Сумма "+ summa + " Город: "+ f.get(0)+ " Город: "+ f.get(1) + " Город: "+ f.get(2)+ " Город: "+ f.get(3));
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
    //    # Поиск с первого раза
    //    for i in one:
        for (int[] i : one) {
            if (i[0] == d) {
                if (i[1] == z) {
                    String a = String.valueOf(i[2]);
                    String b = String.valueOf(i[0]);
                    String c = String.valueOf(i[1]);
                    System.out.println("Два города: " + " Сумма " + a + " Город: " + b + " Город: " + c);
                    System.out.println("----------------------------------------------------------------");
                    continue;
                } else {
    //                #Поиск со второго раза
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
                            System.out.println("Три города: " + " Сумма " + summa + " Город: " + i[0] + " Город: " + i[1] + " Город:" + vtor[1]);
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
////    # Поиск с первого раза
//        for i in one:
//        if i[0] == d:
//        summa = i[2]
//        f.append("new")
//        f.append(i[0])
//        f.append(i[1])
//        summa = i[2]
//        if i[1] == z:continue
//                #print("Два города:", "Сумма", i[2], "Город:", i[0], "Город:", i[1])
//        for dsf in one:
//        if dsf[0] == i[1] and dsf[ 1] !=d and dsf[1] != z:
//                        #print("Три города:", "Сумма", summa, "Город:", i[0], "Город:", i[1], "Город:", vtor[1])
//        f.append(dsf[1])
//        summa += dsf[2]
//        for dfgdf in one:
//        if dfgdf[0] == dsf[1] and dfgdf[ 1] ==z and dfgdf[1] != d:
//        f.append(dfgdf[1])
//        summa += dfgdf[2]
//        print(f)
//        print(summa)
////                                #
//        print("Четыре города:", "Сумма", summa, "Город:", f[0], "Город:", f[1], "Город:", f[2], "Город:", f[3])
//        print("---" * 10)
//
//    }
//
//
//
//        }
//#dsfsdf(1, 4)
//    fdgdfg(1, 4)





///         БД
//    // Ном перв города, ном кон город, сумма
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
//            # Поиск с первого раза
//        for i in one:
//            if i[0] == d:
//            if i[1] == z:
//    print("Два города:","Сумма", i[2], "Город:", i[0], "Город:",i[1])
//    print("---"*10)
//        continue
//                else:
//                # Поиск со второго раза
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
//    print("Три города:","Сумма", summa, "Город:", i[0], "Город:",i[1], "Город:",vtor[1])
//                                # print(f)
//    print("---"*10)
//
//    def fdgdfg (d,z):
//    summa = 0
//    f=[]
//    summa = 0
//            # Поиск с первого раза
//        for i in one:
//            if i[0] == d:
//    summa = i[2]
//            f.append("new")
//            f.append(i[0])
//            f.append(i[1])
//    summa = i[2]
//            if i[1] == z: continue
//            # print("Два города:","Сумма", i[2], "Город:", i[0], "Город:",i[1])
//        for dsf in one:
//            if dsf[0] == i[1] and dsf[1] != d and dsf[1] != z:
//            # print("Три города:","Сумма", summa, "Город:", i[0], "Город:",i[1], "Город:",vtor[1])
//        f.append(dsf[1])
//    summa += dsf[2]
//            for dfgdf in one:
//            if dfgdf[0] == dsf[1] and dfgdf[1] == z and dfgdf[1] !=d:
//            f.append(dfgdf[1])
//    summa += dfgdf[2]
//    print(f)
//    print(summa)
//                                # print("Четыре города:","Сумма", summa, "Город:", f[0], "Город:",f[1], "Город:",f[2], "Город:",f[3])
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
//        // таблица с расстояниями между городами
//        int towns [][] =  {
//                {0,1,3,0},
//                {1,0,1,4},
//                {3,1,0,1},
//                {0,4,1,0}};
//// порядковый номер текущего маршрута
//        int counter = 0;
//
//// самый короткий путь — сразу ставим заведомо большим, чтобы уменьшать его по мере работы алгоритма
//        int minPath = 10000;
//
//// номер самого короткого маршрута
//        int minCounter = 0;
//
//        // массив для результатов перестановок
//        //int results [][];
//// номера городов
//        int cities [] = {1,2,3,4};
//// самый короткий путь
//        int path;
//// вспомогательные переменные
//        int p1, p2;
//
//// получаем все перестановки городов
//// результаты будут храниться в массиве results
//
//
//
//       results = permute(cities);
//        // перебираем все варианты перестановок
//        for (int i =0; i < results.length; i++) {
//            // обнуляем длину текущего маршрута
//            path = 0;
//            // проходим по каждому городу в текущем варианте пути
//            for (int j = 1; j < cities.length; j++) {
//                // достаём очередную пару городов
//                // отнимаем единицу, потому что в массиве towns нумерация ячеек начинается с нуля, а не с единицы
//                p1 = results[i][j-1] - 1;
//                p2 = results[i][j] - 1;
//
//                // прибавляем это к общей длине текущего маршрута
//                path = path + towns[p1][p2];
//            }
//
//            // если мы нашли маршрут короче, чем был до этого
//            if (path < minPath) {
//                // запоминаем, какой это номер в перестановках
//                minCounter = i;
//                // обновляем минимальную длину маршрута
//                minPath = path;
//            }
//        }
//
//// выводим самый короткий маршрут
//        System.out.println(results[minCounter]);
//    }
//    // рекурсивная функция
//// на вход получаем текущий массив и массив с памятью предыдущих вычислений
//    public static int [][] permute(int [] arr, int memo []) {
//        // переменная для хранения фрагмента массива
//        int cur;
//
//        // делаем переменную для хранения промежуточных результатов
//        // в программировании это называется «мемоизация»
////        int memo []= memo;
//        memo = memo;
//        // какой размер входного массива — такой длины и делаем цикл, чтобы перебрать все элементы
//        for (int i = 0; i < arr.length; i++) {
//
//            // получаем новый массив cur, удаляя из входного массива один элемент, начиная с текущей позиции
//            // при этом из входного массива этот элемент тоже удалится
//            cur = arr.splice(i, 1);
//
//            // если от входного массива ничего не осталось
//            if (arr.length === 0) {
//                // то приклеиваем текущее значение нарезки к варианту, который лежит в памяти,
//                // и добавляем получившийся результат в итоговый массив
//                results.push(memo.concat(cur));
//            }
//
//            // вызываем новый виток рекурсии
//            // в качестве аргументов передаём копию входящего массива и добавляем к кешу памяти то, что получилось после удаления одного символа из входящего массива
//            permute(arr.slice(), memo.concat(cur));
//
//            // возвращаем в исходный массив первый элемент из нового массива, но уже на другую позицию
//            arr.splice(i, 0, cur[0]);
//        }
//
//        // возвращаем обратно массив с результатами перестановок
//        return results;
//    }
//}

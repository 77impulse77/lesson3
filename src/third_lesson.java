
/*

8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
(на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.
 */



//1 С помощью цикла и условия заменить 0 на 1, 1 на 0;

import java.util.Arrays;

public class third_lesson {
    public static void main(String[] agrs) {
//1
        System.out.println(" ");
        System.out.println("___________Задание___первое___________");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        fillArr1(arr);
        System.out.println(Arrays.toString(arr));

//2
        System.out.println(" ");
        System.out.println("___________Задание___два______________");
        int[] array;
        array = new int[20];
        fillArray2(array);
        System.out.println(Arrays.toString(array));

//3
        System.out.println(" ");
        System.out.println("___________Задание___три_______________");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        fillArr3(arr3);
        System.out.println(Arrays.toString(arr3));

//4
        System.out.println(" ");
        System.out.println("___________Задание___четыре___________");
        int[][] doubleArr = new int[4][4];
        fillArr4(doubleArr);
//5

        System.out.println(" ");
        System.out.println("___________Задание___пять_____________");
        int[] vvod = fillArr5(12, 5);
        System.out.println(Arrays.toString(vvod));

//6
        System.out.println(" ");
        System.out.println("___________Задание___шесть____________");
        int[] arr6 = {3, 5, 3, 2, 15, 4, 5, 2, 4, 8, 6, 17};
        fillArr6(arr6);

//7
        System.out.println(" ");
        System.out.println("___________Задание___семь____________");
        int[] arr7 = {2, 4, 6, 4, 8, 6, 1, 3, 5, 9, 7, 13};
        fillArr7(arr7);
        System.out.println(Arrays.toString(arr7));
        boolean flag = fillArr7(arr7);
        System.out.println(flag);

    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    public static void fillArr1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }


// 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void fillArray2(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (i);
        }
    }
// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void fillArr3(int[] arr3) {

        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
    }
//  4.    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void fillArr4(int[][] doubleArr) {
        int n = doubleArr.length;
               for (int i = 0; i < doubleArr.length; i++)   {
                     for (int j = 0; j < doubleArr[i].length; j++) {
                         doubleArr[i][j] = 2;
                         if (i == j) {doubleArr[i][j] = 1;}
                         if (i == n-j-1) {doubleArr[i][j] = 1;}
            }
        }
                for (int i = 0; i < doubleArr.length; i++){
            System.out.println(Arrays.toString(doubleArr[i]));
       }
    }
//5 Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
// типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] fillArr5(int len, int initialValue) {
        int[] vvod;
        vvod = new int[len];
         for (int i = 0; i < vvod.length; i++) {
               vvod[i] = initialValue;
        }
            return vvod;
    }

// 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void fillArr6(int[] arr6) {
        int min = arr6[0];
        int max = arr6[0];
        for (int i = 0; i < arr6.length; i++) {
            if (min > arr6[i]) min = arr6[i];
            if (max < arr6[i]) max = arr6[i];
        }
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println(Arrays.toString(arr6));
        }

// 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
//**Примеры:
//checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

//граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

    public static boolean fillArr7(int[] arr7){
        int sum = 0;
        int L = 0;
        for (int i = 0; i < arr7.length; i++) {
            sum = sum + arr7[i];
        }
        System.out.println("Сумма чисел массива равна = " + sum);

        for (int i = 0; i < arr7.length; i++ ) {
            L += arr7[i];
            if( L == sum - L)
            {
                return true;
            }
        }
        return false;


    }
//8 не осилил!

}


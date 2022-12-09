// import java.util.Random;
import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
import java.util.Scanner;

/**
 * // | 4. а) Метод, создания массива
 * // | create(int) -> int[]
 * // | б) Метод печати
 * // | print(int[]) -> void
 * // | print(int[]) -> string
 * // | в1) Метод заполнения случайными числами
 * // | fill(int[]) -> void
 * // | в2) Метод заполнения числами считывая от пользователя
 * // | в3) Метод заполнения числами, которые хранятся в файле
 * // |
 * // | г) считывания количества элементов от пользователя
 * // | (void) -> int
 * // | (string) -> int
 */
public class program {

    public static void main(String[] args) {    // Точка входа. Отвечает за последовательность алгоритма.
        int size = getValue("Введите длину массива: ");
        int[] arr1 = create(size);
        fill(arr1);
        System.out.print ("Начальный массив");
        print(arr1);
        int[] uniqueValue = uniqueValue(arr1);
        System.out.print ("Конечный массив"); // Выводим все значения из массива которые не равны -1
        print(uniqueValue);
        int[] arrCount = arrCount(arr1);
        System.out.print ("Количество повторений"); // Выводим массив с кол-вом повторений
        print(arrCount);
    }


    static int getValue(String text) {      //Отвечает за прием длины от пользователя
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println(text);
        int size = input.nextInt();         // Читаем с клавиатуры размер массива и записываем в size
        return size;

    }

    static int[] create(int count) {        //Отвечает за создание массива заданной длины
        int array[] = new int[count]; 
        return array; 
    }

    static void fill(int[] array) {             //Отвечает за заполнение массива
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {   
            array[i] = input.nextInt();         // Заполняем массив элементами, введёнными с клавиатуры
        }
    }
    
    static void print(int[] array) {            // Отвечает за вывод
        for (int i = 0; i < array.length; i++) {
            // if (array[i] != -1)
            System.out.print (" " + array[i]);      // Выводим на экран, полученный массив
        }
        System.out.println();
    }

    static int[] uniqueValue(int[] arr1) {            // Отвечает за перебор элементов в массиве и создание массива без повторов  
        int uniqueArray[] = arr1;
        for (int i = 0; i < arr1.length; i++) {  // Пробегает по первому массиву
            for (int j = i + 1; j < arr1.length; j++) { // Пробегает по первому массиву со сдвигом на + 1
                if (arr1[i] == arr1[j]) {
                    uniqueArray[j] = -1;     // Массив в котором повторные значения равны -1
                }
            }
        }
        return uniqueArray;
    }

    private static int[] arrCount(int[] arr1) {
        int arrCount[] = arr1;
        Integer count = 1;
        for (int i = 0; i < arr1.length; i++) {  // Пробегает по первому массиву
            for (int j = i + 1; j < arr1.length; j++) { // Пробегает по первому массиву со сдвигом на + 1
                if (arr1[i] == arr1[j]) {
                    count++;
                    // System.out.print (i + "принт " + count);
                    // System.out.println();
                    arrCount[i] = -1;
                    // arrCount[i] = count;

                }
                // if (j == arr1.length) {
                arrCount[i] = count;
                // }

            }
        }
        return arrCount;
    }
}

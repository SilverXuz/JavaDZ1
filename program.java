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
        int[] uniqueArray = arr1;
        fill(arr1);
        System.out.print ("Начальный массив");
        print(arr1);
        // ArrayList<Integer> uniqueArray = new ArrayList<Integer>();
        // ArrayList<Integer> uniqueArray = new ArrayList<>();
        uniqueValue(arr1, uniqueArray);
        // int[] arr2 = {};
        // uniqueValue(arr1, arr2);
        // print(arr2);
        // print(arr2);

    }


    static int getValue(String text) {      //Отвечает за прием длины от пользователя
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
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
            System.out.print (" " + array[i]);      // Выводим на экран, полученный массив
        }
        System.out.println();
    }

    static void uniqueValue(int[] arr1, int[] uniqueArray) {            // Отвечает за перебор элементов в массиве и создание массива без повторов  
        ArrayList<Integer> arrCount = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {  // Пробегает по первому массиву
            int count = 1;
            for (int j = i + 1; j < arr1.length; j++) { // Пробегает по первому массиву со сдвигом на + 1
                if (arr1[j] == arr1[i]) {
                    count = count + 1;
                    uniqueArray[j] = -1;     // Массив в котором повторные значения равны -1
                }
            }
            if (uniqueArray[i] != -1) {
                arrCount.add(i, count);      // Массив который будет хранить список повторений по всем числа по порядку
            }
        }
        System.out.println();
        System.out.print ("Конечный массив");
        for (int i = 0; i < uniqueArray.length; i++) {
            if (uniqueArray[i] != -1)
                System.out.print (" " + uniqueArray[i]);  // Выводим все значения из массива которые не равны -1
        }
        System.out.println();
        System.out.print ("Количество повторений");
        for (int i = 0; i < arrCount.size(); i++) {
            System.out.print (" " + arrCount.get(i));   // Выводим массив с кол-вом повторений
        }
        // return new Arrays(arrCount, arr2);
    }
}

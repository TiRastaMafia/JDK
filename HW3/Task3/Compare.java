package HW3.Task3;

import java.util.Arrays;

//    Напишите обобщенный метод compareArrays(), который принимает два массива и
//            возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть
//            любого типа данных, но должны иметь одинаковую длину и содержать элементы одного
//            типа.
public class Compare {
    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String[] arr1 =  new String[] { "767", "568", "555", "897", "678" };
        String[] arr2 =  new String[] { "767", "568", "555", "897", "678" };

        System.out.println(compareArrays(arr1, arr2));

        Integer[] arr3 =  new Integer[] { 111, 222, 333, 444, 555 };
        Integer[] arr4 =  new Integer[] { 111, 333, 333, 444, 555 };

        System.out.println(compareArrays(arr3, arr4));
    }

}
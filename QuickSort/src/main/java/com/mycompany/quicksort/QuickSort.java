package com.mycompany.quicksort;
import java.util.Scanner;
public class QuickSort {

    public static void quick_sort(int[] array, int left, int right) {
        if (left < right) {
            int q = position(array, left, right);
            quick_sort(array, left, q - 1);
            quick_sort(array, q + 1, right);
        }
    }

    private static int position(int array[], int left, int right) {
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] < array[right]) {
                i++;
                swap(array, i, j);
            }

        }
        swap(array, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//input define
        Scanner n = new Scanner(System.in);//input define
        System.out.println("enter number of elements in array : ");//output statment
        int x = input.nextInt();//input number
        int[] num_Array = new int[x];//array define
        System.out.println("enter the element:  ");//output statment
        //input the element
        for (int i = 0; i < num_Array.length; i++) {
            System.out.print("element " + (i + 1) + ": ");
            num_Array[i] = n.nextInt();

        }
        //output the array
        System.out.print("THE ARRAY IS :" + "(");
        for (int i = 0; i < num_Array.length; i++) {
            System.out.print(num_Array[i] + " , ");
            if (i == (x - 2)) {
                System.out.println(num_Array[x - 1] + ")");
                break;
            }
        }
        //call method and give it array and the begining and the ending of array
        quick_sort(num_Array, 0, num_Array.length - 1);
        
        System.out.print("the sorted array :"+"(");
        for (int i = 0; i < num_Array.length; i++) {
            System.out.print(num_Array[i]+" , ");
            if (i == (num_Array.length - 2)) {
                System.out.println(num_Array[num_Array.length - 1] + ")");
                break;
            }
        }
        System.out.println(")");
    }
}

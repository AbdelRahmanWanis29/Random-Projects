// Abdelrahman Mohamed El-Sayed
// Exam no: 18

public class wanis18 {

    public static void CommonElements(int[] list1, int[] list2) {
        // Recursive method that takes 2 sorted lists and prints their common elements
        CommonElementsHelper(list1, list2, 0, 0);

    }

    public static void CommonElementsHelper(int[] list1, int[] list2, int i1, int i2) {
        // A helper method for the method CommonElements
        if (i2 >= list2.length) {
            CommonElementsHelper(list1, list2, i1 + 1, 0);
        } else {
            if (i1 >= list1.length) {
                System.out.print("Done!");
            } else {
                if (list1[i1] == list2[i2]) {
                    System.out.print(list2[i2] + " ");
                    CommonElementsHelper(list1, list2, i1, i2 + 1);
                } else {
                    CommonElementsHelper(list1, list2, i1, i2 + 1);
                }
            }
        }
    }

    public static void Print2DArray(int[][] array) {
        // A function that prints a 2D-Array

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }

}
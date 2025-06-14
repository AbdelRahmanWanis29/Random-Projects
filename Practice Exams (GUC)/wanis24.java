// Abdelrahman Mohamed El-Sayed
// Exam no: 24

public class wanis24 {

    public static int[] exceptSelf(int[] array) {
        // Function that takes an array and returns a new array of the same length
        // with every element i of that array being the products of all the elements in
        // the original array
        // except the element at the index i
        int product = 1;
        int[] prod = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j != i) {
                    product = product * array[j];
                }
            }
            prod[i] = product;
            product = 1;

        }
        return prod;

    }

    public static String reversedAlpha(String text) {
        // Function that takes a string and returns a new string consisting of
        // only alphabetical letters of the original string and is reversed
        if (text == "") {
            return "";
        } else {
            if (text.charAt(0) >= '0' && text.charAt(0) <= '9') {
                return reversedAlpha(text.substring(1));
            } else {
                return reversedAlpha(text.substring(1)) + text.charAt(0);
            }
        }
    }

    public static int MaxProduct(int[] array) {
        // Function that takes an array of +ve integers and returns the maximum product
        // of 2 integers that can be obtained from the numbers in the array
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max1]) {
                max1 = i;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] > array[max2] && j != max1) {
                max2 = j;
            }
        }
        return max1 * max2;

    }

    public static int RMaxProduct(int[] array) {
        // Same as MaxProduct but written using recursion
        // also written using a different approach
        return MPHelper(array, 0, 0, 0);

    }

    public static int MPHelper(int[] array, int index, int max1, int max2) {
        // helper method for the RMaxProduct Function
        if (index >= array.length) {
            return max1 * max2;
        } else {
            if (array[index] > max1) {
                max2 = max1;
                max1 = array[index];
            } else {
                if (array[index] > max2) {
                    max2 = array[index];
                }
            }
            return MPHelper(array, index + 1, max1, max2);
        }

    }

    public static void main(String[] args) {
        int[] array = { 3, 7, 2, 9, 5 };
        System.out.println(RMaxProduct(array));
    }

}
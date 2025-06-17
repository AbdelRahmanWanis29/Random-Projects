public class wanis23 {

    public static int[] MinMaxResult(int[] arr1, int[] arr2) {

        int l1 = arr1.length;
        int l2 = arr2.length;
        int maxl;
        int minl;

        if (l1 > l2) {
            maxl = l1;
            minl = l2;
        } else {
            maxl = l2;
            minl = l1;
        }

        int diff = maxl - minl;
        int[] result = new int[maxl];

        for (int i = 0; i < minl; i++) {
            if ((i % 2) == 0) {
                if (arr1[i] > arr2[i]) {
                    result[i] = arr2[i];
                } else {
                    result[i] = arr1[i];
                }
            } else {
                if (arr1[i] > arr2[i]) {
                    result[i] = arr1[i];
                } else {
                    result[i] = arr2[i];
                }
            }
        }
        boolean ar1L;
        if (l1 > l2) {
            ar1L = true;
        } else {
            ar1L = false;
        }

        for (int i = diff; i < maxl; i++) {
            if (ar1L == true) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[i];
            }
        }

        return result;

    }

    public static void Print1D(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void Print2D(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void FindMaxDifferencePair(String[] array) {

        int max = 0;
        String word1 = "";
        String word2 = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length() > array[j].length()) {
                    if ((array[i].length() - array[j].length()) > max) {
                        max = array[i].length() - array[j].length();
                        word1 = array[i];
                        word2 = array[j];
                    }
                } else {
                    if ((array[j].length() - array[i].length()) > max) {
                        max = array[j].length() - array[i].length();
                        word1 = array[i];
                        word2 = array[j];
                    }
                }
            }
        }
        System.out.println("Max Difference Pair: " + word1 + " , " + word2);

    }

    public static int SpecialParse(String s) {

        return Integer.parseInt(SpecialParseHelper(s, 0));

    }

    public static String SpecialParseHelper(String s, int i) {

        if (i == s.length()) {
            return "";
        } else {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                return s.charAt(i) + SpecialParseHelper(s, i + 1);
            } else {
                return SpecialParseHelper(s, i + 1);
            }
        }
    }

    public static int[] MoveZeros(int[] array) {

        int[] result = new int[array.length];
        return MoveZerosHelper(array, result, 0, 0);
    }

    public static int[] MoveZerosHelper(int[] array, int[] result, int i, int j) {

        if (i >= array.length) {
            return result;
        } else {
            if (array[i] != 0) {
                result[j] = array[i];
                return MoveZerosHelper(array, result, ++i, ++j);
            } else {
                return MoveZerosHelper(array, result, ++i, j);
            }
        }

    }

    public static boolean IsMultiple(int[][] array) {
        // Method that returns only returns true if every element in the nxn matrix
        // array is a multiple of the element above it

        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; i < array.length; j++) {
                if ((array[i][j] % array[i - 1][j]) != 0) {
                    flag = false;
                }
            }
        }
        return flag;

    }

    public static void main(String[] args) {

        /*
         * Main method to Integrate the method MinMaxResult in terminal
         * int l1 = Integer.parseInt(args[0]);
         * int l2 = Integer.parseInt(args[1]);
         * int[] arr1 = new int[l1];
         * int[] arr2 = new int[l2];
         * 
         * for (int i = 0; i < l1; i++) {
         * arr1[i] = Integer.parseInt(args[2 + i]);
         * }
         * for (int i = 0; i < l2; i++) {
         * arr2[i] = Integer.parseInt(args[i + l1 + 2]);
         * }
         * 
         * Print1D(MinMaxResult(arr1, arr2));
         * 
         * int[] array = new int[] { 0, 0, 1, 0, 3, 0, 5, 0, 6 };
         * Print1D(MoveZeros(array));
         */
    }

}

// Abd Alrahman Mohamed El-Sayed
//Exam no: 17

public class wanis17 {

    public static int[] Expand(int[] array, int n) {

        int[] out = new int[array.length * n];
        if (n <= 0) {
            return out;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < n; j++) {
                out[i * n + j] = array[i] / n;
            }
        }
        return out;
    }

    public static boolean isUnique(int[] array, int n) {
        // Recursive method that only returns true if the integer n is found once in
        // the array and returns false otherwise
        if (existsCount(array, n) <= 0) {
            return false;
        } else {
            if (existsCount(array, n) == 1) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static int existsCount(int[] array, int n) {
        // Recurive method that counts the number of times n exists in array
        return existsCountHelper(array, n, 0);
    }

    public static int existsCountHelper(int[] array, int n, int i) {
        // Helper method for Recursive method existsCount
        int count = 0;
        if (i >= array.length) {
            return count;
        } else {
            if (array[i] == n) {
                count = +1;
                count += existsCountHelper(array, n, i + 1);
            } else {
                count += existsCountHelper(array, n, i + 1);
            }
        }
        return count;
    }

    public static int mostUnique(int[][] array) {
        // Method that accepts a possibly-ragged 2D-Array of integers, calculates how
        // many unique score are there in each row, prints how many unique scores are
        // there for each row and then returs the highest number of unique scores a row
        // has
        int max = 0;
        int[] UScores = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            UScores[i] = UniqueScores(array[i]);
        }
        for (int i = 0; i < UScores.length; i++) {
            if (max < UScores[i]) {
                max = UScores[i];
            }
            int n = i + 1;
            System.out.println("Row " + n + ": " + UScores[i] + " unique scores");
        }
        return max;

    }

    public static int UniqueScores(int[] array) {
        // Method that accepts an array and returns how many unique scores there is in
        // that array
        int[] collected = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isUnique(collected, array[i]) == false) {
                collected[i] = array[i];
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] array = new int[args.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        /*
         * int[] newarray = Expand(array, 3);
         * for (int i = 0; i < newarray.length; i++) {
         * System.out.print(newarray[i] + " ");
         * }
         * 
         * 
         * System.out.println(isUnique(array, 9));
         * System.out.println(isUnique(array, 3));
         * System.out.println(isUnique(array, 0));
         */
    }

}

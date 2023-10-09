public class AdditionOf_twoarray {
    public static void main(String[] args) {
        int arr1[][] = {{1, 3, 4, 5}, {2, 3, 5, 1}, {3, 7, 8, 1}};
        int arr2[][] = {{2, 3, 4, 2}, {2, 5, 4, 1}, {2, 6, 9, 2}};
        int arr3[][] = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        //Printing two array adding:
        System.out.println("Addition of array1 and array2 is:");
        for (int n = 0; n < 3; n++) {
            for (int m = 0; m < 3; m++) {
                System.out.print(" " + arr3[n][m]);
            }
            System.out.println();
        }
    }
}

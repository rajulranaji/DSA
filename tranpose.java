public class tranpose {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6}};
        for (int row=0;row<arr.length; row++) {
            for(int col=0;col<arr.length;col++){
//                arr[row]=arr[row-1];
//                arr[col]=arr[col+1];
                arr[row][col]=arr[col][row];
                System.out.print(" "+arr[row][col]);
            }
            System.out.println();
        }
    }
}

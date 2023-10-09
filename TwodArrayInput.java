import java.util.Arrays;
import java.util.Scanner;
public class TwodArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number of rows:");
        int row=sc.nextInt();
        System.out.println("Enter number of column:");
        int col=sc.nextInt();
        int arr1[][]= new int[row][col];
        System.out.println("Enter  Elements:");
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1.length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array is:");
      for(int n=0;n<arr1.length;n++){
          for(int m=0;m<arr1.length;m++){
              System.out.print(" "+arr1[n][m]);
          }
        System.out.println();
      }
    }
}

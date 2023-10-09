import java.util.Arrays;

public class RotateAarraybyone {//
    public static void main(String[] args) {
      int[]arr={1,2,3,4,5};
      int n=arr.length-1;
      rotate(arr,n);
    }
    public  static  void rotate(int arr[], int n)
    {
//        int start=0;
////        int s=start-1;
//        int end=n;
//        int tem=0;
//        tem=arr[start-1];
//        arr[start-1]=arr[end];
//        arr[end]=tem;
//        System.out.println("Array is:"+ Arrays.toString(arr));

            int temp = arr[0];
            for(int i=0;i<n;i++)
            {
                int x = arr[(i+1)%n];
                arr[(i+1)%n] = temp;
                temp = x;
        }
        System.out.println("Array is:"+ Arrays.toString(arr));
    }
}

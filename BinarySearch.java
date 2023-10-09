import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int find=0;
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Element of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your array is:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Do you want to search Elements?[yes/no]");
        String a=sc.nextLine();
        if(a.equals("yes")){
            System.out.println("Enter integer:");
             find=sc.nextInt();
        }
         else {
            System.out.println("Your array is:"+Arrays.toString(arr));
        }
        int ans=search(arr,find);
        if(ans==-1){
            System.out.println("Sorry your element is not found.");
        }
        else{
            System.out.println(ans);
        }
    }
    public static int search(int arr[],int key){
        int start=0;
        int end=arr.length;
        for(int j=0;j<end-1;j++){
            int mid=(start+end)/2;
            if(arr[mid]==arr[key]){
                return mid;
            }
            else if(arr[mid]>arr[key]){
                start=mid+1;
            }
            else if(arr[mid]<arr[key]){
                end=mid-1;
            }
        }
        return -1;
    }
}

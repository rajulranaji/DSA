import java.util.Arrays;
import java.util.Scanner;
interface input{
    public void input(int []arr,int key);
}
interface search{
    public int searching(int arr[],int key);
}
interface display{
    public void display(int arr[]);
}
class Allone1 implements input,search,display{
    Scanner sc=new Scanner(System.in);
    @Override
    public void input(int arr[],int key) {
        System.out.println("Enter here size of array:");
        int size=sc.nextInt();
        System.out.println("Enter here Element of array:");
         arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Do you want search some element?[yes/no]");
         String b= sc.nextLine();
        if(b.equals("yes")){
            System.out.println("Enter Element:");
            key=sc.nextInt();
        }
        else {
            System.out.println("No problem go to next methode");
        }
    }

    @Override
    public int searching(int arr[],int key) {
           for(int i=0;i<arr.length;i++){
               if(arr[key]==arr[i]){
                   return i;
               }
           }
        return -1;
    }

    @Override
    public void display(int arr[]) {
        System.out.println("Your original array is");
        System.out.println(Arrays.toString(arr));
    }
}
public class InterfaceSearch {
    public static void main(String[] args) {
    Allone1 a=new Allone1();
    }
}

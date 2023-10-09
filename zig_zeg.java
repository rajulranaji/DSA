import java.util.Arrays;

public class zig_zeg {
    public static void main(String[] args) {
        int[]a={1,3,6,5,8,7};
        System.out.println("Your original array is:"+" "+ Arrays.toString(a));
        rearange(a);
        System.out.println("Your new array is:"+" "+Arrays.toString(a));
    }
    public static void rearange(int[]a){
        int s=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                  swap(a,j);
                  s=1;
                }
                else if(a[j]<a[j+1]){
                    swap1(a,j);
                    s=1;
                    break;
                }
                else {
                    s=0;
                }
            }
            if(s==0){
                System.out.println(s);
            }
        }
    }
    public static void swap(int a[],int j){
        int tm=0;
        tm=a[j-1];
        a[j-1]=a[j];
        a[j]=tm;
    }
    public static void swap1(int a[],int j){
        int tm=0;
        tm=a[j];
        a[j]=a[j+1];
        a[j+1]=tm;
    }
}

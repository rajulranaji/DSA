import java.util.Arrays;

public class unioOftwoArray {//Given two arrays a[] and b[] of size n and m respectively.
    // The task is to find the number of elements in the union between these two arrays.
    public static void main(String[] args) {
     int a[]={1,2,3,4,5};
     int n=a.length;
     int b[]={1,2,3};
     int m=b.length;
     int ans=doUnion(a,n,b,m);
        System.out.println(ans);
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        int result=0;
        int noMatch=0;
           for(int i=0;i<n;i++) {
               for (int j = 0; j < m; j++) {
//                   result=a[i];
                   if(a[i]==b[j]){
                       result =n;
                   }
                   else{
                       noMatch++;
                       result=n+noMatch;
                   }
               }
           }
           return result;
    }
}

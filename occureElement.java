public class occureElement {
    public static void main(String[] args) {
int[]arr={4,2 ,2,3};
int n=arr.length;
int k=2;
    int ans=firstElementKTime(arr,n,k);
        System.out.println(ans);
    }
    public  static  int firstElementKTime(int a[], int n, int k)//Given an array of N integers.
    // Find the first element that occurs at least K number of times.
    {
        if(k==1)
            return a[0];
         for (int i=1;i<n;i++){
        int m=1;
             for(int j=i-1;j>=0;j--){
             if(a[i]==a[j]){
                 m++;
             }
             if(m==k){
                 return a[i];
             }
         }
    }
         return -1;
}
}

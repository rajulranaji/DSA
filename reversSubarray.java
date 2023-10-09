public class reversSubarray {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int n=a.length;
        int k=4;
        revers(a,n,k);
    }
    public static int revers(int arr[],int n,int k){
        if(k>0) {
            for (int i = k-1; i >= 0; i--) {
                System.out.print(" " +arr[i]);
            }
            for(int i=n-1;i>=k;i--){
                System.out.print(" "+arr[i]);
            }
        System.out.println();
        }
        return -1;
    }
}

public class min_max {
    public static void main(String[] args) {
        int arr[]={23,4,5,54,100,3000};
        int n=arr.length;
      getMinMax(arr,n);
    }
    static void getMinMax(int a[], int n)
    {
        int min=Integer.MAX_VALUE;
        int  max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(min>i){
                min=i;
            }
        }
        for(int j=0;j<n-1;n++){
            if(max<j){
                max=j;
            }
        }
        System.out.println("Your minimum value is:"+min);
        System.out.println("Your max value is:"+max);
    }
}

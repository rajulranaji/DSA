public class appearsonlyone {
    public static void main(String[] args) {
        int []arr={1,1,2,2,3,4,4,5,5};
        int ans=search(arr);
        if(arr.length==1){
            System.out.println("wrong..");
        }
        else {
        System.out.println(ans);}
    }
    public static int search(int[]a){
       int start=0;
       int end=a.length;
       while (start<=end){
           int mid=(start+end)/2;
           if(a[mid]!=a[mid+1]){
               return mid;
           } else if (a.length%2==0) {
               end=mid;
           }
           else {
               start=mid+1;
           }
       }
        return -1;
    }
}

public class missingNumber {
    public static void main(String[] args) {
        int[]arr={1,2,3,5};
       int ans=MissingNum(arr);
        System.out.println(ans);
    }
    public  static int MissingNum(int[]a){
                 int start=0;
                 int end=a.length;
//                 while (start<=end){
//                     int mid=(start+end)/2;
                     for (int i=0;i<a.length;i++){
                         System.out.println(a[i]);
                     int currectIndex=a[i]-1;
                     if(a[i]!=a[currectIndex]){
                         return i;
                     }
//                         else if(a[mid]>currectIndex){
//                     }
                     }
//                 }
                 return -1;
        }
    }

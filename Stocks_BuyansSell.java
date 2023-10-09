import java.util.ArrayList;
import java.util.Arrays;

public class Stocks_BuyansSell {
    public static void main(String[] args) {
//        ArrayList<Integer>a=new ArrayList<>();
//        a.add(22);
//        a.add(230);
//        a.add(239);
//        a.add(34);
//        a.add(2230);
//        a.add(2223);
        int A[]={22,230,239,34,2230,2223};
        int n=A.length;
       buy c=new buy();
       var ans=c.stockBuySell(A,n);
        System.out.println(ans);
    }
}
 class buy{
     ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n){
         ArrayList<ArrayList<Integer>> v=new ArrayList<>();
         n=A.length;
         for(int i=1;i<n;i++){
             if(A[i-1]<A[i]){
                 ArrayList<Integer> obj=new ArrayList<>();
                 obj.add(i-1);
                 obj.add(i);
                 v.add(obj);
             }
         }
         return v;
     }
}

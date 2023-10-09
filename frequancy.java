import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class frequancy {
    //Given an array of integers nums, sort the array in
    // increasing order based on the frequency of the values.
    // If multiple values have the same frequency, sort them in decreasing order.
    public static void main(String[] args) {
     int nums[]={3,4,6,1,1,2,2,3,3};
        System.out.println("Your original array is:");
     for (int b=0;b<nums.length;b++){
         System.out.print(" "+nums[b]);
     }
        System.out.println();
       int temm=0;
       int a;
       int c;
       for(a=0;a<nums.length;a++){
           for (c=1;c<nums.length-a;c++) {
               if (nums[c-1]==nums[c]) {

               } else if(nums[c-1]!=nums[c]) {

               }
           }
       }

    }

    public static int sortinde(int num[]){
        int max=Integer.MIN_VALUE;
        for(int sort=0;sort<num.length;sort++){
            if(num[sort]>max){
                max=num[sort];
            }
            for(int sort1=1;sort1<num.length-sort;sort1++){
                if(num[sort1]>num[sort1-1]){
                    int temp=num[sort1];
                    num[sort1]=num[sort1-1];
                    num[sort1-1]=temp;
                }
            }
        }
        System.out.println("Max number is:"+" "+max);
        System.out.println("your array sorted in decreasing order:"+Arrays.toString(num));
        return  max;
    }

    public static int sortinincrease(int num[]){
        int max=Integer.MIN_VALUE;
        for(int sort=0;sort<num.length;sort++){
            if(num[sort]>max){
                max=num[sort];
            }
            for(int sort1=1;sort1<num.length-sort;sort1++){
                if(num[sort1]<num[sort1-1]){
                    int temp=num[sort1];
                    num[sort1]=num[sort1-1];
                    num[sort1-1]=temp;
                }
            }
        }
        System.out.println("Max number is:"+" "+max);
        System.out.println("Your array is sorted in increasing order:"+Arrays.toString(num));
        return max;
    }
}

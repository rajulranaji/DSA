import java.util.Arrays;

public class finding_First_last_element {
    public static void main(String[] args) {
       int[]arr={1,22,3,4,5,44,33,22};
       int target=22;
      int s[]= searchRange(arr,target);
        System.out.println(Arrays.toString(s));
    }
//   public static int[] search(int[]arr, int target){
//        //first accurence:
//       int[]ans={-1,-1};
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            int mid=(start+end)/2;
//            if(target==arr[mid]){
//                 ans[0]=mid;
//                 end=mid-1;
//            }
//            else if(target>arr[mid]){
//                start=arr[mid]+1;
//            }
//            else if(target<arr[mid]){
//                end=arr[mid]-1;
//            }
//        }
//        //second;
//           start=0;
//           end=arr.length-1;
//         while (start<=end){
//             int mid=(start+end)/2;
//             if(target==arr[mid]){
//                 ans[1]=mid;
//                 start=mid+1;
//             }
//             else if(target>arr[mid]){
//                 start=arr[mid]+1;
//             }
//             else if(target<arr[mid]){
//                 end=arr[mid]-1;
//             }
//         }
//         return ans;
//   }
//}
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // First Occurrence
        int start = 0, end = nums.length - 1;
//        int mid = (start + end) / 2;
        while (start <= end) {
          int  mid = (start + end) / 2;
            if (target == nums[mid]) {
                ans[0] = mid;
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        // Last Occurrence
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
           int mid = (start + end) / 2;
            if (target == nums[mid]) {
                ans[1] = mid;
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return ans;
    }
}

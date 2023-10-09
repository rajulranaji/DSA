public class LinerSearch {
    public static void main(String[] args) {
        int[]arr={2,4,5,6,7};
        int key=8;
        int ans=search(arr,key);
        if(ans==-1){
            System.out.println("Sorry your element is not found..");
        }
        else {
        System.out.println("Your Element is on"+" "+ans+" "+"index");}
    }
    public static int search(int[]arr,int key){
        for(int i=0;i<arr.length;i++){
                if(key==arr[i]){
                    return i;
                }
            }
        return -1;
    }
}

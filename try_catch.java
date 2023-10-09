import java.util.Scanner;
class throw1 extends RuntimeException{
    public  throw1() {
        System.out.println("sorry your id is not found in our database.");
    }
}
class input1 extends Throwable {
    Scanner sc=new Scanner(System.in);
    int arr[]={22,435,87,80,98,78,10,101,102,103,765,990};
    int id=0;
    public  void  checking(){
        try {
            System.out.println("Enter your id");
             id=sc.nextInt();
        }catch (ArithmeticException e){
            System.out.println("Something went wrong please try again");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=id){
                throw new throw1();
            };
        }
        System.out.println("Enter your name:");
        String name=sc.nextLine();
    }
}
public class try_catch {
    public static void main(String[] args) {
      input1 t=new input1();
      t.checking();
    }
}

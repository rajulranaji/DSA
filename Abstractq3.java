import java.util.Scanner;
abstract  class Mark{
    abstract  void presentage();
}
class A extends Mark{
    Scanner sc=new Scanner(System.in);
    @Override
    void presentage() {
        System.out.println("Enter here 1st mark:-");
        int firs=sc.nextInt();  System.out.println("Enter here 2nd mark:-");
        int second=sc.nextInt();  System.out.println("Enter here 3rd mark:-");
        int third=sc.nextInt();
        int total=firs+second+third;
        if(firs>=33&&second>=33&&third>=33) {
            int precentage = (total * 100 / 300);
            System.out.println("your total precentage is:-"+precentage+"%");
        }
    }
}
class  B extends Mark{
    @Override
    void presentage() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter here 1st mark:-");
        int firs=sc.nextInt();  System.out.println("Enter here 2nd mark:-");
        int second=sc.nextInt();  System.out.println("Enter here 3rd mark:-");
        int third=sc.nextInt();System.out.println("Enter here 4th subject marks:-");
        int fourth=sc.nextInt();
       int  total=firs+second+third+fourth;
        if(firs>=33&&second>=33&&third>=33&&fourth>=33) {
            int pr = (total * 100 / 400);
            System.out.println("Your total perecentage is:-" + pr+"%");
        }
    }
}
public class Abstractq3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter here your name:-");
        String name=sc.nextLine();
        if(name.equals("Rahul rana")||name.equals("rahul rana")){
        A b=new A();
        b.presentage();
//        System.out.println("Hello"+" "+name+" "+"Your total percentage is:"+ans1);
//            System.out.println(ans);
        }
        else if(name.equals("Kajal kumari")||name.equals("kajal kumari")){
            B a=new B();
            a.presentage();
//            System.out.println("Hello"+" "+name+" "+"Your total presage is:"+ans2);
        }
        else {
            System.out.println("Sorry your data is not found.");
        }
    }

}

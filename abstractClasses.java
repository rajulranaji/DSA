import java.util.Scanner;
//abstract  class prent {//q1.
//               abstract void massage();
//        }
//        class child extends prent{
//            @Override
//            void massage() {
//                System.out.println("Hii that is massage one.");
//            }
//        }
//        class child2 extends prent{
//            @Override
//            void massage() {
//                System.out.println("Hii that is massage two");
//            }
//        }
          abstract class Bank{//Question no.2..
              abstract void getbalance();
}
class bank1 extends Bank{
              Scanner sc=new Scanner(System.in);
    @Override
    void getbalance() {
                System.out.println("Enter here your account no:-");
            int blance = 0;
            long ac = sc.nextLong();
            for (int i = 0; i < ac; i++)
                if (i == 1 || i == 4 || i == 9 || i == 2) {
                    blance = 2000;
                } else {
                    blance = 500;
                }
            System.out.println("Your balance is:-" + " " + blance);
        }
    }
class  bank2 extends Bank{
              Scanner newsc=new Scanner(System.in);
    @Override
    void getbalance() {
        int blance=0;
            System.out.println("Enter here your bank account no:-");
            long ac=newsc.nextInt();
            for (int i = 0; i < ac; i++)
                if (i == 2 || i == 5 || i == 7 || i == 0) {
                    blance = 10000;
                } else {
                    blance = 5000;
                }
            System.out.println("Your balance is:-" + " " + blance);
        }
    }
public class abstractClasses {
    public static void main(String[] args) {
//         child obj=new child();
//         obj.massage();
//         child2 obj2=new child2();
//         obj2.massage();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:-");
        String name=sc.nextLine();
        if(name.equals("Rahul kumar")||name.equals("rahul kumar")){
            System.out.println("Your are the Bank1..Customer");
        bank1 bn=new bank1();
        bn.getbalance();
            System.out.println("Have a good day.");
        }
        else {
            System.out.println("You are the Bank2...Customer");
            bank2 bn2 = new bank2();
            bn2.getbalance();
            System.out.println("Have a good day.");
        }
    }
}

import java.util.Arrays;
import  java.util.Scanner;
//Create an interface TVremote and use it to inherit another interface smart TVremote
//Create a class TV which implements TVremote interface from Q6
interface SmartTvremote{
    void start();
    void chanle();
    void chanleList();
}
interface Tvremote extends SmartTvremote{
    void model();
    void price();

    void type();
}
class Allone implements Tvremote{
    Scanner sc=new Scanner(System.in);
        boolean tv;
    @Override
    public void start() {
        System.out.println("Do you want to start the tv.?[yes/no]");
        String star=sc.nextLine();
        if(star.equals("yes")){
              tv=false;
        System.out.println("Ok your tv is going to start.");
        tv=true;}
        else{
            System.out.println("ok then check out next function");
        }
        tv=false;
    }

    @Override
    public void chanle() {
         if(tv){
             System.out.println("Your chanle no is: 1");
         }
        System.out.println("Do you want to change chanle?[yes/no]");
         String cho=sc.nextLine();
         if(cho.equals("yes")){
             System.out.println("Enter the chanle no.");
             int chno=sc.nextInt();
         }
    }

    public void chanleList() {
          String []chanleList={"gogo","pogo","digni","ZeeCinema","UTVAction"};
        System.out.println("Your chanle list is:"+ Arrays.toString(chanleList));
    }
    @Override
    public void model() {
        System.out.println("Hey there we have some cycle to show do you want to see?[yes/no]");
        String cycle=sc.nextLine();
        String model[]={"Avon","Hero","Yamaha","Honda"};
        if(cycle.equals("yes"))
            System.out.println("Models of cycle is:"+Arrays.toString(model));
    }
    @Override
    public void price() {
        String price[]={"Avon : 3000","Hero : 5000","Yamaha : 8000","Honda : 10000"};
        System.out.println("Pricing of cycles is:"+price);
    }

    @Override
    public void type() {
       String type[]={"Avon : Hybrid","Hero : Montane","Yamaha : Racing","Honda : City"};
        System.out.println("Type of cycles is:"+Arrays.toString(type));
    }
}
public class InterfaceQ6 {
    public static void main(String[] args) {
     Allone one=new Allone();
     one.start();
     one.chanle();
     one.chanleList();
     one.model();
     one.price();
     one.price();
     one.type();
    }
}

import java.util.Scanner;
class kind{
    int id;
    String name;
    kind(){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        name=sc.nextLine();
    }
    kind(int id){
        this();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your id:");
        int idd1=sc.nextInt();
        this.id=idd1;
    }
    public  void dis(){
        System.out.println("Your name is:"+name);
        System.out.println("Your id is:"+id);
    }
    public void accepted(){
        String department;
        try {
        if(id>34||id<=55){
            department="Coding";
            System.out.println("your department is:"+department);
        }
        }catch (ArithmeticException e){
            System.out.println(e+"your id is not found.f");
        }
    }
}
public class newchaining {
    public static void main(String[] args) {
kind s1=new kind(33);
s1.dis();
    }
}

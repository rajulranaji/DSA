import org.w3c.dom.ls.LSOutput;

import  java.util.Scanner;
class  Employee{
    String name;
    int id;
    Employee(String name){
//        this(34);
       this.name=name;
    }
    Employee(){
        name="unknown";
        System.out.println("Enter your name & id firstly.");
    }
    Employee(int id){
        this.id=id;
    }
    public  void disply(){
        System.out.println("Your name is:"+name);
        System.out.println("Your id is:"+id);
        }
    }
public class Chaining {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your id:");
        int id1=sc.nextInt();
       Employee s1=new Employee(name);
       Employee s2=new Employee(id1);
       s1.disply();
    }
}

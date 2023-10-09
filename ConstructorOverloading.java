class Student{
    String name;
    Student(String name){
        name="rahul";
    }
    Student(){
        name="Unknown";
    }
    public  void display(){
        System.out.println("Your name is:"+" "+name);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1=new Student("rahul");
        s1.display();

    }
}

abstract class Anumal{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Anumal{
    @Override
    void cats() {
        System.out.println("meow");
    }

    @Override
    void dogs(){}
}
class dogs extends Anumal{
    @Override
    void dogs() {
        System.out.println("dog is brak");
    }

    @Override
    void cats() {}
}
public class Question5 {
    public static void main(String[] args) {
         Cats cat1=new Cats();
         cat1.cats();
         dogs dog1=new dogs();
         dog1.dogs();
    }
}

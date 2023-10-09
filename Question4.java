abstract  class check{
    String statment;
     String construct(String state){
        this.statment=state;
        return state;
    }
    abstract void statement2();
}
class C extends check{
    @Override
    String construct(String state) {
        super.construct(state);
        return state;
    }

    @Override
    void statement2() {
        System.out.println("This is a abstract method");
    }
}
public class Question4 {
    public static void main(String[] args) {
     C b=new C();
        System.out.println(b.construct("hii this is a constructor"));
     b.statement2();
    }
}

import java.util.*;

public class Arrraylist {
    public static void main(String[] args) {
//        ArrayList arr2=new ArrayList();
//        List otherone= Arrays.asList(99,88,6,89,92,90);
//        arr2.addAll(otherone);
//        System.out.println(arr2);
//        System.out.println("the maximum is:"+ Collections.max(arr2));
        userinput();
    }
    public static void userinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of arraylist:");
        int element=sc.nextInt();
        List<Integer> ohterone= List.of(element);
        List<Integer> a = new ArrayList<>(ohterone);
        System.out.println("your arraylist element is:"+a);
    }
}

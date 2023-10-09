import java.util.Scanner;
public class Uncommon {
    public static void main(String[] args) {
          int ans=chheck();
          if(ans!=-1){
              System.out.println("Your uncommon String is:"+ans);
          }
    }
    public  static int chheck(){
//        String find;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String:");
        String a=sc.nextLine();
        System.out.println("Enter second String:");
        String b=sc.nextLine();
            String sh="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(a.contains(b)){
                sh+=String.valueOf(c);
            }
        }
        return -1;
    }
}

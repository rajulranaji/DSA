import  java.util.Scanner;
abstract  class Shape{
    abstract int rectangleArea(int lenth,int breath);
    abstract  int squarArea(int radius);
    abstract int circleArea(int side);
        }
         class Area extends Shape{
             @Override
             int rectangleArea(int lenth, int breath) {
                 int a=lenth*breath;
                 return a;
             }
             @Override
             int circleArea(int side) {
                 int t=side*2;
                 return t;
             }

             @Override
             int squarArea(int radius) {
                 int c=radius*radius;
                 return c;
             }
         }
public class Question6 {
    public static void main(String[] args) {
Area a1=new Area();
int ans1=a1.rectangleArea(33,55);
int ansd2=a1.circleArea(4);
int ans3=a1.squarArea(56);
        System.out.println("Rectangle of Area is:"+ans1);
        System.out.println("Circle of Area is:"+ansd2);
        System.out.println("Square of Area is:"+ans3);
    }
}

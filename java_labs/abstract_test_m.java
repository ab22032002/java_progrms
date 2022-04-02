package java_labs;
import java.util.*;
abstract class Dimension
{
    abstract void cal();

};
class Rectangle extends Dimension
{
    void cal()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Length :");
        float l = S.nextFloat();
        System.out.println("Enter width :");
        float b = S.nextFloat();
        float a=l*b;
        System.out.println(" Area of the Rectangle is" +" "+ a);
    }

};
class Triangle extends Dimension
{
    void cal()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter base:");
        float b = S.nextFloat();
        System.out.println("Enter height :");
        float h = S.nextFloat();
        float a1 = (b*h)/2;
        System.out.println(" Area of the Triangle is" +" "+ a1);
    }
};
public class abstract_test_m {
    public static void main(String[] args)
    {
        Dimension R = new Rectangle();
        R.cal();
        Dimension T = new Triangle();
        T.cal();
    }
}

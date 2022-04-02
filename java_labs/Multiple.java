package java_labs;
import java.util.*;
public class Multiple {
        public static void main (String[] args)
        {
            try
            {
                Scanner S = new Scanner(System.in);
                System.out.println("Enter Length :");
                float l = S.nextFloat();
                System.out.println("Enter width :");
                float b = S.nextFloat();
                System.out.println("Enter height :");
                float h = S.nextFloat();
                float v = l*b*h;
                System.out.println("Volume of the box is" +" "+ v);
                float sa= 2*(l*b+b*h+h*l);
                System.out.println("Surface Area of the box is" +" "+ sa);
            }
            catch(Exception e)
            {
                System.out.print("Exception");
            }
        }
}

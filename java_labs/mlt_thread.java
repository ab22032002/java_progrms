package java_labs;

class a extends Thread
{
    void run()
    {
        for(int i =0; i<5;i++)
        {
            System.out.println("i = "+i);
//            sleep(1000);
            System.out.println("end of i ");
        }
    }
}
class b extends Thread
{
    void run()
    {
        for(int i =0; i<5;i++)
        {
            System.out.println("i = "+i);
//            sleep(1000);
            System.out.println("end of i ");
        }
    }
}
class c extends Thread
{
    void run()
    {
        for(int i =0; i<5;i++)
        {
            System.out.println("i = "+i);
            sleep(1000);
            System.out.println("end of i ");
        }
    }
}
public class mlt_thread
{
    public static void main(String[] args)
    {
     a obj1 = new a();
     obj1.start();
     new b().start();
     new c().start();
    }
}

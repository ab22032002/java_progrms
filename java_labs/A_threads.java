package java_labs;

public class A_threads extends Thread
{
    public static void main(String[] args) {
        void run()
        {
            System.out.println("thread is running");
            System.out.println(Thread.currentThread.getname());
        }
        A_threads obj1 = new A_threads();
        obj1.start();
    }
}

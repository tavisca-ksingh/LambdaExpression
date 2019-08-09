package optionalByThread;

public class ThreadNullHandler {

    public static void main(String[] args) {

        Thread t1= new Thread(()-> task());
        t1.start();
        Thread t2 = new Thread(ThreadNullHandler::task);
        t2.start();
    }

    static void task()  {
        for (int i = 0; i<10 ; i++)
        {
            System.out.println(i);
        }
     }

}

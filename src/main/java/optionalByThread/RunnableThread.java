package optionalByThread;

public class RunnableThread  {

    public static void main(String[] args) {
//        TestRun runnableThread =new TestRun();
//        TestRun runnableThread1 =new TestRun();
//        runnableThread.run();
//        runnableThread1.run();



        Thread t1 =new Thread(()-> taskSwickTest());
        Thread t2 = new Thread(RunnableThread::taskSwickTest);
        t1.start();
        t2.start();
    }

    static void taskSwickTest()
    {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }


}



class TestRun implements Runnable {

    @Override
    public void run() {
        for (int i= 0 ; i<10; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

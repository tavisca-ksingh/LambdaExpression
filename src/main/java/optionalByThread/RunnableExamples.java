package optionalByThread;

public class RunnableExamples {

        public static void main(String[] args) {
            RunnableTest runnableTest= new RunnableTest();
           Thread t1 = new Thread(runnableTest::run);
           t1.start();
            Thread t2 = new Thread(runnableTest::run);
            t2.start();
        }
    }

    class RunnableTest implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<10;i++)
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

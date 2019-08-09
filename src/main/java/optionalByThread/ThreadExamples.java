package optionalByThread;

public class ThreadExamples {
    public static void main(String[] args) {
        TestRun1 t1=new TestRun1();
        TestRun1 t2 = new TestRun1();
        t1.start();
        t2.start();
    }
}

class TestRun1 extends Thread{
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


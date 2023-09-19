class Worker extends Thread {
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            System.out.println(Thread.currentThread().getId() + ":" + i);
        }
        try {
            Thread.sleep(500);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class TestOne {
    public static void main(String args[]) {
        Thread t1 = new Worker();
        Thread t2 = new Worker();
        Thread t3 = new Worker();
        t1.start();
        t2.start();
        t3.start();
    }
}
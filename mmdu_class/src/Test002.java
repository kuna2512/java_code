class Table {
    void printTable(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

public class Test002 {
    public static void main(String[] args) {
        Table ob = new Table();
        MyThread1 t1 = new MyThread1(ob);
        MyThread2 t2 = new MyThread2(ob);
        t1.start();
        t2.start();
    }
}
package multithreading;

/**
 * Description: 多个线程之间不共享变量线程安全的情况
 * Project: javaRelated <br />
 * ClassName: MyThread <br />
 *
 * @Author Wang Shaopeng
 * @Date 2019/3/19 14:39
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + MyThread.currentThread().getName() + " 计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }

}

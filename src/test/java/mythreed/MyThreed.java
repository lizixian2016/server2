package mythreed;

public class MyThreed implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("我是线程：%s,第%s次执行", Thread.currentThread().getName(), i));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package mythreed;

import java.util.concurrent.*;

public class MyApp {


    public static void main(String[] args) {
        MyThreed myThreed = new MyThreed();
//        Thread thread1 = new Thread(myThreed,"线程1");
//        thread1.start();

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 10, TimeUnit.MICROSECONDS, new ArrayBlockingQueue<Runnable>(5));
//        threadPoolExecutor.execute(myThreed);
//        threadPoolExecutor.execute(myThreed);
//        threadPoolExecutor.execute(myThreed);
//        threadPoolExecutor.execute(myThreed);

        int[] numbers = {1, 2, 3, 0,};

       /* for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println("结果" + 6 / numbers[i]);
            } catch (Exception e) {
                System.out.println("错误");
            }
        }*/
       for (int num : numbers) {
            try {
                System.out.printf("结果" + 6 / num);
            } catch (Exception e) {
                System.out.printf("错误");
            }
        }
    }
}

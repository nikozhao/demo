package niko.java8;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author: zhaozongqiang
 * @Date: Create in 2018/11/23
 */
public class FutureDemo {

    public void createFture() throws Exception{
        ExecutorService executorService =  Executors.newFixedThreadPool(10);
        Future<Integer> result = executorService.submit(()->{
            int j = 0 ;
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                j+= new Random().nextInt(10);
                System.out.println(String.format("线程：%s，i=%s,j=%s",Thread.currentThread().getId(),i,j));
            }
            return j;
        });
        Future<Integer> result1 = executorService.submit(()->{
            int j = 0 ;
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                j+= new Random().nextInt(10);
                System.out.println(String.format("线程：%s，i=%s,j=%s",Thread.currentThread().getId(),i,j));
            }
            return j;
        });
        System.out.println(result.get().intValue());
        System.out.println(result1.get().intValue());
    }
    @Test
    public void test() throws Exception{
        createFture();
    }
}

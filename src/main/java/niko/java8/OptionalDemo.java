package niko.java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;
import java.util.Random;

/**
 * @Author: zhaozongqiang
 * @Date: Create in 2018/11/23
 * @Email: zongqiang.zhao@56qq.com
 */
public class OptionalDemo {

    public boolean getName(){
        Random r = new Random();
        Optional<Integer> op = Optional.ofNullable(r.nextInt()).filter(i-> i%2==0);
        return op.isPresent();
    }

    @Test
    public void test(){
        Assert.assertTrue(getName());
    }
}

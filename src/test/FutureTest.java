package test;

import java.util.concurrent.Callable;

/**
 * @Author: gws
 * @Date: 13/09/2018 11:56
 * @Description:
 */
public class FutureTest {
    public static String a = "准备";
    static {
        System.out.println(a);
    }
    public static void main(String[] args) throws Exception {
        Integer call = new MyFuture().call();
        System.out.println(a);
    }
}
class MyFuture implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return null;
    }
}
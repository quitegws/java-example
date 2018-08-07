package concurrent;

/**
 * @Author: gws
 * @Date: 07/08/2018 00:33
 * @Description:
 */
public class TestSynKeyWord {
    public static void main(String[] args) {

    }



}


class Test{
    Object k1;
    Object k2;

    public Test(Object k1, Object k2){
        this.k1 = k1;
        this.k2 = k2;

    }

    public synchronized void setK1(Object k1){
        this.k1 = k1;
    }

    public void setK2(Object k2) {
        synchronized (k2) {
            this.k2 = k2;
        }
    }

    public static synchronized void setK2K1(){

    }
}
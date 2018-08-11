package test;

/**
 * @Author: gws
 * @Date: 07/08/2018 23:50
 * @Description:
 */
public class InnerAndStaticClass {
    class A{}
    static class B{}

    public static void main(String[] args) {
        InnerAndStaticClass innerAndStaticClass = new InnerAndStaticClass();
        InnerAndStaticClass.A  a = innerAndStaticClass.new A();
        B b = new B();

    }

}

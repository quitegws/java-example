package test;

public class TestString {
    public static void main(String[] args){
        String s = "2015-11-03,26d5adf85ea8612efa7632cc4d59fd9,10005,10005,,10001,,10004,,NULL,1,10001,1,2015-07-16 19:26:10.0,bjlikuan,1,bjlikuan,,,bjlikuan,2015-07-16 19:26:10.0,ACTIVE,4712-12-31,4712-12-31";
        int i = 0;
        for (String str : s.split(",")) {
            System.out.println(i++);
            System.out.println(str);
        }
    }
}

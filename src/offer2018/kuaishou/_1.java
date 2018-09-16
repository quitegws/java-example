package offer2018.kuaishou;

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (b == 0) {
            return;
        }

        if (a == 0) {
            System.out.println(0);
        }
        if(a == b * (a / b)){
            System.out.println(a / b);
            return;
        }

        double da = (double) a;
        double db = (double) b;
        boolean flag = false;

        BigDecimal b1=new BigDecimal(1),
                b2=new BigDecimal(3);
        try{
            b1=b1.divide(b2, MathContext.UNLIMITED);//1/3无穷数，抛出异常来抓。
        }catch(ArithmeticException e)
        {
            flag = true;
        }

         if (flag)f(da, db);
         else System.out.println(da / db);
    }
    //处理数据
    public static void f(double a ,double b){
        double c = a/b;

        String str = String.valueOf(c);
//      System.out.println(str);

        //取出整数和小数部分
        int index = str.indexOf(".");
        String integer = str.substring(0,index);
        String decimals = str.substring(index+1, str.length()-index+1);
//      System.out.println(decimals);

        // 对小数部分进行循环取循环体；
        String temp = "";
        String forTempString = "";
        for(int i=0;i<decimals.length()-1;i++){
            String ch = ""+decimals.charAt(i);
            if(!temp.contains(ch)){
                temp += ""+ch;
            }else{
                forTempString+=ch;
            }

        }
//      System.out.println(temp+"   "+forTempString);

        String  result =str; //记录最后结果
        for(int i=temp.length()-1;i>=0;i--){

            //从最后一位开始取 字符，然后在forTempString中取相同的字符进行比较，如果相同，则该基数为循环体；剩余temp中为取的部分为非循环体；
            String base = temp.substring(i, temp.length());
            int n = temp.length()-i;    //取字符的数量；
            if(forTempString.substring(0, n).equals(base)){

                //此时的base 就是循环体;
//              System.out.println(base);

                //当前的i的值能得出非循环体，组合得到最后结果
//              System.out.println(temp.subSequence(0, i));
                result = integer+"."+temp.substring(0, i)+"("+base+")";
                break;
            }
        }
        System.out.println(result);
    }
}
package intern2018._ali;

import java.util.*;

public class Test {

    public static LinkedList<String> list = new LinkedList<>();

    public static void allPermutation(String str){
        if(str == null || str.length() == 0)
            return;
        //保存所有的全排列

        allPermutation(str.split(","), list, 0);

        print(list);//打印全排列
        System.out.println(list.size());
    }


    private static void allPermutation(String[] c, LinkedList<String> listStr, int start){


        if(start == c.length-1) {

            StringBuilder s = new StringBuilder("");
            for (String str : c) {
                s.append(str);
            }
            listStr.add(s.toString());
        }else{
            for(int i = start; i <= c.length-1; i++)
            {
                swap(c, i, start);//相当于: 固定第 i 个字符
                allPermutation(c, listStr, start+1);//求出这种情形下的所有排列
                swap(c, start, i);//复位
            }
        }
    }


    private static void swap(String[] c, int i, int j){
        String tmp;
        tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }

    private static void print(LinkedList<String> listStr)
    {
        Collections.sort(listStr);//使字符串按照'字典顺序'输出
        for (String str : listStr) {
            System.out.println(str);
        }
        System.out.println("size:" + listStr.size());
    }

    //hapjin test
    public static void main(String[] args) {
//        allPermutation("hapjin");
        allPermutation("211314,0116,ss,爱,帅,猪,s,zhushuai");
    }
}
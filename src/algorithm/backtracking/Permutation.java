package algorithm.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: gws
 * @Date: 31/08/2018 23:04
 * @Description:题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Permutation {
    public ArrayList<String> Permutation1(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str == null || str.length() == 0) return res;

        bt(str.toCharArray(), 0 ,new LinkedList<String>(), res);

        return res;
    }

    public void bt(char[] str, int index,LinkedList<String> cache, ArrayList<String> list) {
        if(index == str.length - 1){
            String s = "";
            for (String st : cache) s += st;
            if(list.contains(s)) {

            } else {
                list.add(s);
            }
            return;
        }
        for (int j = index; j < str.length; j++) {
            cache.add(""+str[index]);
            bt(str, index + 1, cache,list);
            cache.remove(cache.size() - 1);
        }

    }

    public static void main(String[] args) {
        Permutation p = new Permutation() ;
        ArrayList<String> abc = p.Permutation("aabc");

        abc.forEach(( s ) -> {
            System.out.println(s);
        });
        //        Solution p = new Solution();
        //        System.out.println(p.Permutation("abc").toString());
    }


    public ArrayList<String> Permutation(String str) {
        List<String> res = new ArrayList<>();
        if (str != null && str.length() > 0) {
            backTracking(str.toCharArray(), 0, res);
            Collections.sort(res);
        }
        return (ArrayList)res;
    }

    public void backTracking(char[] cs, int i, List<String> list) {
        if (i == cs.length - 1) {
            String val = String.valueOf(cs);
            if (!list.contains(val))
                list.add(val);
        } else {
            for (int j = i; j < cs.length; j++) {
                swap(cs, i, j);
                backTracking(cs, i+1, list);
                swap(cs, i, j);
            }
        }
    }

    public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

}

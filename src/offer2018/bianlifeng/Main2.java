package offer2018.bianlifeng;



import java.util.*;

public class Main2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();


        char[] chars = line.toCharArray();
        Queue queue = new ArrayDeque();

        dfs(chars, 0,queue);

    }

    public static void dfs(char[] chars, int index, Queue queue){
        if(index == chars.length){
            System.out.println(String.valueOf(chars));
            chars[index - 1] = oppo(chars[index - 1]);
            System.out.println(String.valueOf(chars));
            chars[index - 1] = oppo(chars[index - 1]);


        } else {

            for(int i = index; i < chars.length; i++){


                char c = chars[i];
                if(!isChar(c)) continue;;
                chars[i] = oppo(c);
                dfs(chars, i+1, queue);
                chars[i] = c;

            }
        }

    }

    public static char oppo(char c){
        if(!isChar(c)){
            return c;
        }
        if(isUpper(c)){
            return (char)('a' + c - 'A');
        } else {
            return (char)('A' + c - 'a');

        }


    }
    public static boolean isUpper(char c){
        int dif2 = c - 'A';
        if(dif2 > 25 || dif2 < 0){
            return false;
        }
        return true;
    }

    public static boolean isLower(char c){
        int dif2 = c - 'a';
        if(dif2 > 25 || dif2 < 0){
            return false;
        }
        return true;
    }

    public static boolean isChar(char c){
        int dif1 = c - 'a';
        int dif2 = c - 'A';

        if((dif1 <= 25 && dif1 >= 0) || (dif2 <= 25 && dif2 >= 0)){
            return true;
        }
        return false;
    }
}



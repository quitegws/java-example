package offer2018.baicizhan;

// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bcon = sc.nextLine();
        String key = sc.nextLine();

        String ans = f(bcon, key);

        System.out.println(ans);
    }

    public static String f(String bcon, String key){
        int len = bcon.length();
        String ans = "NULL";
        if(!key.contains(".")){
            String entrys[] = bcon.substring(1, len - 1).split(";");
            for(int i = 0; i < entrys.length; i++){
                String subkey = entrys[i].split("->")[0];
                String value = entrys[i].split("->")[1];
                if(key.equals(expose(subkey))){
                    ans = value;
                }
            }
        } else {

            String[] keys = key.split(".");
            int firstIndex = key.indexOf(".");
            String subkey = key.substring(0, firstIndex);
            String leftKeys = key.substring(firstIndex);

            String entrys[] = bcon.substring(1, len).split(";");
            for(int j = 0; j < entrys.length; j++){
                String subkey_ = entrys[j].split("->")[0];
                String value = entrys[j].split("->")[1];
                if(subkey.equals(expose(subkey_))){
                    ans = f(value, leftKeys);
                }
            }
        }
        return ans;
    }

    public static String expose(String key){
        if(key.startsWith("\"") && key.endsWith("\"")){
            int len = key.length();
            String res  = key.substring(1,len - 1);
            return res;
        } else {
            return key;
        }
    }
}
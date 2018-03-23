/**
 * @author qing
 *
 *	Try……catch……finally中return的测试
 */
public class TryTest {

    /**
     * 主要方法
     */
    public static void main(String[] args) {
        String[] split = "    i   love    mei       tuan  y".trim().split("\\s+");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("")) {
                System.out.println("empty");
                continue;
            }
            System.out.println(split[i]);
        }
    }



}
package test;

import java.io.*;

/**
 * @Author: gws
 * @Date: 20/03/2018 11:46
 * @Description:
 */
public class TMac {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/gws/terminalCharacteristicsLog2016_ZhaoNeng_20170924_merge.ok");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();

        for (String s : line.split("\t")) {
            if (s.equals("")) {
                System.out.print(" tab ");
            } else if (s.equals(" "))  {
                System.out.print(" space ");
            } else {
                System.out.print( " " + s + " ");
            }
        }

        reader.close();

    }
}

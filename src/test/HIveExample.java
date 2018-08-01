package test;

import java.io.*;

/**
 * @Author: gws
 * @Date: 20/07/2018 00:13
 * @Description:
 */
public class HIveExample {
    public static void main(String[] args) {
        String path = "/Users/gws/Documents/hive/hive/examples/queries";
        File dir = new File(path);

        File[] files = dir.listFiles();

        for(File f : files){
            System.out.println("query file name: " + f.getName());
            System.out.println("\n");
            printFile(f);
        }

    }

    public static void printFile(File file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while(bufferedReader.ready()){
                System.out.println(                bufferedReader.readLine());
            }
            System.out.println("\n");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

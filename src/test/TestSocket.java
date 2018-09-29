package test;

import list.ListNode;

import java.io.*;
import java.net.Socket;
import java.util.List;

/**
 * @Author: gws
 * @Date: 17/04/2018 19:44
 * @Description:
 */
public class TestSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",10901);
        InputStream inputStream = socket.getInputStream();

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        while(true){
            String line = bufferedReader.readLine();

            bufferedWriter.write(line);

        }

//        bufferedWriter.close();

    }


}

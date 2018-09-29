package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class N {

    public static void print(){
        System.out.println("MTDP");
    }
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10901);
        Socket accept = serverSocket.accept();
        System.out.println(accept);
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;

        while (true) {
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }
    }
}
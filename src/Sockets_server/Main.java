package Sockets_server;
//про сервера с многопоточностью (как в жизни делают примерно... https://youtu.be/lKUb2IAdq3E?t=953)
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    //InputStream inputStream = socket.getInputStream();
    //OutputStream outputStream = socket.getOutputStream();
    //Со стримами не удобно работать, поэтому: вместо inputStream -> Scanner а вместо outputStream -> printWriter
    public static void main(String[] args) throws IOException {
        try (ServerSocket serversocket = new ServerSocket(8189); Socket socket = serversocket.accept(); Scanner scanner = new Scanner(socket.getInputStream())){
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("hello");
        }
    }
}

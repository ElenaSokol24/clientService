import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ClientService {

    public static void main(String[] args) {

        //127.0.0.1
        final String localhost = "127.0.0.1";
        int port = 8086;

        try (Socket clientSocket = new Socket(localhost, port);

             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {


            out.println("Nelogy");

            String resp = in.readLine();

            System.out.println(resp);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


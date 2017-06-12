import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Arthur on 12-6-2017.
 */
public class Server
{
    private int port;


    public Server() {
        port = 7777;
    }

    public void host()
    {
        new Thread( () ->
        {
            try
            {
                ServerSocket serverSocket = new ServerSocket(port);
                Socket socket = new ServerSocket().accept();

                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

                String input = inputStream.readUTF();

                if (input.equals("bye")) {
                    outputStream.close();
                    inputStream.close();
                    socket.close();
                }


            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                //code ends here.
            }
        }
    }
}

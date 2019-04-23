
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client_1 
{

    public static void main(String[] args) throws SocketException, UnknownHostException 
    {
        Client client=new Client();
        client.startRunning();
    }
}   

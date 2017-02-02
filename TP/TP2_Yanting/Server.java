import java.io.*;
import java.net.*;

public class Server {
	public void go(){
		try {
			ServerSocket serverSock = new ServerSocket(12345);
			while(true){
				Socket sock = serverSock.accept();

				InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
				BufferedReader reader = new BufferedReader(streamReader);
				
				String message = reader.readLine();	
				System.out.println("Server : Hello " + message + " !");
				
				reader.close();		
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public static void main(String[] args){
//		Server server = new Server();
//		server.go();
//	}
}

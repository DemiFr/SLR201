import java.io.*;
import java.net.*;


public class Client {
	String message;
	public void go(){
		try {
			Socket sock = new Socket("127.0.0.1", 12345);
			
			System.out.println("Please give the client the message to sent!");
			//Save the input message to the String message!
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			message = bufferedReader.readLine();
			//Print the message to the socket of the client!
			PrintWriter writer = new PrintWriter(sock.getOutputStream());
			writer.println("Client : " + message);
			writer.close();
			
			//System.out.println("Client : " + message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
//	public static void main(String[] args){
//		Client client = new Client();
//		client.go();
//	}
}

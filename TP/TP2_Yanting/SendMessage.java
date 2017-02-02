
public class SendMessage {
	public static void main(String[] args){
		Client client = new Client();
		client.go();
		Server server = new Server();
		server.go();

	}

}

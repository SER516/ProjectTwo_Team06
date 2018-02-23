import java.io.*;
import java.net.*;

public class ServerSocketMain {
	
	Socket s;
	ServerSocket ss;
	DataInputStream din;
	DataOutputStream dout;
	BufferedReader br;
	
	public ServerSocketMain(){
	}
	
	public void startConnection() {
		try {
			ss = new ServerSocket(1201);
			Socket s = ss.accept();
			
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Hello");
			String msgin = "", msgout = "";
			System.out.println(msgin + "Hello");
			while(true) {
//				msgin = din.readUTF();
				System.out.println(msgin);
				dout.writeUTF(ServerDataManager.getInstance().generateNumbers());
			
				System.out.print(ServerDataManager.getInstance().generateNumbers());
				dout.flush();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void closeConnection() {
		try {
			din.close();
			dout.close();
			br.close();
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
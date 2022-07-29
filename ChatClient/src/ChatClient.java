import java.io.*;
import java.net.*;
  
class ChatClient {

	public static final int PORT = 2345;
    public static void main(String args[]) {
    	String hostname = args.length > 0 ? args[0] : "localhost";
    	try {
        // Create client socket 	
		System.out.println("Establishing connection. Please wait ...");
		Socket socket = new Socket(hostname, PORT);		
		System.out.println("Successfully connected to the Server on host " + hostname);                   
      
          // sending data to the server
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
      
          // reading income data
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      
          // reading data from  keyboard
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str, strA;
      
          // working until the client close the connection by typing "\q"          
         while (!(str = kb.readLine()).equals("\\q")) {
      
                // send to the server
             dos.writeBytes(str + "\n");
      
                // receive from the server
             strA = br.readLine();
      
             System.out.println(strA);
           }
      
            // closing connections.
          dos.close();
          br.close();
          kb.close();
          socket.close();
        } catch(IOException e) {
        	e.printStackTrace();
        }
    }
}
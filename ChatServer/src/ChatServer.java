import java.io.*;
import java.net.*;
  
class ChatServer {
	public final static int PORT = 2345;
  
    public static void main(String args[]) {
    	try {
    	// Create server Socket
        ServerSocket ss = new ServerSocket(PORT);
  
        // connecting to client socket
        Socket connection = ss.accept();
        System.out.println("Listening for connection on port " + PORT);
  
        // sending data to client
        PrintStream ps = new PrintStream(connection.getOutputStream());
  
        // reading incoming data
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
  
        //reading data from keyboard
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
  
        // The server works constantly
        while (true) {
        	try {  
            String str, strA;
  
            // receiving from client
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                strA = kb.readLine();
  
                // send to client
                ps.println(strA);
            }
  
            // closing connections
            ps.close();
            br.close();
            kb.close();
            ss.close();
            connection.close();
  
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
        	System.exit(0);  //Exit from the program
  
        } 
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
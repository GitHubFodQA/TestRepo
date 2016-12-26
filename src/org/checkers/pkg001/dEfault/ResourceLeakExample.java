package org.checkers.pkg001.dEfault;

//RESOURCE_LEAK Example

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.naming.NamingException;

public class ResourceLeakExample {

	public static void main(String s[]) {
	      try {
	        PrintWriter out;
	        BufferedReader in;
	        Socket echoSocket;
          try {
	            echoSocket = new Socket("nothing", 7); /* Socket() constructor
	                                         obtains socket */
	            out = new PrintWriter(echoSocket.getOutputStream(), true);
	            in = new BufferedReader(new
	InputStreamReader(echoSocket.getInputStream()));
	        } catch (UnknownHostException e) {
	            System.err.println("Don't know about host: taranis.");
	            return; // function returns,
	            // but close() is never called on exception path
	        }
	        BufferedReader stdIn = new BufferedReader(new
	InputStreamReader(System.in));
	        String userInput;
	        while ((userInput = stdIn.readLine()) != null) {
	            out.println(userInput);
	            System.out.println("echo: " + in.readLine());
	        }
	        out.close();
	        in.close();
	        stdIn.close();
	        echoSocket.close();
	      } catch (IOException e) {
	         //ignore exception
	      }
					finally
					{
						return;
					}
	    }
	
	// Returns newly allocated resource
	public Socket model_return() throws UnknownHostException, IOException {
	    Socket s = new Socket("nothing", 128); 
	    return s;
	}

	// One level allocation propagation via return interface
	public void model_bug() throws UnknownHostException, IOException {
	    Socket s = model_return();
	    // returns without freeing resource
	} 
}

package hr.fer.ilj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server {
  private static final Logger LOG = LoggerFactory.getLogger(Server.class);

  public static void main(String[] args) throws IOException {
	  ServerSocket serverSocket = null;
	  try {
	      serverSocket = new ServerSocket(4444); 
	  } catch (IOException e) {
	      System.err.println("Could not listen on port: 55555.");
	      System.exit(1);
	  }

	  Socket clientSocket = null; 
	  try {
	      clientSocket = serverSocket.accept();
	      
	      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	      
	      PrintWriter out = new PrintWriter(clientSocket.getOutputStream());

		  String inputUrl = in.readLine();
		  
		  out.println("HTTP/1.1 200 OK");
		  out.println("Content-Type: text/html");
		  out.println("\r\n");
		  Protocol p = new Protocol();
		  out.println(p.processInput(inputUrl));
		  
		  out.close();

		  clientSocket.close();
		  serverSocket.close();

	      if(clientSocket != null) {           
	          System.out.println("Connected");
	      }
	  } catch (IOException e) {
	      System.err.println("Accept failed.");
	      System.exit(1);
	  }

	  
	  
	  }}
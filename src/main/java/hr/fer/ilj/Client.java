package hr.fer.ilj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
  private static final Logger LOG = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    try (Socket scEcho = new Socket("localhost", 4444);
        PrintWriter pwOut = new PrintWriter(scEcho.getOutputStream(), true);
        BufferedReader brIn = new BufferedReader(new InputStreamReader(scEcho.getInputStream()));) {
      BufferedReader brStdIn = new BufferedReader(new InputStreamReader(System.in));
      String strUserInput;

      System.out.println("echo:" + brIn.readLine());
      while ((strUserInput = brStdIn.readLine()) != null) {
        pwOut.println(strUserInput);
        String strFromServer = brIn.readLine();
        System.out.println("echo: " + strFromServer);
        if (strFromServer.endsWith("Ajde bok!"))
          break;
      }
    } catch (UnknownHostException e) {
      LOG.error("Can not find host.", e);
    } catch (IOException e) {
      LOG.error("Error in communication with server.", e);
    }
  }
}

package hr.fer.ilj;

import java.util.Spliterator;

public class Protocol {
  int iCounter;

  public static final String astrResponse[] = new String[] {
      "Nemoj otici!",
      "Neeeeee!!! Ne ostavljaj me!"
  };

  public static final String strEndMessage = "Ajde bok!";

  public String processInput(String strIn) {
	  String result = "";
	  result += "<div>";
	  result += strIn;
	  result += "</div>";
	  return result;
	  

  }
  
 public String extractPath(String input) {
	 String[] splitString=input.split(" ");
	 return splitString[1].substring(1);
 }
}
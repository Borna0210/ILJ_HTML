package hr.fer.ilj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProtocolTester {
	
	@Test
	public void Test1 () throws Exception {
		String expected="<div>GET / HTTP/1.1</div>";
		Protocol ptest=new Protocol();
		
		assertEquals(expected, ptest.processInput("GET / HTTP/1.1"));
		
	}
	
	@Test
	public void Test2 () throws Exception {
		String expected="C:/Faks/5.%20semestar/ILJ/Git/ilj-tdd-template/src/main/resources/a.html";
		Protocol ptest=new Protocol();
		
		assertEquals(expected, ptest.extractPath("GET /C:/Faks/5.%20semestar/ILJ/Git/ilj-tdd-template/src/main/resources/a.html HTTP/1.1"));
		
	}
	
	@Test
	public void Test3 () throws Exception {
		String expected="C:/Faks/5.%20semestar/ILJ/Git/ilj-tdd-template/src/main/resources/a.html";
		Protocol ptest=new Protocol();
		
		assertEquals(expected, ptest.extractPath("GET /C:/Faks/5.%20semestar/ILJ/Git/ilj-tdd-template/src/main/resources/a.html HTTP/1.1"));
		
	}
	
}

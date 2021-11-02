package hr.fer.ilj;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class HtmlGeneratorTester {
	
	@Test
	public void Test1 () {
		String expected = "<div><ul><li>File 1</li><li>File 2</li></ul></div>";
		assertEquals(expected, HtmlGenerator.generateHtml(new ArrayList<String>()));
		
	}
	
}

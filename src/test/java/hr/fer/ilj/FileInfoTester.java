package hr.fer.ilj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FileInfoTester {
	@Test
	public void test1() {
		String expected = "a.html";
		assertEquals(expected, FileInfo.returnPathInfo("C:\\Faks\\5. semestar\\ILJ\\Git\\ilj-tdd-template\\src\\main\\resources\\a.html"));
	}

}

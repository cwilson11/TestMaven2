package test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.second.StringConcat;

public class TestString {
	
	@Test
	public void testSize() {
		StringConcat mo = new StringConcat();
		int actual = mo.size("Test");
		int expected = 4;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testConcat() {
		StringConcat mo = new StringConcat();
		String actual = mo.concat("Cat", "Dog");
		String expected = "CatDog";
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testContains() {
		StringConcat mo = new StringConcat();
		boolean actual = mo.contains("This is a dog", "dog");
		boolean expected = true;
		assertEquals(expected, actual);
		
	}

	
	

}

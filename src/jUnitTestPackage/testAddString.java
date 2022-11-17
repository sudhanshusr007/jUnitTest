package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunction junits = new jUnitFunction();
		String result = junits.addStrings("Man","kind");
		assertEquals("Mankind",result);
	}

}

package com.test;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Test.*;

public class Test1 {
	@Test
	public void testName()
	{
		String name="manisha";
		String name1="manish";
		String c1="Eviden";
		String c2="Eviden";
		assertEquals(name, name1);
		assertEquals(c1,c2);
	}
}

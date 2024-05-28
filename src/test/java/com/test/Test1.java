package com.test;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Test.*;

public class Test1 {
	@Test
	public void testName()
	{
		String name="manisha";
		String name1="manisha";
		String c1="Eviden";
		String c2="Eviden1";
		assertEquals(name, name1);
		assertEquals(c1,c2);
	}
}

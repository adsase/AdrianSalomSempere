package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Mayor;

public class pruebamayor {

	Mayor datos= new Mayor();
	@Before
	public void setUp() throws Exception {
		datos.setA(40);
		datos.setB(10);
	}
	
	@Test
	public void test() {
		assertEquals(50,datos.mayor());
	}

}

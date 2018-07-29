package pruebas;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import cribaeratostenes.CribaEratostenes;

public class CribaEratostenesTest {

	@Test
	public void pruebaLimitesInferiores() {
		assertEquals("[]", Arrays.toString(CribaEratostenes.generaCriba(0)));
		assertEquals("[]", Arrays.toString(CribaEratostenes.generaCriba(1)));
	}
	
	@Test
	public void pruebaMetodo() {
		assertEquals("[2, 3, 5]", Arrays.toString(CribaEratostenes.generaCriba(5)));
		assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(CribaEratostenes.generaCriba(15)));
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]", Arrays.toString(CribaEratostenes.generaCriba(100)));
	}

}

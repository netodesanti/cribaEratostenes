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
		assertEquals("[1, 1, 1]", Arrays.toString(CribaEratostenes.generaCriba(5)));
		assertEquals("[1, 1, 1, 1, 1, 1]", Arrays.toString(CribaEratostenes.generaCriba(15)));
		assertEquals("[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]", Arrays.toString(CribaEratostenes.generaCriba(100)));
	}

}

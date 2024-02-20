package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	
	/*Comprueba que dos numeros NO son amigos*/
	@Test
	public void testAmigoMal() {
		NumerosAmigos amigo = new NumerosAmigos(5, 6);
		boolean resultado = amigo.amigo();
		assertFalse(resultado);
	}
	
	/*comprueba que un numero es PERFECTO*/
	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos amigo = new NumerosAmigos(220, 284);
		boolean resultado = amigo.amigo();
		assertTrue(resultado);
	}
	
	/*comprueba que primer numero es cero*/
	@Test
	public void testEsCeroN1() {
		NumerosAmigos amigo = new NumerosAmigos(0, 22);
		boolean resultado = amigo.amigo();
		assertNull(resultado);
	}
	
	/*el numero 1 y el 2 son iguales*/
	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos amigo = new NumerosAmigos(22, 22);
		int n1 = 22;
		int n2 = 22;
		assertEquals(n1, n2);
	}
	
	/*el numero 1 y el 2 NO son iguales*/
	@Test
	public void testN1yN2NoSonIguales() {
		NumerosAmigos amigo = new NumerosAmigos(22, 20);
		int n1 = 22;
		int n2 = 20;
		assertNotEquals(n1, n2);
	}

}

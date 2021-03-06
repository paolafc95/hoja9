import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Jorge Azmitia , 15202
 * @author Carlos Calderon,15219
 * @version 1.0
 * Clase para probar los metodos de insercion y busqueda para HashMap.
 */
public class AsociacionTest {
	/* Atributos*/
	public Asociacion<String, String> arbol = new Asociacion<String, String>();
	
	/**
	 * Probar metodo de busqueda.
	 */
	@Test
	public void testGet() {
		arbol.put("nombre", "name");
		assertEquals(arbol.get("nombre"), "name");
	}

	/**
	 * Probar metodo de insercion.
	 */
	@Test
	public void testPut() {
		arbol.put("nombre", "name");
		assertEquals(arbol.contains("nombre"), true);
	}

}

/**
 * @author Jorge Azmitia,15202
 * @author Carlos Calderon,15219
 * @version 1.0
 * Fabrica de implementaciones.
 * 
 */
public class Factory implements MapeoFactory {

	/* (non-Javadoc)
	 * @see MapeoFactory#getMapeo(java.lang.String)
	 */
	public Mapeo getMapeo(String tipoMapeo) {
		if ("HS".equalsIgnoreCase(tipoMapeo)) {
			return new Asociacion<String, String>();
		}
		if ("SP".equalsIgnoreCase(tipoMapeo)) {
			return new SplayBST<String, String>();

		}

		return null;
	}

}

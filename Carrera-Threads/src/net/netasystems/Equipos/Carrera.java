package net.netasystems.Equipos;

// TODO: Auto-generated Javadoc
/**
 * The Class Carrera.
 */
public class Carrera {

	/** The flag taken. */
	private boolean flagTaken = false;
	
	/**
	 * Aquire flag.
	 *
	 * @param threadName the thread name
	 * @return true, if successful
	 */
	public synchronized boolean aquireFlag(String threadName) {
		if(flagTaken) {
			return false;
		}
		System.out.println("La bandera fue tomada por:  "+threadName);
		flagTaken = true;
		return true;
	}
	
	/**
	 * Release flag.
	 */
	public void releaseFlag() {
		flagTaken = false;
	}
	
}

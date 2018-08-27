package net.netasystems.Main;
import net.netasystems.Corredores.*;
import net.netasystems.Equipos.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Carrera de Netasystems!!!!");
		Carrera carrera = new Carrera();
		Equipo eqAzul = new Equipo(carrera, "Azul");
		Equipo eqAmarillo = new Equipo(carrera, "Amarillo");
		Thread teqAz = new Thread(eqAzul);
		Thread teqAm = new Thread(eqAmarillo);
		teqAm.start();
		teqAz.start();
	}

}

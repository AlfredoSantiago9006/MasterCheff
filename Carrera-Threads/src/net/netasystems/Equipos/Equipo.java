package net.netasystems.Equipos;
import java.util.ArrayList;
import java.util.List;

import net.netasystems.Corredores.*;


// TODO: Auto-generated Javadoc
/**
 * The Class Equipo.
 */
public class Equipo implements Runnable {
	
	/** The corredores. */
	private List<Corredor> corredores;
	
	/** The name. */
	private String name;
	
	/** The carrera. */
	private Carrera carrera;
	
	/** The pendientes. */
	private int pendientes = 10;
	
	/**
	 * Instantiates a new equipo.
	 *
	 * @param carrera the carrera
	 * @param name the name
	 */
	public Equipo(Carrera carrera, String name){
		this.name = name;
		this.carrera = carrera;
		corredores = new ArrayList<>();
		for(int i = 0; i<pendientes; i++) {
			Corredor c = new Corredor(carrera, this.name +"_Corredor:"+ i, this);
			corredores.add(c);
		}
	}
	
	/**
	 * Corredor termina.
	 */
	public void corredorTermina() {
		this.pendientes--;
		if(pendientes == 0) {
			System.out.println("El equipo: "+this.name + " ha terminado!!!!");
			
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Equipo: "+carrera + " ha iniciado!!!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(Corredor c : corredores) {
			Thread t = new Thread(c);
			t.start();
		}
		
	}

}

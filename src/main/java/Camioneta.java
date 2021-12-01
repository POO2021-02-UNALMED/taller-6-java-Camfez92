package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	private static int cantidadCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		setVolco(volco);
		cantidadCamionetas++;
	}

	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}

	public void setCantidadCamionetas(int cantidadCamionetas) {
		this.cantidadCamionetas = cantidadCamionetas;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
}

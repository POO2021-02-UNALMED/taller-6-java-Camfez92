package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> listaPaises = new ArrayList<>();
	private int ventas;
	
	public Pais(String nombre){
		setNombre(nombre);
		//listaPaises.add(this);
		if(!listaPaises.contains(this)) {
		       listaPaises.add(this);
		}
		else {
			this.ventas++;
		}
	}
	
	public static Pais paisMasVendedor() {
		
		Pais mayor = listaPaises.get(0);
        for(Pais p: listaPaises){
            if(p.getCantidadVentas() > mayor.getCantidadVentas()){
                mayor = p;
            }
        }
        return mayor;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static ArrayList<Pais> getListaPaises() {
		return listaPaises;
	}

	public static void setListaPaises(ArrayList<Pais> listaPaises) {
		Pais.listaPaises = listaPaises;
	}

	public int getCantidadVentas() {
		return ventas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.ventas = cantidadVentas;
	}
	

}

package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> listaFabricantes = new ArrayList<>();
	private int ventas;
	
	public Fabricante(String nombre, Pais pais) {
		setNombre(nombre);
		setPais(pais);
		listaFabricantes.add(this);
	}
	
	public static Fabricante fabricaMayorVentas(){
        Fabricante mayor = listaFabricantes.get(0);
        for(Fabricante f: listaFabricantes){
            if(f.getCantidadVentas() > mayor.getCantidadVentas()){
                mayor = f;
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
		
	}
	
	public int getCantidadVentas() {
		return ventas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.ventas = cantidadVentas;
	}
}

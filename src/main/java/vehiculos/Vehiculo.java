package vehiculos;
import java.util.ArrayList;
import java.util.Collections;
public class Vehiculo {
	public static ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	public static int CantidadVehiculos;
	public static ArrayList<Pais> paises = new ArrayList<Pais>();
	public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		CantidadVehiculos++;
		listado.add(this);
	}
	public String getPlaca(){
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	public int getPuertas(){
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	public int getVelocidadMaxima(){
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getPrecio(){
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPeso(){
		return peso;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	public String getTraccion(){
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	public Fabricante getFabricante(){
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int CV) {
		CantidadVehiculos=CV;
	}
	public static void vehiculosPorTipo() {
		System.out.println("Automoviles: "+Automovil.CantidadAutomovil+"\nCamionetas: "+Camioneta.CantidadCamioneta+"\nCamiones: "+Camion.CantidadCamion);
	}
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
		ArrayList<Integer> cantporfab = new ArrayList<Integer>();
		for (int l=0;l<listado.size();l++) {
			Fabricante f=listado.get(l).getFabricante();
			if (!fabricantes.contains(f)) {
				fabricantes.add(f);
				int ci=0;
				for (int t=0;t<listado.size();t++) { 
					Fabricante d=listado.get(t).getFabricante();
					if(d.equals(f)) {
						ci++;
					}
				}
				cantporfab.add(ci);
			}
		}
		Integer maximo = Collections.max(cantporfab); //maximo numero de veces que se repite un fabricante
		for (int j=0;j<cantporfab.size();j++) {
			if(cantporfab.get(j)==maximo) {
				return fabricantes.get(j);
			}
		}
		return null;
		
	}
	public static Pais PaisMasVendedor() {
		ArrayList<Pais> paises = new ArrayList<Pais>();
		ArrayList<Integer> cantporPais = new ArrayList<Integer>();
		for (int i=0;i<listado.size();i++) {
			Pais a=listado.get(i).getFabricante().getPais();
			if (!paises.contains(a)) {
				paises.add(a);
				int vi=0;
				for (int t=0;t<listado.size();t++) { 
					Pais c=listado.get(t).getFabricante().getPais();
					if(c.equals(a)) {
						vi++;
					}
				}
				cantporPais.add(vi);
			}
		}
		Integer maximo = Collections.max(cantporPais); //maximo numero de veces que se repite un pais
		for (int g=0;g<cantporPais.size();g++) {
			if(cantporPais.get(g)==maximo) {
				return paises.get(g);
			}
		}
		return null;
	}
}

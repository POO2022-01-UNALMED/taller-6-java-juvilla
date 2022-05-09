package vehiculos;
import java.util.ArrayList;
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
	static int CantidadVehiculos;
	public static ArrayList<Pais> paises = new ArrayList<Pais>();
	Vehiculo(){
		CantidadVehiculos++;
		listado.add(this);
	}
	String getPlaca(){
		return placa;
	}
	void setPlaca(String placa) {
		this.placa=placa;
	}
	int getPuertas(){
		return puertas;
	}
	void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	int getVelocidadMaxima(){
		return velocidadMaxima;
	}
	void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	String getNombre(){
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	int getPrecio(){
		return precio;
	}
	void setPrecio(int precio) {
		this.precio=precio;
	}
	int getPeso(){
		return peso;
	}
	void setPeso(int peso) {
		this.peso=peso;
	}
	String getTraccion(){
		return traccion;
	}
	void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	Fabricante getFabricante(){
		return fabricante;
	}
	void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
	int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	void setCantidadVehiculos(int CV) {
		CantidadVehiculos=CV;
	}
	static void vehiculosPorTipo() {
		System.out.println("Automoviles: "+Automovil.CantidadAutomovil+"\nCamionetas: "+Camioneta.CantidadCamioneta+"\nCamiones: "+Camion.CantidadCamion);
	}
	static void PaisMasVendedor() {
		for (int i=0;i<listado.size();i++) {
			Fabricante a=listado.get(i).getFabricante();
			listado.get(i).getFabricante();
		}
	}
	public static void main(String[] args) {
		Fabricante b=new Fabricante();
		Automovil a=new Automovil("aaaaaaaaa","aaaaaaaaaaa",1,1,b,12);
		Automovil C=new Automovil("aaaaaaaaa","aaaaaaaaaaa",1,1,b,12);
		Camioneta D=new Camioneta("a",1,"a",1,1,b,true);
		Vehiculo.vehiculosPorTipo();
		Vehiculo.PaisMasVendedor();
	}
}

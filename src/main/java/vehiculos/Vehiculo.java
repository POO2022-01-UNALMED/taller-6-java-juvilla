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
	public static int CantidadVehiculos;
	public static ArrayList<Pais> paises = new ArrayList<Pais>();
	public Vehiculo(){
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
	public static void PaisMasVendedor() {
		for (int i=0;i<listado.size();i++) {
			Fabricante a=listado.get(i).getFabricante();
			listado.get(i).getFabricante();
		}
	}
	/*public static void main(String[] args) {
		Fabricante b=new Fabricante();
		Automovil a=new Automovil("aaaaaaaaa","aaaaaaaaaaa",1,1,b,12);
		Automovil C=new Automovil("aaaaaaaaa","aaaaaaaaaaa",1,1,b,12);
		Camioneta D=new Camioneta("a",1,"a",1,1,b,true);
		Vehiculo.vehiculosPorTipo();
		Vehiculo.PaisMasVendedor();
	}*/
}

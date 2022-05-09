package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	public static int CantidadAutomovil;
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos){
		super();
		setPlaca(placa);
		setPuertas(4);
		setVelocidadMaxima(100);
		setNombre(nombre);
		setPrecio(precio);
		setPeso(peso);
		setTraccion("FWD");
		setFabricante(fabricante);
		setPuestos(puestos);
		CantidadAutomovil++;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos=puestos;
	}
	public static int getCantidadAutomovil() {
		return CantidadAutomovil;
	}
	public static void setCantidadAutomovil(int Ca) {
		CantidadAutomovil=Ca;
	}
}
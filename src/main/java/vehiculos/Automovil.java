package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	public static int CantidadAutomovil;
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
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
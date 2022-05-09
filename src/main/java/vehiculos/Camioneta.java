package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	public static int CantidadCamioneta;
	public Camioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,boolean volco){
		super();
		setPlaca(placa);
		setPuertas(puertas);
		setVelocidadMaxima(90);
		setNombre(nombre);
		setPrecio(precio);
		setPeso(peso);
		setTraccion("4X4");
		setFabricante(fabricante);
		setVolco(volco);
		CantidadCamioneta++;
	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco=volco;
	}
	public int getCantidadCamioneta() {
		return CantidadCamioneta;
	}

}

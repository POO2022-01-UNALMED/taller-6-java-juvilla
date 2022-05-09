package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	public static int CantidadCamioneta;
	Camioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,boolean volco){
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
	boolean isVolco() {
		return volco;
	}
	void setVolco(boolean volco) {
		this.volco=volco;
	}
	int getCantidadCamioneta() {
		return CantidadCamioneta;
	}

}

package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	public static int CantidadCamion;
	public Camion(String placa,String nombre,int precio,int peso,Fabricante fabricante,int ejes){
		super();
		setPlaca(placa);
		setPuertas(2);
		setVelocidadMaxima(80);
		setNombre(nombre);
		setPrecio(precio);
		setPeso(peso);
		setTraccion("4X2");
		setFabricante(fabricante);
		setEjes(ejes);
		CantidadCamion++;
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes=ejes;
	}
	public int getCantidadCamion() {
		return CantidadCamion;
	}

}

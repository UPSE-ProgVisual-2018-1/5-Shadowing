
public class Mamifero extends Animal {

	protected float peso;
	protected int numeroMamas = 0;
	
	public Mamifero(String nombre, float peso, int numeroMamas) {
		super(nombre, peso);
		this.numeroMamas = numeroMamas;
	}
	
	public float cantidadLechePorRacion(float peso)
	{
		float cantidadLecheAServir = 0;
		cantidadLecheAServir = (float) (1.5 * peso);
		return cantidadLecheAServir;
	}
}

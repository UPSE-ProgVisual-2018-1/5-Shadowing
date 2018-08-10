
public class Felino extends Mamifero {

	TipoCamuflage camuflaje;
	protected float peso;

	public Felino(String nombre, float peso, int numeroMamas) {
		super(nombre, peso, numeroMamas);
		// TODO Auto-generated constructor stub
	}
	
	public float calcularTamanoPresa(float peso)
	{
		float tamanoPeso = (float) (0.25 * this.peso);
		return tamanoPeso;
	}
	
	public void printPesos(float peso)
	{
		System.out.println("Peso parametro: " + peso);
		System.out.println("Peso felino: " + this.peso);
		System.out.println("Peso mamifero: " + super.peso);
		System.out.println("Peso animal: " + peso); //Buscar identificador de acceso.
	}
	
	public class EnfermedadFelina{
		private float peso;
		
		public void determinarProbabilidadEnfermo(float peso)
		{
			//Como hacer referenciar al peso del felino (y tambien del mamifero).
			if(peso>20)
			{
				System.out.println("Enfermo");
			}else {
				System.out.println("No enfermo");
			}
		}
	}
}

package ExercicioAnimal;

public class Pregui�a extends Animal {
	
	public Pregui�a() {
		super("Animal Pregui�a");
		
	}

	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nQual o nome da Pregu�a:" +nomeAnimal);
		
		
	}

	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nQuantos anos a Pregui�a tem:" +idadeAnimal);
		
	}

	@Override
	public void som(String somAnimal) {
		System.out.println("\nQual o som que a pregui�a emite :" +somAnimal);
		
	}
	
	public void SubirArvores() {
		System.out.println("\nUma das caracteristicas da pregui�a � subir em �rvores altas e verdes!!!!");
		
	}

}

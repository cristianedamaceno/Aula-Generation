package orienta��oObjetosJava;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		
		//instanciando um objeto da classe//
		
		Cliente auto1 = new Cliente("CristianeDamaceno"," Rua Cuitel�o - Santo andr�","cal�a preta");
		
			auto1.imprimirInfo();
			
			System.out.println("\nTroca feita com sucesso!!!! Volte Sempre");
				
			auto1.setcomprafeita("Cal�a rosa");
			auto1.imprimirInfo();
			
			
			
			Cliente auto2 = new Cliente("Kaleb Damaceno","Rua Cuitel�o - Santo Andr�", "camisa azul");
			
			
				auto2.imprimirInfo();
				
				System.out.println("\nTroca feita com sucesso!!!! Volte sempre");
				
				
				auto2.setcomprafeita("Camiseta preta");
				auto2.imprimirInfo();
				
				
			
		
	}

}

package orienta��oObjetosJava;

public class Cliente {
	// declara��o dos atributos de classe 
	
		private String nomeCliente;
		private String endere�o;
		private String comprafeita;
			
		
			// declarar o m�todo construtor 
		
				public Cliente(String nomeCliente, String endere�o, String comprafeita)
				{
					
					this.nomeCliente = nomeCliente;
					this.endere�o = endere�o;
					this.comprafeita = comprafeita;
					
				}
				
				
				//declara��o dos demais m�todos da classe 
				
				public void imprimirInfo()
				{
					System.out.println("\n" +nomeCliente+ " residente em " +endere�o+ " tem a compra feita de um(a) " +comprafeita );
					
				}
				
				//cria��o dos m�todos get e set//
				
				public String getnomeCliente() {
					return nomeCliente;
					
				}
			    	
				public void setnomeCliente(String nomeCliente) {
					this.nomeCliente = nomeCliente;
					
				}
				
				public String getendere�o() {
					return endere�o;
					
				}
				
				public void setendere�o(String endere�o) {
					this.endere�o = endere�o;
					
				} 
				
				public String getcomprafeita() {
					return comprafeita;
					
				} 
				
				public void setcomprafeita(String comprafeita) {
					this.comprafeita = comprafeita;
					
					
				}
	}

	
	
	

package orienta��oObjetosJava;

public class Funcionario {
	
	
	private String nomeFuncionario;
	private String idadeFuncionario;
	private String endere�oFuncionario;
	
			public Funcionario (String nomeFuncionario, String idadeFuncionario, String endere�oFuncionario) {
		
				this.nomeFuncionario = nomeFuncionario;
				this.idadeFuncionario = idadeFuncionario;
				this.endere�oFuncionario = endere�oFuncionario;
				
			}
			
			public void imprimirInfo()
			{
				System.out.println("\n" +nomeFuncionario+ " tem a idade " +idadeFuncionario+ " e mora em " + endere�oFuncionario );
				
			}

			public String getNomeFuncionario() {
				return nomeFuncionario;
			}

			public void setNomeFuncionario(String nomeFuncionario) {
				this.nomeFuncionario = nomeFuncionario;
			}

			public String getIdadeFuncionario() {
				return idadeFuncionario;
			}

			public void setIdadeFuncionario(String idadeFuncionario) {
				this.idadeFuncionario = idadeFuncionario;
			}

			public String getEndere�oFuncionario() {
				return endere�oFuncionario;
			}

			public void setEndere�oFuncionario(String endere�oFuncionario) {
				this.endere�oFuncionario = endere�oFuncionario;
			}
			
			
	
	

}

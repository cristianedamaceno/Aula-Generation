package orientašŃoObjetosJava;

public class Funcionario {
	
	
	private String nomeFuncionario;
	private String idadeFuncionario;
	private String enderešoFuncionario;
	
			public Funcionario (String nomeFuncionario, String idadeFuncionario, String enderešoFuncionario) {
		
				this.nomeFuncionario = nomeFuncionario;
				this.idadeFuncionario = idadeFuncionario;
				this.enderešoFuncionario = enderešoFuncionario;
				
			}
			
			public void imprimirInfo()
			{
				System.out.println("\n" +nomeFuncionario+ " tem a idade " +idadeFuncionario+ " e mora em " + enderešoFuncionario );
				
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

			public String getEnderešoFuncionario() {
				return enderešoFuncionario;
			}

			public void setEnderešoFuncionario(String enderešoFuncionario) {
				this.enderešoFuncionario = enderešoFuncionario;
			}
			
			
	
	

}

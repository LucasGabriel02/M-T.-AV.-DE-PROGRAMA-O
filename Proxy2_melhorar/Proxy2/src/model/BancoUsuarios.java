package model;

//abstract ou interface
public class BancoUsuarios {
	
	
	private BancoUsuarioImplementa BancoUsuarios;

	public BancoUsuarios() {
		
	}

	public String getUsuario() {
		return new String("Usuario: " + getUsuario());
	}

	public String getSenha() {
		return new String("Senha: " + getSenha());
	}
}

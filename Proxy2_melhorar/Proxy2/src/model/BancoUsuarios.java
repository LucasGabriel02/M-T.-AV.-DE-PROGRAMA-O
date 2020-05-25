package model;

//abstract ou interface

public abstract class BancoUsuarios implements BancoUsuarioImplementa {
	
	
	private BancoUsuarioImplementa BancoUsuarios;

	public BancoUsuarios() {
		
	}

	public String getUsuario() {
		return new String("Usuario: " + getUsuario());
	}

	public String getSenha() {
		return new String("Senha: " + getSenha());
	}

	public BancoUsuarioImplementa getBancoUsuarios() {
		return BancoUsuarios;
	}

	public void setBancoUsuarios(BancoUsuarioImplementa bancoUsuarios) {
		BancoUsuarios = bancoUsuarios;
	}
}

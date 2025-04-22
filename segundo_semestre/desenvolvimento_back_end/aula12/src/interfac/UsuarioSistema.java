package interfac;

public class UsuarioSistema implements Autoriza, Autentica {

	private String usuario;
	private String senha;
	private String[] permissoes; 
	
	
	public UsuarioSistema() {}


	public UsuarioSistema(String usuario, String senha, String[] permissoes) {
		this.usuario = usuario;
		this.senha = senha;
		this.permissoes = permissoes;
	}


	@Override
	public boolean autenticar(String usuario, String senha) {
		//Autentica se o nome do usuàrio e senha estão corretos
		return this.usuario.equals(usuario) && this.senha.equals(senha);
	}

	@Override
	public boolean varificarPermissao(String acao) {
		// Verifica se o usuário tem a permissão para a ação solicitada
		for (String permissao : permissoes) {
			if (permissao.equals(acao)) {
				return true;
			}
		}
		return false;
	}

}

package interfac;

public class Main {

	public static void main(String[] args) {
		// Craindo usuário com permissões
		String[] permissoes = {"LEITURA", "ESCRITA"};
		
		UsuarioSistema usuario = new UsuarioSistema("admin", "1234", permissoes);
		
		//Testando a autenticação
		if (usuario.autenticar("admin", "1234")) {
			System.out.println("Usuário autenticado com sucesso!");
			
			
			//Verificando permissões
			if (usuario.varificarPermissao("LEITURA")) {
				System.out.println("Usuário tem permissão para realizar leitura.");
			} else {
				System.out.println("Usuário NÃO tem permissão para realizar leitura.");
			}
			
			if (usuario.varificarPermissao("ESCRITA")) {
				System.out.println("Usuário tem permissão para realizar escrita.");
			} else {
				System.out.println("Usuário NÃO tem permissão para realizar escrita.");
			}
			
			if (usuario.varificarPermissao("DELETE")) {
				System.out.println("Usuário tem permissão para realizar delete.");
			} else {
				System.out.println("Usuário NÃO tem permissão para realizar delete.");
			}
		} else {
			System.out.println("Falha na autenticação.");
		}

	}

}

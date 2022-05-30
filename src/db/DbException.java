package db;

// Classe responsável pro tratar erros genéricos
public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg); // lança a mensagem para a classe pai(RuntimeException)
	}

}

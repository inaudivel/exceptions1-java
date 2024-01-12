package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	//permite que instaceie a exceção personalizada, passando uma mensagem(armazenado a mensagem)
	public DomainException(String msg) {
		super(msg);
	}

}

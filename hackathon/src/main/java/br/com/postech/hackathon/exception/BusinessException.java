package br.com.postech.hackathon.exception;

public class BusinessException extends ApplicationException {
	private static final long serialVersionUID = 1L;

    public BusinessException(String mensagem) {
        super(mensagem);
    }

    public BusinessException(String mensagem, Throwable cause) {
        super(mensagem, cause);
    }

}

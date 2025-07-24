package util;

public class ExcecaoCustomizada extends Exception {
    private static final long serialVersionUID = 1L;

    public ExcecaoCustomizada(String mensagem) {
        super(mensagem);
    }
}

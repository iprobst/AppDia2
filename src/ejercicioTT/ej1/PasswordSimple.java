package ejercicioTT.ej1;

public class PasswordSimple extends Password{
    private String regex = "s";
    public PasswordSimple() {
        super(".{4,20}$");
    }
}

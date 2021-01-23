package ejercicioTT.ej1;

import java.util.regex.*;

public class Password {

    private String pass;
    private String passPattern;
    Pattern pattern;

    public Password(String regex) {
        this.passPattern = regex;
        this.pattern = Pattern.compile(passPattern);
    }

    public void setValue(String pwd){
        if(isPassValid(pwd)){
            System.out.println("Password correcta");
            this.pass = pwd;
        }else{
            throw new PatternSyntaxException("La password no cumple los requisitos de segurdiad", passPattern, -1);
        }
    }

    public boolean isPassValid(String password){
        Matcher matcher = this.pattern.matcher(password);
        return matcher.matches();
    }
}

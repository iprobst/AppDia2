package ejercicioTT.ej1;

public class Main {
    public static void main(String[] args) {
        Password ps1 = new Password("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        ps1.setValue("A!@#&()–a1");
        Password ps2 = new Password("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{4,20}$");
        ps2.setValue("Pass1");
        PasswordSimple psS1 = new PasswordSimple();
        psS1.setValue("1234");
        PasswordIntermedia psI1= new PasswordIntermedia();
        try{
            psI1.setValue("1234");//incorrecta
        }catch (Exception e){
            System.out.println("Password incorrecta");
            e.getStackTrace();
        }
        psI1.setValue("Hola123");
        PasswordFuerte psF1 = new PasswordFuerte();
        try {
            psF1.setValue("hoLa123");//incorrecta
        }catch (Exception e){
            System.out.println("Password incorrecta");
            e.getStackTrace();
        }
        psF1.setValue("Hol12!.F");

    }
}

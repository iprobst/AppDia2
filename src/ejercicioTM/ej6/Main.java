package ej6;

public class Main {

    public static void main(String[] args) {
        String prueba = "  hola";
        System.out.println("prueba = " + prueba);
        prueba = StringUtil.lTrim(prueba);
        System.out.println("prueba = " + prueba);
        prueba += "   ";
        System.out.println("prueba = " + prueba + ";");
        prueba = StringUtil.rTrim(prueba);
        System.out.println("prueba = " + prueba + ";");
        prueba = "   " + prueba + "    ";
        System.out.println("prueba = " + prueba + ";");
        prueba = StringUtil.trim(prueba);
        System.out.println("prueba = " + prueba + ";");
        prueba = "John|Paul|George|Ringo";
        System.out.println(StringUtil.indexOfN(prueba, 'o', 3));
    }

    }
}

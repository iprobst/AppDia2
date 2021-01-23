package ejercicioTT.ej2;

public class Util {
    public static double areaPromedio(FiguraGeometrica arr[]) {
        double total = 0;
        double promedio =  0;
        for (FiguraGeometrica fig: arr) {
            total += fig.area();
        }
        promedio = total / arr.length;
        return promedio;
    }
}

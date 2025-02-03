package Math;
public class Matematico extends Doctor{


    public static Vector sumar(Vector v1, Vector v2){
        Vector resultado;

        float resultadoC1 = sumar(v1.getComponente1(),v2.getComponente1());
        float resultadoC2 = sumar(v1.getComponente2(),v2.getComponente2());

        resultado = new Vector(resultadoC1, resultadoC2);

        return resultado;
    }
}
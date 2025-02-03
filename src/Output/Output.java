package Output;
public class Output {
    public void menu(){
        System.out.print("""
                         \n\nBienvenido a mi calculadora
                         
                         1. Suma
                         2. Resta
                         3. Multiplicacion
                         4. Division
                         5. Sumar dos vectores
                         6. Salir
                         
                         Ingresa el numero de la opcion a elegir:  """);
    }
    public void operando(){
        System.out.print("Ingrese el operando: ");
    }
    public void mostrarResultado(int resultado) {
        System.out.print("El resultado es: " + resultado);
    }
    public void mostrarError() {
        System.out.println("El operando 2 no se puede dividir en 0 ");
    }
    public void pedirOperandos() {
        System.out.println("Ingrese el operando: ");
    }
    public void pedirComponente() {
        System.out.println("Ingrese el componente: ");
    }
    public void salir() {
        System.out.println("¡Gracias por usar la calculadora!.");
    }

}
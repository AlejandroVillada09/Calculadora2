package Input;

import java.util.Scanner;
public class Input {

    private static int dato;

    private static void get (){
        Scanner scanner = new Scanner(System.in);
        dato = scanner.nextInt();
    }
    private static int getDato(){
        return dato;
    }
    public int  getOptionMenu(){
        return getDato();
    }
    public int getOperando(){
        get();
        return getDato();
    }
    public float getComponente(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
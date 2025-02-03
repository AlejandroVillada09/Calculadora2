package Math;
public class NumeroComplejo {
    private final float imaginaria;
    private final float real;

    public NumeroComplejo(){
        imaginaria = 0;
        real = 0;
    }

    public NumeroComplejo(float imaginaria, float real){
        this.imaginaria = imaginaria;
        this.real = real;
    }

    public float getImaginaria(){
        return imaginaria;
    }
    public float getReal(){
        return real;
    }

    @Override
    public String toString() {
        return "NumeroComplejo{" + "imaginaria=" + imaginaria + ", real=" + real + '}';
    }
}
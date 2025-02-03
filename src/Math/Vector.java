package Math;
public class Vector {
    private final float componente1;
    private final float componente2;

    public Vector(){
        componente1 = 0f;
        componente2 = 0f;
    }

    public Vector(float componente1, float componente2){
        this.componente1 = componente1;
        this.componente2 = componente2;
    }

    public float getComponente1(){
        return componente1;
    }

    public float getComponente2(){
        return componente2;
    }

    @Override
    public String toString() {
        return "(" + componente1 + " + " + componente2 + ")";
    }
}
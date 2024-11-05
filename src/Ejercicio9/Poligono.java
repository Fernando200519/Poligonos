package Ejercicio9;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados){
        this.numeroLados = numeroLados;
    }

    @Override
    public String toString(){
        return "Numero Lados = "+ numeroLados;
    }

    //Declaramos el metodo como abstracto
    public abstract double area();

}

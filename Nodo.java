package domain;

public class Nodo {

    private int valor;
    private Nodo nodoSiguiente;

    public Nodo(int valor){
        this.valor = valor;
        this.nodoSiguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}

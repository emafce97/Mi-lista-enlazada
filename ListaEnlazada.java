package domain;

public class ListaEnlazada {

    private Nodo primero;
    private Nodo ultimo;
    private int contador;

    public void agregar(int valor){
        if(this.primero == null){
            this.primero = new Nodo(valor);
            this.ultimo = this.primero;
        }else{
            this.ultimo.setNodoSiguiente(new Nodo(valor));
            this.ultimo = this.ultimo.getNodoSiguiente();
        }
        this.contador++;
    }

    public void listar(){
        Nodo cursor = this.primero;
        while(cursor != null){
            System.out.print(cursor.getValor() + " ");
            cursor = cursor.getNodoSiguiente();
        }
    }

    public int getCantElementos(){
        return this.contador;
    }
}

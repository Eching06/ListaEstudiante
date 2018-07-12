
package ListaEstudiantes;


public class Nodo {
    ObEstudiante objeto = new ObEstudiante();
    private Nodo siguiente;
    
    
    ;

    public Nodo(ObEstudiante objeto) {
        this.siguiente = null;
        this.objeto = objeto;
       
    }

    public ObEstudiante getObjeto() {
        return objeto;
    }

    public void setObjeto(ObEstudiante objeto) {
        this.objeto = objeto;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}


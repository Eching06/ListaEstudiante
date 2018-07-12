package ListaEstudiantes;

import java.io.FileWriter;
import javax.swing.JOptionPane;


  public class ListaEstudiantes {
    ObEstudiante objeto = new ObEstudiante();
    
     public int getTamanio() {
        return tam;
    }
    public boolean esVacia() {

        return inicio == null;

    }
    int max;
    private Nodo inicio;
    
    
    private int tam = 0, op = 0;

   public boolean buscar() {
   if(esVacia()){
       JOptionPane.showMessageDialog(null, "No se encuetran registros en la lista!");
   }
        
     Nodo aux = inicio;
     
     boolean encontrado = false;
     int buscar;
      while (aux != null && encontrado != true) {
      buscar = Integer.parseInt(JOptionPane.showInputDialog("Para buscar un estudiante Ingrese el n° de identificación"));

       if (buscar == aux.objeto.getCarnet()) {
        JOptionPane.showMessageDialog(null, "Estudiante encontrado");
        encontrado = true;

        } else {
        JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
        aux = aux.getSiguiente();
        }

       }
    
     return encontrado;
     }
                
    
    public ObEstudiante crearEstudiante(){
        
        String nom = JOptionPane.showInputDialog("Ingrese el nombre");
        
        String ape = JOptionPane.showInputDialog("Ingrese el apellido");
        
        String lugar = JOptionPane.showInputDialog("Ingrese el lugar de residencia");
        
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento");
       
        String tipoIden = JOptionPane.showInputDialog("Ingrese el tipo de indentificación");
        
        int carnet = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n° de identificación"));
        
        String trab = JOptionPane.showInputDialog("El estudiante se encuentra Trabajando actualmente?");
        
        ObEstudiante objeto1 = new ObEstudiante();
        objeto1.setNom(nom);
        objeto1.setApe(ape);
        objeto1.setLugar(lugar);
        objeto1.setFecha(fecha);
        objeto1.setTipoIden(tipoIden);
        objeto1.setCarnet(carnet);
        objeto1.setTrabaja(trab);
        
        return objeto1;
        
        
        
    }
    public ListaEstudiantes() {

        while (op != 8) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "OPciones del registro de estudiantes"
                    + "\n [1]Agregar Final"
                    + "\n [2]Agregar al inicio"
                    + "\n [3]Mostrar"
                    + "\n [4]Eliminar"
                    + "\n [5]Es vacia?"
                    + "\n [6]Buscar"
                    + "\n [7]Salir"));
            switch (op) {
                case 1: {         
                   ingresarAlFinal();
                   
                   break;
                }
                       
                case 2: {
                    ingresarAlInicio();
                    
                    break;
                }
                case 3: {
                    imprimirLista();

                    break;
                }
                       
                case 4: {
                    eliminar();
                    
                    break;
                }
                //es vacia              
                case 5: {
                   vacia();
                   
                    break;
                }

                case 6: {
                   buscar();
                   
                    break;
                }

                case 7: {
                    System.exit(0);
                    
                    break;
                }

            }
        }

    }
    
    public void ingresarAlFinal(){
        Nodo nuevo = new Nodo(crearEstudiante());
                    
                    
                    
                    
                    if (esVacia()) {
                        inicio = nuevo;
                    } else {
                        Nodo aux = inicio;
                        while (aux.getSiguiente() != null) {
                            aux = aux.getSiguiente();

                        }
                        aux.setSiguiente(nuevo);
                    }
                    tam++;
        
        
    }
    
    public void ingresarAlInicio(){
         Nodo nuevo = new Nodo(crearEstudiante());

                    
                    if (esVacia()) {
                        inicio = nuevo;
                    } else {
                        nuevo.setSiguiente(inicio);

                        inicio = nuevo;

                    }
                    tam++;
        
    }
    
    public void imprimirLista(){
        if (!esVacia()) {
                        Nodo aux = inicio;
                        int i = 0;
                        String listado="";
                        while (aux != null) {
                            
                            
                             listado += i+" = "+aux.getObjeto().toString() + "\n\n";
                            

                            aux = aux.getSiguiente();
                            i++;
                            JOptionPane.showMessageDialog(null, listado);
                            try {

                                FileWriter fichero = new FileWriter("backup.txt");
                                fichero.write(listado);
                                fichero.close();

                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }

                        }

                    }
        
    }
    
    public void eliminar(){
        inicio = null;
                    tam = 0;
                    JOptionPane.showMessageDialog(null, "Datos de estudiantes eliminados!");
                   
    }
    
    public void vacia(){
         if (esVacia()) {
                        JOptionPane.showMessageDialog(null, "La lista esta vacia!");

                    } else {
                        JOptionPane.showMessageDialog(null, "La lista contiene información!");
                    }
        
    }

}


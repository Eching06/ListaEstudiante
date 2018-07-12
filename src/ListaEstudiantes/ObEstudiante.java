/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEstudiantes;

public class ObEstudiante {
   
    private String nom,ape,lugar,fecha,tipoIden,trabaja;
    private int carnet;

    public ObEstudiante() {
        
    }
    
    ObEstudiante(String nom,String ape,String lugar,String fecha,String tipoIden,String trabaja, int carnet){
        setNom(nom);
        setApe(ape);
        setLugar(lugar);
        setFecha(fecha);
        setTipoIden(tipoIden);
        setTrabaja(trabaja);
        setCarnet(carnet);
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoIden() {
        return tipoIden;
    }

    public void setTipoIden(String tipoIden) {
        this.tipoIden = tipoIden;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    
    public String toString(){
        return "Nombre: "+getNom()+", "+getApe()+" Lugar:"+getLugar()+" Fecha:"+getFecha()
               +" Tipo de identificacón: "+getTipoIden()+" N de identificación: "+getCarnet()+" Trabaja: "+getTrabaja();
    }
   
    
}


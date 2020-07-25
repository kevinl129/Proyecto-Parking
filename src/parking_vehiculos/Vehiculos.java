
package parking_vehiculos;





public class Vehiculos {
    
    String Dueño;
    String Patente;
    String Tipo;
    String fecha;
    String hora;
 
    public Vehiculos(String Dueño, String Patente, String Tipo, String fecha, String hora) {
        this.Dueño = Dueño;
        this.Patente = Patente;
        this.Tipo = Tipo;
        this.fecha = fecha;
        this.hora=hora;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}

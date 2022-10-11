package beans;

import java.sql.Date;

public class Alquiler {
   private String username;
   private String id_vehiculo;
   private Date fecha;
   private int tiempo;
   private int costo;

    public Alquiler(String username, String id_vehiculo, Date fecha, int tiempo, int costo) {
        this.username = username;
        this.id_vehiculo = id_vehiculo;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.costo = costo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(String id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "username=" + username + ", id_vehiculo=" + id_vehiculo + ", fecha=" + fecha + ", tiempo=" + tiempo + ", costo=" + costo + '}';
    }
   
   
   
   
   
    
    
}

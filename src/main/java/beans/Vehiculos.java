
package beans;
public class Vehiculos {
    private String id_vehiculo;
    private String marca;
    private String modelo;
    private String color;

    public Vehiculos(String id_vehiculo, String marca, String modelo, String color) {
        this.id_vehiculo = id_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(String id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "id_vehiculo=" + id_vehiculo + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    
            
   
}


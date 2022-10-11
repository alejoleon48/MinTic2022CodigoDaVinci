
package beans;
public class Usuarios {
    private String username;
    private String contrasena;
    private String email;
    private String nombre;
    private String apellido;
    private String telefono;
    private String tipo_usuario;
    private int saldo;

    public Usuarios(String username, String contrasena, String email, String nombre, String apellido, String telefono, String tipo_usuario, int saldo) {
        this.username = username;
        this.contrasena = contrasena;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipo_usuario = tipo_usuario;
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "username=" + username + ", contrasena=" + contrasena + ", email=" + email + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", tipo_usuario=" + tipo_usuario + ", saldo=" + saldo + '}';
    }


}
   
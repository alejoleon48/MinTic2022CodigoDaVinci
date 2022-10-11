
package controller;

import java.util.Map;

public interface IUsuarioController {
    
    public String login (String username, String contrasena);
    public String register (String username, String email, String contrasena, String nombre,
            String apellido, String telefono, String tipo_usuario,int saldo);
}

